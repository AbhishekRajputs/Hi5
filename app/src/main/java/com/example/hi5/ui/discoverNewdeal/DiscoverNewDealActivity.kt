package com.example.hi5.ui.discoverNewdeal

import android.os.Bundle
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityDiscoverNewDealBinding


class DiscoverNewDealActivity : BaseActivity() {

    private val binding by lazy { ActivityDiscoverNewDealBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.imgBack.setOnClickListener { onBackPressed() }
        binding.btnSave.setOnClickListener { onBackPressed() }
    }
}