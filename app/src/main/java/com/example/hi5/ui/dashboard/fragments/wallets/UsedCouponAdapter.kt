package com.example.hi5.ui.dashboard.fragments.wallets

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hi5.databinding.ItemCouponBinding

class UsedCouponAdapter(private val list: ArrayList<String>) :
    RecyclerView.Adapter<UsedCouponAdapter.UsedCouponViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsedCouponViewHolder {
        return UsedCouponViewHolder(
            ItemCouponBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: UsedCouponViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    override fun getItemCount() = list.size

    inner class UsedCouponViewHolder(private var binding: ItemCouponBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindItems(s: String) {
        }
    }
}