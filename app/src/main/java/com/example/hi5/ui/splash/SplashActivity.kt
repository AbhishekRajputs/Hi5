package com.example.hi5.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.hi5.R
import com.example.hi5.base.BaseActivity
import com.example.hi5.ui.onBoarding.OnBoardingActivity
import com.example.hi5.utils.openActivity

/**
 * @author Pardeep Singh
 */
class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            openActivity(OnBoardingActivity::class.java)
        }, 2000)
    }
}