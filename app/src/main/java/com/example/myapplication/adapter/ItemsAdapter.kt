package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Delivery
import com.example.myapplication.model.MenusItem
import com.example.myapplication.model.ShopItem
import kotlinx.android.synthetic.main.item_shopitem.view.*
import kotlinx.android.synthetic.main.item_user.view.*

class ItemsAdapter(val data: List<MenusItem?>?) : RecyclerView.Adapter<ItemsAdapter.MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_shopitem, parent, false)
        return MyHolder(v)
    }
    override fun getItemCount(): Int = data?.size ?: 0
    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(data?.get(position))
    }
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(get: MenusItem?) {
            itemView.title.text = get?.title
            itemView.ind.text = get?.ind
            itemView.price.text = "Price : "+get?.price.toString()
            itemView.discPrice.text = "Discount Price : "+get?.discPrice.toString()
        }
    }
}