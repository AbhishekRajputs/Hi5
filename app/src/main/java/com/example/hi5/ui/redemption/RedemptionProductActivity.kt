package com.example.hi5.ui.redemption

import android.os.Bundle
import com.example.hi5.R
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityRedemptionProductBinding

/**
 * @author Pardeep Singh
 */
class RedemptionProductActivity : BaseActivity() {

    private val binding by lazy { ActivityRedemptionProductBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setContentView(R.layout.activity_redemption_product)

        binding.imgBack.setOnClickListener { onBackPressed() }
        binding.btnSave.setOnClickListener { onBackPressed() }
    }
}