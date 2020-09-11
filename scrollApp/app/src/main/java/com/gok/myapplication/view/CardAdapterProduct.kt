package com.gok.myapplication.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gok.myapplication.R
import com.gok.myapplication.model.CardProduct

import kotlinx.android.synthetic.main.row_card.view.*

class CardAdapterProduct(private var cards:List<CardProduct>):RecyclerView.Adapter<CardAdapterProduct.MViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_card_prod, parent, false)
        return MViewHolder(view)
    }

    override fun onBindViewHolder(vh: MViewHolder, position: Int) {
        //render
        vh.bind(cards[position])
    }

    override fun getItemCount(): Int {
        return cards.size
    }

    fun update(data:List<CardProduct>){
        cards = data
        notifyDataSetChanged()
    }


    class MViewHolder(view: View) : RecyclerView.ViewHolder(view){

        private val imageView:ImageView = view.imageView
        fun bind(card: CardProduct){

            Glide.with(imageView.context).load(card.imageURL).into(imageView)
        }
    }

}