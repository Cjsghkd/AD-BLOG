package com.example.myproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myproject.databinding.ItemListBinding
import org.w3c.dom.Text
import java.io.Serializable

data class Stock(
    var image: Int,
    var name: String,
    var divide: String

    
) : Serializable



class Adapter(private val items: ArrayList<Stock>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root){
        fun onBind(data : Stock) {
            binding.post = data
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        holder.onBind(items[position])

    }

    override fun getItemCount(): Int {
        return items.size
    }
}

