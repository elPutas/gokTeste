package com.gok.myapplication.data

import com.gok.myapplication.model.Card
import com.gok.myapplication.model.CardProduct
import com.gok.myapplication.model.CardSpot

interface OperationCallback<T>
{
    fun onSuccess(dataSpot:List<CardSpot>?, dataProduct:List<CardProduct>?, dataCash:Card?)
    fun onError(error:String?)
}