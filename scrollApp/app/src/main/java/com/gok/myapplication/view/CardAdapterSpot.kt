package com.gok.myapplication.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gok.myapplication.R
import com.gok.myapplication.model.CardSpot
import kotlinx.android.synthetic.main.row_card.view.*

class CardAdapterSpot(private var cards:List<CardSpot>):RecyclerView.Adapter<CardAdapterSpot.MViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_card, parent, false)
        return MViewHolder(view)
    }

    override fun onBindViewHolder(vh: MViewHolder, position: Int) {
        //render
        vh.bind(cards[position])
    }

    override fun getItemCount(): Int {
        return cards.size
    }

    fun update(data:List<CardSpot>){
        cards = data
        notifyDataSetChanged()
    }


    class MViewHolder(view: View) : RecyclerView.ViewHolder(view){

        private val imageView:ImageView = view.imageView
        fun bind(card: CardSpot){

            Glide.with(imageView.context).load(card.bannerURL).into(imageView)
        }
    }

}