package com.example.hi5.ui.dashboard.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hi5.databinding.FragmentDiscoverBinding
import com.example.hi5.ui.dashboard.DashboardActivity
import com.example.hi5.ui.discoverNewdeal.DiscoverNewDealActivity
import com.example.hi5.utils.openActivity

class DiscoverFragment : Fragment() {

    private lateinit var binding: FragmentDiscoverBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDiscoverBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvDiscoverNewDeal.setOnClickListener {
            (activity as DashboardActivity).openActivity(
                DiscoverNewDealActivity::class.java
            )
        }
        binding.tvDiscoverHistory.setOnClickListener {}
    }

    companion object {
        fun newInstance() = DiscoverFragment()
    }
}