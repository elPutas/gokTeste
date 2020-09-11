package com.gok.myapplication.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/gok/myapplication/model/CardsRepository;", "Lcom/gok/myapplication/model/CardsDataSource;", "()V", "call", "Lretrofit2/Call;", "Lcom/gok/myapplication/data/CardsResponse;", "retrieveCards", "", "callback", "Lcom/gok/myapplication/data/OperationCallback;", "Lcom/gok/myapplication/model/CardSpot;", "app_debug"})
public final class CardsRepository implements com.gok.myapplication.model.CardsDataSource {
    private retrofit2.Call<com.gok.myapplication.data.CardsResponse> call;
    
    @java.lang.Override()
    public void retrieveCards(@org.jetbrains.annotations.NotNull()
    com.gok.myapplication.data.OperationCallback<com.gok.myapplication.model.CardSpot> callback) {
    }
    
    public CardsRepository() {
        super();
    }
}