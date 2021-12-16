package com.example.hi5.ui.reedeem

import android.os.Bundle
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityRedeemBinding
import com.example.hi5.ui.dashboard.DashboardActivity
import com.example.hi5.utils.openActivity

class RedeemActivity : BaseActivity() {

    private val binding by lazy { ActivityRedeemBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.imgBack.setOnClickListener { onBackPressed() }
        binding.btnSave.setOnClickListener {
            openActivity(DashboardActivity::class.java)
            finishAffinity()
        }
    }
}