package com.example.finalexam.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.finalexam.R
import com.example.finalexam.models.ProductModel
import com.example.finalexam.models.Products

class ListAdapter (
    private val list : List<Products>
) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    class ListViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val title_product = view.findViewById<TextView>(R.id.title_product)
        val price_product = view.findViewById<TextView>(R.id.price_product)
        val image_product = view.findViewById<ImageView>(R.id.image_product)
        fun bindProduct(product: Products){
            title_product.text = product.title
            price_product.text = "S/" + product.price
            Glide.with(itemView.context).load(product.productImgs?.get(0)?.imgUrl).into(image_product)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_product, parent, false)
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bindProduct(list[position])
    }
}