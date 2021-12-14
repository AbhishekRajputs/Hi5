package com.example.hi5.ui.dashboard.fragments.wallets

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hi5.databinding.ItemCouponBinding
import com.example.hi5.utils.hide
import com.example.hi5.utils.show


class UnUsedCouponAdapter(private val list: ArrayList<String>) :
    RecyclerView.Adapter<UnUsedCouponAdapter.UnUsedCouponViewHolder>() {

    private lateinit var listener: OnViewClickListener

    fun setListener(listener: OnViewClickListener) {
        this.listener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UnUsedCouponViewHolder {
        return UnUsedCouponViewHolder(
            ItemCouponBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: UnUsedCouponViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    override fun getItemCount() = list.size

    inner class UnUsedCouponViewHolder(private var binding: ItemCouponBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindItems(s: String) {
            binding.tvApproved.hide()
            binding.tvPoints.hide()
            binding.tvView.show()

            binding.tvView.setOnClickListener { listener.onViewClick() }
            binding.clParent.setOnClickListener { listener.onViewClick() }
        }
    }

    interface OnViewClickListener {
        fun onViewClick()
    }
}