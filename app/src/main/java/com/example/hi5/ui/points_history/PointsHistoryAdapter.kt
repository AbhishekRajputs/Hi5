package com.example.hi5.ui.points_history

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hi5.databinding.ItemPointsHistoryBinding

class PointsHistoryAdapter(private val list: ArrayList<String>) :
    RecyclerView.Adapter<PointsHistoryAdapter.PointsHistoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PointsHistoryViewHolder {
        return PointsHistoryViewHolder(
            ItemPointsHistoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: PointsHistoryViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    override fun getItemCount() = list.size

    inner class PointsHistoryViewHolder(private var binding: ItemPointsHistoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindItems(s: String) {
        }
    }
}