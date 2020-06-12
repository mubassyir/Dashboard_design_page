package com.mubassyir.dashboradpagelayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_favorite.view.*

class PopularAdapter :RecyclerView.Adapter<PopularAdapter.PopularViewHolder>(){

    var listPopular = ArrayList<PopularEntity>()

    fun setData(dummy: List<PopularEntity>) {
        listPopular.clear()
        listPopular.addAll(dummy)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_favorite,parent,false)
        return PopularViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listPopular.size
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val popular = listPopular[position]
        holder.bind(popular)
    }

    inner class PopularViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        fun bind(popular:PopularEntity){
            with(itemView){

                Glide.with(itemView.context)
                    .load(popular.images)
                    .into(favorite_image)

             favorite_nations.text = popular.nations
                setOnClickListener { Toast.makeText(context,popular.nations,Toast.LENGTH_SHORT).show() }
            }

        }

    }
}
