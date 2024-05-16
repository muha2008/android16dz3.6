package com.example.android16dz36.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android16dz36.databinding.ItemBinding
import com.example.android16dz36.ui.model.Data

class AdapterD : RecyclerView.Adapter<AdapterD.AdapterViewHolder>() {

    private var data = listOf<Data>()

    fun setList(data: List<Data>){
        this.data = data
    }


    class AdapterViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: Data) {
            binding.imageView.setImageResource(data.image)
            binding.text.text = data.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AdapterViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {
        holder.onBind(data[position])
    }
}
