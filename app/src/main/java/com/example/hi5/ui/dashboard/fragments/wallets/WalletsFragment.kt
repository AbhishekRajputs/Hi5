package com.example.hi5.ui.dashboard.fragments.wallets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hi5.R
import com.example.hi5.base.BasePagerAdapter
import com.example.hi5.databinding.FragmentWalletsBinding
import com.example.hi5.ui.dashboard.fragments.wallets.fragment.UnusedCouponFragment
import com.example.hi5.ui.dashboard.fragments.wallets.fragment.UsedCouponFragment

class WalletsFragment : Fragment() {

    private lateinit var binding :FragmentWalletsBinding
    private val pagerAdapter by lazy { BasePagerAdapter(childFragmentManager) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding =FragmentWalletsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViewPager()
    }

    private fun setUpViewPager() {
        pagerAdapter.apply {
            addFragment(UsedCouponFragment.newInstance(),getString(R.string.used_coupon))
            addFragment(UnusedCouponFragment.newInstance(), getString(R.string.unused_coupon))
        }
        binding.viewPager.adapter = pagerAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)
    }

    companion object {
        fun newInstance() = WalletsFragment()
    }
}