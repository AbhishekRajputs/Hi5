package com.example.hi5.ui.discoverHistory

import android.os.Bundle
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityDiscoverHistoryBinding
import com.example.hi5.ui.dashboard.fragments.discover.DiscoverHistoryAdapter

class DiscoverHistoryActivity : BaseActivity() {

    private val binding by lazy { ActivityDiscoverHistoryBinding.inflate(layoutInflater) }
    private val discoverHistoryAdapter by lazy {
        DiscoverHistoryAdapter(arrayListOf("", "", "", ""))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvDiscoverHistory.adapter = discoverHistoryAdapter

        binding.imgBack.setOnClickListener { onBackPressed() }
    }
}