package com.example.hi5.ui.redeem_history

import android.os.Bundle
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityRedeemHistoryBinding

class RedeemHistoryActivity : BaseActivity() {

    private val binding by lazy { ActivityRedeemHistoryBinding.inflate(layoutInflater) }
    private val redeemHistoryAdapter by lazy {
        RedeemHistoryAdapter(arrayListOf("","","","",""))
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvRedeem.adapter = redeemHistoryAdapter
        binding.imgBack.setOnClickListener { onBackPressed() }
    }
}