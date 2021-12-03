package com.example.hi5.ui.dashboard.fragments.rewards

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hi5.R
import com.example.hi5.base.BasePagerAdapter
import com.example.hi5.databinding.FragmentRewardsBinding
import com.example.hi5.ui.dashboard.fragments.rewards.fragments.EarnFragment
import com.example.hi5.ui.dashboard.fragments.rewards.fragments.RedeemPointsFragment

class RewardsFragment : Fragment() {

    private lateinit var binding: FragmentRewardsBinding
    private val pagerAdapter by lazy { BasePagerAdapter(childFragmentManager) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding =FragmentRewardsBinding.inflate(inflater,container,false)
        return binding.root
    }

    companion object {
        fun newInstance() = RewardsFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViewPager()
    }


    private fun setUpViewPager() {
        pagerAdapter.apply {
            addFragment(EarnFragment.newInstance(), getString(R.string.earn_points))
            addFragment(RedeemPointsFragment.newInstance(), getString(R.string.redeem_points))
        }
        binding.viewPager.adapter = pagerAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)
    }
}