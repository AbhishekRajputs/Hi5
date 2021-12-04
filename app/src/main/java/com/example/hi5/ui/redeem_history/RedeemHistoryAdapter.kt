package com.example.hi5.ui.redeem_history

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hi5.databinding.ItemRedeemHistoryBinding

class RedeemHistoryAdapter(private val list: ArrayList<String>) : RecyclerView.Adapter<RedeemHistoryAdapter.RedeemHistoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RedeemHistoryViewHolder {
        return RedeemHistoryViewHolder(
            ItemRedeemHistoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RedeemHistoryViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    override fun getItemCount() = list.size

    inner class RedeemHistoryViewHolder(private var binding: ItemRedeemHistoryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindItems(s: String) {

        }
    }
}