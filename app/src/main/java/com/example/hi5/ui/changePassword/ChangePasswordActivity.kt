package com.example.hi5.ui.changePassword

import android.os.Bundle
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityChangePasswordBinding

/**
 * @author Pardeep Singh
 */
class ChangePasswordActivity : BaseActivity() {

    private val binding by lazy { ActivityChangePasswordBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.imgBack.setOnClickListener { onBackPressed() }
        binding.btnSave.setOnClickListener { onBackPressed() }
    }
}