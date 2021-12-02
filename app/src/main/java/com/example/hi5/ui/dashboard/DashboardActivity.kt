package com.example.hi5.ui.dashboard

import android.os.Bundle
import com.example.hi5.R
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityMainBinding

class DashboardActivity : BaseActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.bottomNavigation.inflateMenu(R.menu.bottom_navigation_menu)
        binding.bottomNavigation.setOnItemSelectedListener{
            when (it.itemId) {
                R.id.home -> {
                    return@setOnItemSelectedListener  true
                }
                R.id.offers -> {
                    return@setOnItemSelectedListener  true
                }
                R.id.rewards -> {
                    return@setOnItemSelectedListener  true
                }
                R.id.discover -> {
                    return@setOnItemSelectedListener  true
                }
                R.id.wallets -> {
                    return@setOnItemSelectedListener  true
                }
            }
            false
        }
    }
}