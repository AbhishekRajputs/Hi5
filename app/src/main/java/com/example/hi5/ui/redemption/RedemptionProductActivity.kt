package com.example.hi5.ui.redemption

import android.os.Bundle
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityRedemptionProductBinding
import com.example.hi5.ui.reedeem.RedeemActivity
import com.example.hi5.utils.openActivity


class RedemptionProductActivity : BaseActivity() {

    private val binding by lazy { ActivityRedemptionProductBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.imgBack.setOnClickListener { onBackPressed() }
        binding.btnSave.setOnClickListener {
            openActivity(RedeemActivity::class.java)
            finish()
        }
    }
}