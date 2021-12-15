package com.example.hi5.ui.dashboard.fragments.wallets.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.hi5.R
import com.example.hi5.databinding.FragmentUnusedCouponBinding
import com.example.hi5.ui.dashboard.fragments.wallets.UnUsedCouponAdapter
import com.example.hi5.ui.reedeem.RedeemActivity
import com.example.hi5.utils.BottomSheet
import com.example.hi5.utils.ViewBottomSheet

class UnusedCouponFragment : Fragment() {

    private lateinit var binding : FragmentUnusedCouponBinding
    private val adapter by lazy { UnUsedCouponAdapter(arrayListOf("","","")) }

    companion object {
        fun newInstance() = UnusedCouponFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding =FragmentUnusedCouponBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvUnUsedCoupon.adapter =adapter
        adapter.setListener(listener)
    }

    private val listener = object : UnUsedCouponAdapter.OnViewClickListener{
        override fun onViewClick() {
            bottomSheet()
        }
    }

    private fun bottomSheet() {
        val bottomSheetFragment =
            ViewBottomSheet.getInstance(object : ViewBottomSheet.BottomSheetClickListener {
                override fun onButtonClick() {

                }
            })
        bottomSheetFragment.setStyle(DialogFragment.STYLE_NO_TITLE, R.style.AppBottomSheetDialogTheme)
        bottomSheetFragment.show(requireActivity().supportFragmentManager, null)
    }
}