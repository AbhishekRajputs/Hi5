package com.example.hi5.ui.dashboard.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hi5.databinding.FragmentWalletsBinding

class WalletsFragment : Fragment() {

    private lateinit var binding :FragmentWalletsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding =FragmentWalletsBinding.inflate(inflater,container,false)
        return binding.root
    }

    companion object {
        fun newInstance() = WalletsFragment()
    }
}