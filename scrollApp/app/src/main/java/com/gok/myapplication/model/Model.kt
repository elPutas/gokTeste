package com.gok.myapplication.model
import java.io.Serializable


data class CardProduct(val description:String, val name:String, val  imageURL:String):Serializable

data class CardSpot(val name:String, val bannerURL:String, val  description:String):Serializable

data class Card(val description:String, val title:String, val  bannerURL:String):Serializable
