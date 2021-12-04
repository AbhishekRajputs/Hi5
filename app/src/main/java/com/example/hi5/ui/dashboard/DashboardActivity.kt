package com.example.hi5.ui.dashboard

import android.os.Bundle
import com.example.hi5.R
import com.example.hi5.base.BaseActivity
import com.example.hi5.base.BasePagerAdapter
import com.example.hi5.databinding.ActivityMainBinding
import com.example.hi5.ui.dashboard.fragments.*
import com.example.hi5.ui.dashboard.fragments.home.HomeFragment
import com.example.hi5.ui.dashboard.fragments.offers.OffersFragment
import com.example.hi5.ui.dashboard.fragments.rewards.RewardsFragment
import com.example.hi5.ui.dashboard.fragments.wallets.WalletsFragment

class DashboardActivity : BaseActivity() {

    private lateinit var walletsFragment: WalletsFragment
    private lateinit var homeFragment: HomeFragment
    private lateinit var discoverFragment: DiscoverFragment
    private lateinit var rewardsFragment: RewardsFragment
    private lateinit var offersFragment: OffersFragment
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val pagerAdapter by lazy { BasePagerAdapter(supportFragmentManager) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setUpViewPager()

        binding.bottomNavigation.inflateMenu(R.menu.bottom_navigation_menu)
        setBottomNavClickListener()
    }



    private fun setBottomNavClickListener() {
        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    binding.viewPager.setCurrentItem(0, false)
                    return@setOnItemSelectedListener true
                }
                R.id.offers -> {
                    binding.viewPager.setCurrentItem(1, false)
                    return@setOnItemSelectedListener true
                }
                R.id.rewards -> {
                    binding.viewPager.setCurrentItem(2, false)
                    return@setOnItemSelectedListener true
                }
                R.id.discover -> {
                    binding.viewPager.setCurrentItem(3, false)
                    return@setOnItemSelectedListener true
                }
                R.id.wallets -> {
                    binding.viewPager.setCurrentItem(4, false)
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }


    private fun setUpViewPager() {
        homeFragment = HomeFragment.newInstance()
        offersFragment = OffersFragment.newInstance()
        rewardsFragment = RewardsFragment.newInstance()
        discoverFragment = DiscoverFragment.newInstance()
        walletsFragment = WalletsFragment.newInstance()

        pagerAdapter.apply {
            addFragment(homeFragment, getString(R.string.home))
            addFragment(offersFragment, getString(R.string.offers))
            addFragment(rewardsFragment, getString(R.string.rewards))
            addFragment(discoverFragment, getString(R.string.discover))
            addFragment(walletsFragment, getString(R.string.wallets))
        }
        binding.viewPager.offscreenPageLimit = 2
        binding.viewPager.adapter = pagerAdapter
    }
}