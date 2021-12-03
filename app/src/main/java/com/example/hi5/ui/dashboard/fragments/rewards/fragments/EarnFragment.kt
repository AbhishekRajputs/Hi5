package com.example.hi5.ui.dashboard.fragments.rewards.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hi5.databinding.FragmentEarnBinding


class EarnFragment : Fragment() {

    private lateinit var binding : FragmentEarnBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View{
        binding =FragmentEarnBinding.inflate(inflater,container,false)
        return binding.root
    }

    companion object {
        fun newInstance() = EarnFragment()
    }

}