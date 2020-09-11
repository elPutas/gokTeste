

package com.gok.myapplication

import android.app.Application
import android.content.Context
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.gok.myapplication.data.OperationCallback
import com.gok.myapplication.model.Card
import com.gok.myapplication.model.CardProduct
import com.gok.myapplication.model.CardSpot
import com.gok.myapplication.model.CardsDataSource
import com.gok.myapplication.viewModel.CardsViewModel

import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.ArgumentCaptor
import org.mockito.Captor
import org.mockito.Mock
import org.mockito.*
import org.mockito.Mockito.*

class MVVMUnitTest {

    @Mock
    private lateinit var repository: CardsDataSource
    @Mock private lateinit var context: Application

    @Captor
    private lateinit var operationCallbackCaptor: ArgumentCaptor<OperationCallback<CardSpot>>

    private lateinit var viewModel:CardsViewModel

    private lateinit var isViewLoadingObserver:Observer<Boolean>
    private lateinit var onMessageErrorObserver:Observer<Any>
    private lateinit var emptyListObserver:Observer<Boolean>
    private lateinit var onRenderCardObserver:Observer<List<CardSpot>>

    private lateinit var spotEmptyList:List<CardSpot>
    private lateinit var productEmptyList:List<CardProduct>
    private lateinit var cashEmpty:Card

    private lateinit var spotList:List<CardSpot>
    private lateinit var productList:List<CardProduct>
    private lateinit var cash:Card

    
    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        `when`(context.applicationContext).thenReturn(context)

        viewModel= CardsViewModel(repository)

        mockData()
        setupObservers()
    }

    @Test
    fun `retrieve cards with ViewModel and Repository returns empty data`(){
        with(viewModel){
            loadCards()
            isViewLoading.observeForever(isViewLoadingObserver)
            //onMessageError.observeForever(onMessageErrorObserver)
            isEmptyList.observeForever(emptyListObserver)
            cardsSpot.observeForever(onRenderCardObserver)
        }

        verify(repository, times(1)).retrieveCards(capture(operationCallbackCaptor))
        operationCallbackCaptor.value.onSuccess(spotEmptyList, productEmptyList, cashEmpty)

        Assert.assertNotNull(viewModel.isViewLoading.value)
        //Assert.assertNotNull(viewModel.onMessageError.value) //java.lang.AssertionError
        //Assert.assertNotNull(viewModel.isEmptyList.value)
        Assert.assertTrue(viewModel.isEmptyList.value==true)
        Assert.assertTrue(viewModel.cardsSpot.value?.size==0)
    }

    @Test
    fun `retrieve cards with ViewModel and Repository returns full data`(){
        with(viewModel){
            loadCards()
            isViewLoading.observeForever(isViewLoadingObserver)
            cardsSpot.observeForever(onRenderCardObserver)
        }

        verify(repository, times(1)).retrieveCards(capture(operationCallbackCaptor))
        operationCallbackCaptor.value.onSuccess(spotList, productList, cash)

        Assert.assertNotNull(viewModel.isViewLoading.value)
        Assert.assertTrue(viewModel.cardsSpot.value?.size==3)
    }

    @Test
    fun `retrieve cards with ViewModel and Repository returns an error`(){
        with(viewModel){
            loadCards()
            isViewLoading.observeForever(isViewLoadingObserver)
            onMessageError.observeForever(onMessageErrorObserver)
        }
        verify(repository, times(1)).retrieveCards(capture(operationCallbackCaptor))
        operationCallbackCaptor.value.onError("An error occurred")
        Assert.assertNotNull(viewModel.isViewLoading.value)
        Assert.assertNotNull(viewModel.onMessageError.value)
    }

    private fun setupObservers(){
        isViewLoadingObserver= mock(Observer::class.java) as Observer<Boolean>
        onMessageErrorObserver= mock(Observer::class.java) as Observer<Any>
        emptyListObserver= mock(Observer::class.java) as Observer<Boolean>
        onRenderCardObserver= mock(Observer::class.java)as Observer<List<CardSpot>>
    }

    private fun mockData(){
        spotEmptyList= emptyList()
        val mockList:MutableList<CardSpot>  = mutableListOf()
        mockList.add(CardSpot("0","",""))
        mockList.add(CardSpot("0","",""))
        mockList.add(CardSpot("0","",""))


        spotList= mockList.toList()
    }
}
