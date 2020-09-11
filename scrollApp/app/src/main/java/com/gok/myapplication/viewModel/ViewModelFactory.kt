package com.gok.myapplication.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gok.myapplication.model.CardsDataSource

class ViewModelFactory(private val repository: CardsDataSource):ViewModelProvider.Factory
{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CardsViewModel(repository) as T
    }
}