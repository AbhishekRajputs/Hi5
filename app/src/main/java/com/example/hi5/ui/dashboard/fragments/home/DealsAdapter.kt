package com.example.hi5.ui.dashboard.fragments.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hi5.databinding.ItemHomeDealsBinding
import com.example.hi5.databinding.ItemHomeFilterBinding

class DealsAdapter(private val list: ArrayList<String>) : RecyclerView.Adapter<DealsAdapter.DealsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DealsViewHolder {
        return DealsViewHolder(
            ItemHomeDealsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: DealsViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    override fun getItemCount() = list.size

    inner class DealsViewHolder(private var binding: ItemHomeDealsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindItems(s: String) {

        }
    }
}