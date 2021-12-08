package com.example.hi5.ui.redeem_points

import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.hi5.R
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityRedeemPointsBinding
import com.example.hi5.ui.dashboard.fragments.home.HomeBannerAdapter
import com.example.hi5.ui.dashboard.fragments.rewards.fragments.RedeemAdapter
import com.example.hi5.ui.redeem_history.RedeemHistoryActivity
import com.example.hi5.ui.reedeem.RedeemActivity
import com.example.hi5.utils.BottomSheet
import com.example.hi5.utils.openActivity

class RedeemPointsActivity : BaseActivity(),RedeemAdapter.OnRedeemClickListener {

    private val binding by lazy { ActivityRedeemPointsBinding.inflate(layoutInflater) }
    private val bannerAdapter by lazy {
        HomeBannerAdapter(arrayListOf("", "", "", "", ""))
    }

    private val redeemAdapter by lazy {
        RedeemAdapter(arrayListOf("", "", "", "", ""))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvBanner.adapter = bannerAdapter
        binding.rvRedeem.adapter = redeemAdapter
        redeemAdapter.setListener(this)
    }


    private fun bottomSheet() {
        val bottomSheetFragment =
            BottomSheet.getInstance(object : BottomSheet.BottomSheetClickListener {
                override fun onButtonClick() {
                openActivity(RedeemActivity::class.java)
                }
            })
        bottomSheetFragment.setStyle(DialogFragment.STYLE_NO_TITLE, R.style.AppBottomSheetDialogTheme)
        bottomSheetFragment.show(supportFragmentManager, null)
    }

    override fun onRedeemClick() {
        bottomSheet()
    }
}