package com.gok.myapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.gok.myapplication.R
import com.gok.myapplication.di.Injection
import com.gok.myapplication.model.Card
import com.gok.myapplication.model.CardProduct
import com.gok.myapplication.model.CardSpot
import com.gok.myapplication.viewModel.CardsViewModel
import com.gok.myapplication.viewModel.ViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_error.*

class MainActivity : AppCompatActivity() {

    private val defaultImg = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAAAP1BMVEXk5OSSkpKOjo7o6OiMjIzc3Nytra3Dw8Pp6emkpKSnp6e1tbXg4ODU1NSTk5Pe3t6dnZ26urrOzs7Hx8fR0dE9mt/DAAACD0lEQVR4nO3a23KqMBSAYchKyjnBw/s/6yYgSqsCdTq1K/v/rjoOF/ldYkCaZQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8bkeD2aOXdK32RdL3Zp27fvdbXOJPvZHqVU5TG5H29h/f2qDFRPnLjStlWFsYUOguNcZc/1w+Mhceu/IU1/axroYSzk5XIWHiq7EHdGOfCtrLW9u75+sfCOtd3Ls6F3vj4fRmeHxgLC5N/6CyUw7RnmOfrH8/DTG9hddnz/HL94haf2rGwNSvvwR91KewfFErI81ui9sLm8imtF0Nzw5npr4nKC+drN9vdZubGr55rovZCOft4cX36GnhL1F44XNCcDqfbDZIEP19w+zC+qr4w3icuz8HlTcU4xQQKly/eJnidYhqFcp4+kO5TYDwXEyksC3sop33wK5dE4RCYD/cOdxOM+2QjCRTGwGFHLMJ9YBqFU2A86e4DkyiUOfChBArjBB8NL5nC9QkmUdivTTCRwvRnmHyhXae/sNug+qotv7+3eHig3sJhhuUeagvjs6dqD5/bo8bCLHzn+WHQWJh1vd35DDi+HRoLM2nD8G0Z2g1SStkq/FV/JI01VbNDHff+d6/2Jd94mL9ra/l74g/CG1c1E3/WOcL4g/Cu/6lxG4/CAQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAUvQPO+QdjH50+9MAAAAASUVORK5CYII="

    private lateinit var viewModel: CardsViewModel
    private lateinit var adapterSpot: CardAdapterSpot
    private lateinit var adapterProduct: CardAdapterProduct

    companion object {
        const val TAG= "CONSOLE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        setupViewModel()
        setupUI()
    }


    //ui
    private fun setupUI(){
        adapterSpot= CardAdapterSpot(viewModel.cardsSpot.value?: emptyList())
        rvSpot.layoutManager= LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvSpot.adapter= adapterSpot

        adapterProduct = CardAdapterProduct(viewModel.cardsProduct.value?: emptyList())
        rvProduct.layoutManager= LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvProduct.adapter= adapterProduct

        Glide.with(imgCash.context).load(defaultImg).into(imgCash)
    }

    //viewmodel
    private fun setupViewModel(){
        viewModel = ViewModelProvider(this,ViewModelFactory(Injection.providesRepository())).get(CardsViewModel::class.java)
        viewModel.cardsSpot.observe(this,renderCards)
        viewModel.cardsProduct.observe(this,renderCardsProduct)
        viewModel.cardsCash.observe(this,renderCardsCash)

        viewModel.isViewLoading.observe(this,isViewLoadingObserver)
        viewModel.onMessageError.observe(this,onMessageErrorObserver)
        viewModel.isEmptyList.observe(this,emptyListObserver)
    }

    //observers
    private val renderCards= Observer<List<CardSpot>> {
        Log.v(TAG, "data updated $it")
        layoutError.visibility=View.GONE
        layoutEmpty.visibility=View.GONE
        adapterSpot.update(it)
    }

    private val renderCardsProduct= Observer<List<CardProduct>> {
        Log.v(TAG, "data updated $it")
        layoutError.visibility=View.GONE
        layoutEmpty.visibility=View.GONE
        adapterProduct.update(it)
    }

    private val renderCardsCash= Observer<Card> {
        Log.v(TAG, "data updated $it")
        layoutError.visibility=View.GONE
        layoutEmpty.visibility=View.GONE
        if(it!=null)
            Glide.with(imgCash.context).load(it.bannerURL).into(imgCash)
    }

    private val isViewLoadingObserver= Observer<Boolean> {
        Log.v(TAG, "isViewLoading $it")
        val visibility=if(it)View.VISIBLE else View.GONE
        progressBar.visibility= visibility
    }

    private val onMessageErrorObserver= Observer<Any> {
        Log.v(TAG, "onMessageError $it")
        layoutError.visibility=View.VISIBLE
        layoutEmpty.visibility=View.GONE
        textViewError.text= "Error $it"
    }

    private val emptyListObserver= Observer<Boolean> {
        Log.v(TAG, "emptyListObserver $it")
        layoutEmpty.visibility=View.VISIBLE
        layoutError.visibility=View.GONE
    }

    //If you require updated data, you can call the method "loadCards" here
    override fun onResume() {
        super.onResume()
        viewModel.loadCards()
    }

}