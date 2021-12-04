package com.example.hi5.ui.points_history

import android.os.Bundle
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityPointsBinding

class PointsActivity : BaseActivity() {

    private val binding by lazy { ActivityPointsBinding.inflate(layoutInflater) }
    private val pointsAdapter by lazy { PointsHistoryAdapter(arrayListOf("","","")) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvPoints.adapter =pointsAdapter
    }
}