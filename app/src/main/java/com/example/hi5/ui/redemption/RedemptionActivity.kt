package com.example.hi5.ui.redemption

import android.os.Bundle
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityRedemptionBinding

/**
 * @author Pardeep Singh
 */
class RedemptionActivity : BaseActivity() {

    private val binding by lazy { ActivityRedemptionBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.imgBack.setOnClickListener { onBackPressed() }
        binding.btnSave.setOnClickListener { onBackPressed() }
    }
}