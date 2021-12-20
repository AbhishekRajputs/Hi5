package com.example.hi5.ui.dashboard.fragments.home

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.hi5.databinding.FragmentHomeBinding
import com.example.hi5.ui.dashboard.DashboardActivity
import com.example.hi5.ui.notification.NotificationActivity
import com.example.hi5.ui.profile.ProfileActivity
import com.example.hi5.ui.scanner.ScannerActivity
import com.example.hi5.utils.openActivity
import com.example.hi5.utils.showToast


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private val homeBannerAdapter by lazy {
        HomeBannerAdapter(arrayListOf("", "", "", "", ""))
    }
    private val dealsAdapter by lazy {
        DealsAdapter(arrayListOf("", "", "", "", ""))
    }

    private val filterAdapter by lazy {
        FilterAdapter(
            arrayListOf("All", "Live Super Deal", "Recommend", "LifeStyle", "Gifts"),
            "All"
        )
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
        filterAdapter.setListener(listener)

        listeners()
    }

    private val listener = object : FilterAdapter.FilterClickListener {
        override fun onItemClick(value: String) {
            filterAdapter.updateAdapter(value)
        }
    }

    private fun listeners() {
        binding.imgProfile.setOnClickListener {
            (activity as DashboardActivity).openActivity(
                ProfileActivity::class.java
            )
        }
        binding.imgScanner.setOnClickListener {
            if (ContextCompat.checkSelfPermission(
                    activity as DashboardActivity,
                    Manifest.permission.CAMERA
                )
                == PackageManager.PERMISSION_DENIED
            ) {
                ActivityCompat.requestPermissions(
                    activity as DashboardActivity,
                    arrayOf(Manifest.permission.CAMERA),
                    114
                )
            } else {
                (activity as DashboardActivity).openActivity(
                    ScannerActivity::class.java
                )
            }
        }
        binding.imgNotification.setOnClickListener {
            (activity as DashboardActivity).openActivity(
                NotificationActivity::class.java
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 114) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                (activity as DashboardActivity).openActivity(
                    ScannerActivity::class.java
                )
            } else {
                (activity as DashboardActivity).showToast("camera permission denied")
            }
        }
    }

    companion object {
        fun newInstance() = HomeFragment()
    }
}