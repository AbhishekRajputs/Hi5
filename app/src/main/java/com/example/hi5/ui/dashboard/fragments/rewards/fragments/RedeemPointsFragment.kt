package com.example.hi5.ui.dashboard.fragments.rewards.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.hi5.R
import com.example.hi5.databinding.FragmentRedeemPointsBinding
import com.example.hi5.ui.reedeem.RedeemActivity
import com.example.hi5.utils.BottomSheet
import com.example.hi5.utils.openActivity


class RedeemPointsFragment : Fragment(),RedeemAdapter.OnRedeemClickListener {

    private lateinit var binding : FragmentRedeemPointsBinding
    private val redeemAdapter by lazy {
        RedeemAdapter(arrayListOf("","","","",""))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding =FragmentRedeemPointsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvRedeem.adapter =redeemAdapter
        redeemAdapter.setListener(this)
    }

    private fun bottomSheet() {
        val bottomSheetFragment =
            BottomSheet.getInstance(object : BottomSheet.BottomSheetClickListener {
                override fun onButtonClick() {
                    startActivity(Intent(requireContext(),RedeemActivity::class.java))
                }
            })
        bottomSheetFragment.setStyle(DialogFragment.STYLE_NO_TITLE, R.style.AppBottomSheetDialogTheme)
        bottomSheetFragment.show(requireActivity().supportFragmentManager, null)
    }

    override fun onRedeemClick() {
        bottomSheet()
    }

    companion object {
        fun newInstance() = RedeemPointsFragment()
    }
}