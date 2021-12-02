package com.example.hi5.ui.dashboard

import android.os.Bundle
import com.example.hi5.R
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashboardActivity : BaseActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.bottomNavigation.inflateMenu(R.menu.bottom_navigation_menu)
        binding.bottomNavigation.setOnItemSelectedListener(bottomNavigationView)

    }

    private val bottomNavigationView = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.home -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.offers -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.rewards -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.discover -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.wallets -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}