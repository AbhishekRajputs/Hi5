package com.example.hi5.ui.dashboard.fragments.rewards.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hi5.databinding.ItemRedeemBinding
import com.example.hi5.models.AppModel

class RedeemAdapter(private val list: ArrayList<AppModel>) :
    RecyclerView.Adapter<RedeemAdapter.RedeemViewHolder>() {

    private lateinit var onRedeemClickListener: OnRedeemClickListener

    fun setListener(onRedeemClickListener: OnRedeemClickListener) {
        this.onRedeemClickListener = onRedeemClickListener
    }

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

    inner class RedeemViewHolder(private var binding: ItemRedeemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindItems(s: AppModel) {

            if (s.titleTwo == "Gift") {

            } else if (s.titleTwo == "Product") {

            }
            binding.tvDeals.text = s.title
            binding.tvRedeem.setOnClickListener { onRedeemClickListener.onRedeemClick(s.titleTwo) }
        }
    }

    interface OnRedeemClickListener {
        fun onRedeemClick(titleTwo: String)
    }
}