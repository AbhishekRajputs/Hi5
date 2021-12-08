package com.example.hi5.ui.dashboard.fragments.home

import android.graphics.Color
import android.view.LayoutInflater
import com.example.hi5.databinding.ItemHomeFilterBinding
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FilterAdapter(private val list: ArrayList<String>,private var previousSelectedItem: String) :

    RecyclerView.Adapter<FilterAdapter.FilerViewHolder>() {

    private lateinit var filerListener: FilterClickListener

    fun setListener(Listener: FilterClickListener){
        filerListener = Listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilerViewHolder {
        return FilerViewHolder(
            ItemHomeFilterBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: FilerViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    fun updateAdapter(value :String){
        previousSelectedItem = value
        notifyDataSetChanged()
    }

    override fun getItemCount() = list.size

    inner class FilerViewHolder(private var binding: ItemHomeFilterBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindItems(s: String) {
            binding.clParent.isSelected = s.equals(previousSelectedItem, ignoreCase = true)

            if (s.equals(previousSelectedItem, ignoreCase = true)) {
                binding.tvFilter.setTextColor(Color.parseColor("#FFFFFF"))
            } else {
                binding.tvFilter.setTextColor(Color.parseColor("#666462"))
            }

            binding.tvFilter.text =s

            binding.clParent.setOnClickListener {
                filerListener.onItemClick(s)
            }
        }
    }

    interface FilterClickListener {
        fun onItemClick(value: String)
    }
}