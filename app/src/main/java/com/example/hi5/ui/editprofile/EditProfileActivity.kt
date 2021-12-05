package com.example.hi5.ui.editprofile

import android.os.Bundle
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityEditProfileBinding

/**
 * @author Pardeep Singh
 */
class EditProfileActivity : BaseActivity() {

    private val binding by lazy { ActivityEditProfileBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.imgBack.setOnClickListener { onBackPressed() }
        binding.btnSave.setOnClickListener { onBackPressed() }
    }
}