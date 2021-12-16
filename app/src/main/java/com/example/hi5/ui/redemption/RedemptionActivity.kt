package com.example.hi5.ui.redemption

import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.hi5.R
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityRedemptionBinding
import com.example.hi5.utils.BottomSheet

class RedemptionActivity : BaseActivity() {

    private val binding by lazy { ActivityRedemptionBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.imgBack.setOnClickListener { onBackPressed() }
        binding.btnSave.setOnClickListener { bottomSheet() }
    }

    private fun bottomSheet() {
        val bottomSheetFragment =
            BottomSheet.getInstance(object : BottomSheet.BottomSheetClickListener {
                override fun onButtonClick() {
                    onBackPressed()
                }
            })
        bottomSheetFragment.setStyle(
            DialogFragment.STYLE_NO_TITLE,
            R.style.AppBottomSheetDialogTheme
        )
        bottomSheetFragment.show(supportFragmentManager, null)
    }
}