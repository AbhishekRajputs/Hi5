package com.example.hi5.ui.favourite

import android.os.Bundle
import com.example.hi5.base.BaseActivity
import com.example.hi5.databinding.ActivityFavouriteBinding

class FavouriteActivity : BaseActivity() {

    private val binding by lazy { ActivityFavouriteBinding.inflate(layoutInflater) }
    private val favouritesAdapter by lazy {
        FavouritesAdapter(arrayListOf("", "", "", "", "", "", "", ""))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvFavourites.adapter = favouritesAdapter
        binding.imgBack.setOnClickListener { onBackPressed() }
    }
}