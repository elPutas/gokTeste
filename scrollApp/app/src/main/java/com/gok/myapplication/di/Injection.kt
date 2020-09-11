package com.gok.myapplication.di

import com.gok.myapplication.model.CardsDataSource
import com.gok.myapplication.model.CardsRepository

object Injection {
    private val cardRepository = CardsRepository()
    fun providesRepository():CardsDataSource = cardRepository
}