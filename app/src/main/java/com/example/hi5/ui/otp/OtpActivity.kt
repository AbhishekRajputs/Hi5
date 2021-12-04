package com.example.hi5.ui.otp

import android.os.Bundle
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityOtpBinding
import com.example.hi5.ui.welcome.WelcomeActivity
import com.example.hi5.utils.openActivity

/**
 * @author Pardeep Singh
 */
class OtpActivity : BaseActivity() {

    private val binding by lazy { ActivityOtpBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnVerify.setOnClickListener { openActivity(WelcomeActivity::class.java) }
    }
}