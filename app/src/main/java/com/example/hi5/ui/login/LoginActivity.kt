package com.example.hi5.ui.login

import android.os.Bundle
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityLoginBinding
import com.example.hi5.ui.otp.OtpActivity
import com.example.hi5.ui.signUp.SignUpActivity
import com.example.hi5.utils.openActivity


class LoginActivity : BaseActivity() {

    private val binding by lazy { ActivityLoginBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.imgBack.setOnClickListener { onBackPressed() }
        binding.btnLogin.setOnClickListener { openActivity(OtpActivity::class.java) }
        binding.tvSignUp.setOnClickListener { openActivity(SignUpActivity::class.java) }
    }
}