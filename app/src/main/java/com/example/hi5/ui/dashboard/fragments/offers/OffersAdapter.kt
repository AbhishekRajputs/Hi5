package com.example.hi5.ui.dashboard.fragments.offers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hi5.databinding.ItemOfferBinding

class OffersAdapter(private val list: ArrayList<String>) : RecyclerView.Adapter<OffersAdapter.OffersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OffersViewHolder {
        return OffersViewHolder(ItemOfferBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: OffersViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    override fun getItemCount() = list.size

    inner class OffersViewHolder(private var binding: ItemOfferBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindItems(s: String) {

        }
    }
}