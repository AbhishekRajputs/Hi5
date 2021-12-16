package com.example.hi5.ui.deals

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hi5.databinding.ItemDealsDetailsBinding

class DealsDetailsAdapter(private val list: ArrayList<String>) :
    RecyclerView.Adapter<DealsDetailsAdapter.DealsDetailsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DealsDetailsViewHolder {
        return DealsDetailsViewHolder(
            ItemDealsDetailsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: DealsDetailsViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    override fun getItemCount() = list.size

    inner class DealsDetailsViewHolder(private var binding: ItemDealsDetailsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindItems(s: String) {
            binding.imgDeal
        }
    }
}