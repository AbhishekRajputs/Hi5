package com.example.hi5.ui.dashboard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hi5.databinding.ItemDiscoverHistoryBinding

class DiscoverHistoryAdapter(private val list: ArrayList<String>) :
    RecyclerView.Adapter<DiscoverHistoryAdapter.DiscoverHistoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscoverHistoryViewHolder {
        return DiscoverHistoryViewHolder(
            ItemDiscoverHistoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: DiscoverHistoryViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    override fun getItemCount() = list.size

    inner class DiscoverHistoryViewHolder(private var binding: ItemDiscoverHistoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindItems(s: String) {
        }
    }
}