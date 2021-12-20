package com.example.hi5.ui.signUp

import android.os.Bundle
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivitySignUpBinding
import com.example.hi5.ui.login.LoginActivity
import com.example.hi5.utils.openActivity


class SignUpActivity : BaseActivity() {

    private val binding by lazy { ActivitySignUpBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.imgBack.setOnClickListener { onBackPressed() }
        binding.btnSignUp.setOnClickListener { openActivity(LoginActivity::class.java) }
        binding.imgBack.setOnClickListener { finish() }
    }
}