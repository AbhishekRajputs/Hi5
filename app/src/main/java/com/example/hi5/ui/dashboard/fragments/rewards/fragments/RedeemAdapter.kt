package com.example.hi5.ui.dashboard.fragments.rewards.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hi5.databinding.ItemRedeemBinding

class RedeemAdapter(private val list: ArrayList<String>) : RecyclerView.Adapter<RedeemAdapter.RedeemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RedeemViewHolder {
        return RedeemViewHolder(
            ItemRedeemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RedeemViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    override fun getItemCount() = list.size

    inner class RedeemViewHolder(private var binding: ItemRedeemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindItems(s: String) {

        }
    }
}