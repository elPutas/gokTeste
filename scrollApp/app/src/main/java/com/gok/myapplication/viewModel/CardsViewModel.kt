package com.gok.myapplication.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gok.myapplication.data.OperationCallback
import com.gok.myapplication.model.Card
import com.gok.myapplication.model.CardProduct
import com.gok.myapplication.model.CardSpot
import com.gok.myapplication.model.CardsDataSource


class CardsViewModel(private val repository: CardsDataSource):ViewModel() {

    //private val nRepository = MuseumRepository()
    private val _cardsSpot = MutableLiveData<List<CardSpot>>().apply { value = emptyList() }
    val cardsSpot: LiveData<List<CardSpot>> = _cardsSpot

    private val _cardsProduct = MutableLiveData<List<CardProduct>>().apply { value = emptyList() }
    val cardsProduct: LiveData<List<CardProduct>> = _cardsProduct

    private val _cardsCash = MutableLiveData<Card>().apply { value = null }
    val cardsCash: LiveData<Card> = _cardsCash


    private val _isViewLoading=MutableLiveData<Boolean>()
    val isViewLoading:LiveData<Boolean> = _isViewLoading

    private val _onMessageError=MutableLiveData<Any>()
    val onMessageError:LiveData<Any> = _onMessageError

    private val _isEmptyList=MutableLiveData<Boolean>()
    val isEmptyList:LiveData<Boolean> = _isEmptyList

    /*
    If you require that the data be loaded only once, you can consider calling the method
    "loadCards()" on constructor. Also, if you rotate the screen, the service will not be called.
    init {
        //loadCards()
    }
     */

     fun loadCards() {
        _isViewLoading.postValue(true)
        repository.retrieveCards(object:OperationCallback<CardSpot>{
            override fun onError(error: String?) {
                _isViewLoading.postValue(false)
                _onMessageError.postValue( error)
            }

            override fun onSuccess(dataSpot: List<CardSpot>?, dataProduct: List<CardProduct>?, dataCash: Card?) {
                _isViewLoading.postValue(false)

                if(dataSpot!=null){
                    if(dataSpot.isEmpty()){
                        _isEmptyList.postValue(true)
                    }else{
                        _cardsSpot.value= dataSpot
                        _cardsProduct.value = dataProduct
                        _cardsCash.value = dataCash
                    }
                }
            }
        })
        /*
        _isViewLoading.postValue(true)
        viewModelScope.launch {
            val result: OperationResult<CardSpot> = withContext(Dispatchers.IO) {
                repository.retrieveCards()
            }
            _isViewLoading.postValue(false)
            when (result) {
                is OperationResult.Success -> {
                    if (result.data.isNullOrEmpty()) {
                        _isEmptyList.postValue(true)
                    } else {
                        _cards.value = result.data
                    }
                }
                is OperationResult.Error -> {
                    _onMessageError.postValue(result.exception)

                }
            }
        }

         */
    }

}

