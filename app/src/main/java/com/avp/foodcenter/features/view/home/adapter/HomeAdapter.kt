package com.avp.foodcenter.features.view.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.avp.foodcenter.R
import com.avp.foodcenter.features.view.home.model.ItemHomeModel
import kotlinx.android.synthetic.main.item_home.view.*

class HomeAdapter(
    private val homeModels: List<ItemHomeModel>
) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val itemHomeViewHolder =
            LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
        return HomeViewHolder(itemHomeViewHolder)
    }

    override fun getItemCount(): Int {
        return homeModels.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.itemView.tvTitle.text = homeModels[position].title
        holder.itemView.tvDescription.text = homeModels[position].description
    }

    class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}