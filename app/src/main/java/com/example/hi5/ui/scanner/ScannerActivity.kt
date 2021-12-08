package com.example.hi5.ui.scanner

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.budiyev.android.codescanner.*
import com.example.hi5.R
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityScannerBinding


class ScannerActivity : BaseActivity() {

    private lateinit var codeScanner: CodeScanner
    private val binding by lazy { ActivityScannerBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvBackScanner.setOnClickListener { onBackPressed() }
        val s = findViewById<CodeScannerView>(R.id.scanner_view)
        codeScanner = CodeScanner(this, s)
        // Parameters (default values)
        codeScanner.camera = CodeScanner.CAMERA_BACK // or CAMERA_FRONT or specific camera id
        codeScanner.formats = CodeScanner.ALL_FORMATS // list of type BarcodeFormat,
        // ex. listOf(BarcodeFormat.QR_CODE)
        codeScanner.autoFocusMode = AutoFocusMode.SAFE // or CONTINUOUS
        codeScanner.scanMode = ScanMode.SINGLE // or CONTINUOUS or PREVIEW
        codeScanner.isAutoFocusEnabled = true // Whether to enable auto focus or not
        codeScanner.isFlashEnabled = false // Whether to enable flash or not
        // Callbacks
        codeScanner.decodeCallback = DecodeCallback {
            runOnUiThread {
                val intent = Intent()
                intent.putExtra("coupon", it.text)
                setResult(120, intent)
                finish()
            }
        }
        codeScanner.errorCallback = ErrorCallback { // or ErrorCallback.SUPPRESS
            runOnUiThread {
                Toast.makeText(
                    this, "Camera initialization error: ${it.message}",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
        binding.scannerView.setOnClickListener {
            codeScanner.startPreview()
        }
    }

    override fun onResume() {
        super.onResume()
        codeScanner.startPreview()
    }
}