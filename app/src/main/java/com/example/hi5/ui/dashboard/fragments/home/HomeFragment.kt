package com.example.hi5.ui.dashboard.fragments.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hi5.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding:FragmentHomeBinding
    private val homeBannerAdapter by lazy {
        HomeBannerAdapter(arrayListOf("","","","",""))
    }
    private val dealsAdapter by lazy {
        DealsAdapter(arrayListOf("","","","",""))
    }

    private val filterAdapter by lazy {
        FilterAdapter(arrayListOf("All","Recommended","LifeStyle","Gifts"),"All")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvBanner.adapter = homeBannerAdapter
        binding.rvFilter.adapter = filterAdapter
        binding.rvDeals.adapter = dealsAdapter
    }

    companion object {
        fun newInstance() = HomeFragment()
    }
}