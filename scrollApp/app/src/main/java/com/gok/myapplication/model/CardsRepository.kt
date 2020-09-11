package com.gok.myapplication.model

import com.gok.myapplication.data.ApiClient
import com.gok.myapplication.data.CardsResponse
import com.gok.myapplication.data.OperationCallback
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


const val TAG="CONSOLE"

class CardsRepository:CardsDataSource
{


    private var call:Call<CardsResponse>?=null
    override fun retrieveCards(callback: OperationCallback<CardSpot>)
    {

            call=ApiClient.build()?.cards()
            call?.enqueue(object :Callback<CardsResponse>
            {
                override fun onFailure(call: Call<CardsResponse>, t: Throwable) {
                    callback.onError(t.message)
                }

                override fun onResponse(call: Call<CardsResponse>, response: Response<CardsResponse>) {
                    response.body()?.let {
                        if(response.isSuccessful && (it.isSuccess())){
                            callback.onSuccess(it.spotlight, it.products, it.cash)
                        }else{
                            callback.onError("error")
                        }
                    }
                }
            })
            /*
            val response = ApiClient.build()?.cards()
            response?.let {

                /*return if( it.request().body()!=null){
                    val data = it.request().body
                    OperationResult.Success(data)
                }else{

                 */
                    val message = "error"
                return OperationResult.Error(Exception(message))
                //}
            }?:run{
                return OperationResult.Error(Exception("Ocurrió un error"))
            }

             */

    }

}
