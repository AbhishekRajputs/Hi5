package com.example.hi5.ui.dashboard.fragments.wallets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hi5.databinding.FragmentWalletsBinding
import com.example.hi5.ui.dashboard.fragments.discover.DiscoverHistoryAdapter

class WalletsFragment : Fragment() {

    private lateinit var binding :FragmentWalletsBinding
    private val discoverHistoryAdapter by lazy {
        DiscoverHistoryAdapter(arrayListOf("","","",""))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding =FragmentWalletsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvDiscoverHistory.adapter = discoverHistoryAdapter
    }

    companion object {
        fun newInstance() = WalletsFragment()
    }
}