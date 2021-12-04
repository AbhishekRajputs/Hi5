package com.example.hi5.ui.redeem_points

import android.os.Bundle
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityRedeemPointsBinding
import com.example.hi5.ui.dashboard.fragments.home.HomeBannerAdapter
import com.example.hi5.ui.dashboard.fragments.rewards.fragments.RedeemAdapter

class RedeemPointsActivity : BaseActivity() {

    private val binding by lazy { ActivityRedeemPointsBinding.inflate(layoutInflater) }
    private val bannerAdapter by lazy {
        HomeBannerAdapter(arrayListOf("","","","",""))
    }

    private val redeemAdapter by lazy {
        RedeemAdapter(arrayListOf("","","","",""))
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvBanner.adapter = bannerAdapter
        binding.rvRedeem.adapter = redeemAdapter
    }
}