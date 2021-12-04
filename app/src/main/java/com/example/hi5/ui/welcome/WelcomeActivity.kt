package com.example.hi5.ui.welcome

import android.os.Bundle
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityWelcomeBinding
import com.example.hi5.ui.dashboard.DashboardActivity
import com.example.hi5.utils.openActivity

/**
 * @author Pardeep Singh
 */
class WelcomeActivity : BaseActivity() {

    private val binding by lazy { ActivityWelcomeBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnStarted.setOnClickListener { openActivity(DashboardActivity::class.java) }
    }
}