package com.example.hi5.ui.dashboard.fragments.home

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hi5.databinding.ItemHomeBinding
import com.example.hi5.ui.deals.DealsDetailsActivity

class HomeBannerAdapter(private val list: ArrayList<String>) :

    RecyclerView.Adapter<HomeBannerAdapter.BannerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        return BannerViewHolder(
            ItemHomeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    override fun getItemCount() = list.size

    inner class BannerViewHolder(private var binding: ItemHomeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindItems(s: String) {
            binding.imgBanner.setOnClickListener { binding.imgBanner.context.startActivity(
                Intent(binding.imgBanner.context, DealsDetailsActivity::class.java)
            ) }
        }
    }
}