package com.example.hi5.ui.favourite

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hi5.databinding.ItemHomeDealsBinding

class FavouritesAdapter(private val list: ArrayList<String>) : RecyclerView.Adapter<FavouritesAdapter.FavouritesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavouritesViewHolder {
        return FavouritesViewHolder(
            ItemHomeDealsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: FavouritesViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    override fun getItemCount() = list.size

    inner class FavouritesViewHolder(private var binding: ItemHomeDealsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindItems(s: String) {
            binding.tvfav.isSelected = true
        }
    }
}