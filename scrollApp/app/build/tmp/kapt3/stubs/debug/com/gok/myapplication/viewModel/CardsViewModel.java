package com.gok.myapplication.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001e\u001a\u00020\u001fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/gok/myapplication/viewModel/CardsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/gok/myapplication/model/CardsDataSource;", "(Lcom/gok/myapplication/model/CardsDataSource;)V", "_cardsCash", "Landroidx/lifecycle/MutableLiveData;", "Lcom/gok/myapplication/model/Card;", "_cardsProduct", "", "Lcom/gok/myapplication/model/CardProduct;", "_cardsSpot", "Lcom/gok/myapplication/model/CardSpot;", "_isEmptyList", "", "_isViewLoading", "_onMessageError", "", "cardsCash", "Landroidx/lifecycle/LiveData;", "getCardsCash", "()Landroidx/lifecycle/LiveData;", "cardsProduct", "getCardsProduct", "cardsSpot", "getCardsSpot", "isEmptyList", "isViewLoading", "onMessageError", "getOnMessageError", "loadCards", "", "app_debug"})
public final class CardsViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.gok.myapplication.model.CardSpot>> _cardsSpot = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.gok.myapplication.model.CardSpot>> cardsSpot = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.gok.myapplication.model.CardProduct>> _cardsProduct = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.gok.myapplication.model.CardProduct>> cardsProduct = null;
    private final androidx.lifecycle.MutableLiveData<com.gok.myapplication.model.Card> _cardsCash = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.gok.myapplication.model.Card> cardsCash = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isViewLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isViewLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> _onMessageError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Object> onMessageError = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isEmptyList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isEmptyList = null;
    private final com.gok.myapplication.model.CardsDataSource repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.gok.myapplication.model.CardSpot>> getCardsSpot() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.gok.myapplication.model.CardProduct>> getCardsProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.gok.myapplication.model.Card> getCardsCash() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isViewLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Object> getOnMessageError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isEmptyList() {
        return null;
    }
    
    public final void loadCards() {
    }
    
    public CardsViewModel(@org.jetbrains.annotations.NotNull()
    com.gok.myapplication.model.CardsDataSource repository) {
        super();
    }
}