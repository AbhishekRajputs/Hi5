package com.example.hi5.ui.deals

import android.os.Bundle
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityDealsDetailsBinding

class DealsDetailsActivity : BaseActivity() {

    private val binding by lazy { ActivityDealsDetailsBinding.inflate(layoutInflater) }
    private val dealsDetailsAdapter by lazy { DealsDetailsAdapter(arrayListOf("", "", "", "", "", "")) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvDeals.adapter = dealsDetailsAdapter
        binding.imgBack.setOnClickListener { onBackPressed() }
    }
}