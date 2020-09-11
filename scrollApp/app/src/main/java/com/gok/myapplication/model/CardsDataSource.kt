package com.gok.myapplication.model

import com.gok.myapplication.data.OperationCallback

interface CardsDataSource {
    fun retrieveCards(callback: OperationCallback<CardSpot>)

}