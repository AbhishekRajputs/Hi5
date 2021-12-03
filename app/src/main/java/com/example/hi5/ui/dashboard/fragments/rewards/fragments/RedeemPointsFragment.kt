package com.example.hi5.ui.dashboard.fragments.rewards.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hi5.databinding.FragmentRedeemPointsBinding


class RedeemPointsFragment : Fragment() {

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

    }

    companion object {
        fun newInstance() = RedeemPointsFragment()
    }
}