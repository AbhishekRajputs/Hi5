package com.example.hi5.ui.dashboard.fragments.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hi5.databinding.FragmentHomeBinding
import com.example.hi5.ui.dashboard.DashboardActivity
import com.example.hi5.ui.notification.NotificationActivity
import com.example.hi5.ui.profile.ProfileActivity
import com.example.hi5.ui.scanner.ScannerActivity
import com.example.hi5.utils.openActivity


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private val homeBannerAdapter by lazy {
        HomeBannerAdapter(arrayListOf("", "", "", "", ""))
    }
    private val dealsAdapter by lazy {
        DealsAdapter(arrayListOf("", "", "", "", ""))
    }

    private val filterAdapter by lazy {
        FilterAdapter(arrayListOf("All", "Recommended", "LifeStyle", "Gifts"), "All")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvBanner.adapter = homeBannerAdapter
        binding.rvFilter.adapter = filterAdapter
        binding.rvDeals.adapter = dealsAdapter

        listeners()
    }

    private fun listeners() {
        binding.imgProfile.setOnClickListener {
            (activity as DashboardActivity).openActivity(
                ProfileActivity::class.java
            )
        }
        binding.imgScanner.setOnClickListener {
            (activity as DashboardActivity).openActivity(
                ScannerActivity::class.java
            )
        }
        binding.imgNotification.setOnClickListener {
            (activity as DashboardActivity).openActivity(
                NotificationActivity::class.java
            )
        }
    }

    companion object {
        fun newInstance() = HomeFragment()
    }
}