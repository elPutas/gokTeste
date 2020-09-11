package com.gok.myapplication.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J2\u0010\u0007\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lcom/gok/myapplication/data/OperationCallback;", "T", "", "onError", "", "error", "", "onSuccess", "dataSpot", "", "Lcom/gok/myapplication/model/CardSpot;", "dataProduct", "Lcom/gok/myapplication/model/CardProduct;", "dataCash", "Lcom/gok/myapplication/model/Card;", "app_debug"})
public abstract interface OperationCallback<T extends java.lang.Object> {
    
    public abstract void onSuccess(@org.jetbrains.annotations.Nullable()
    java.util.List<com.gok.myapplication.model.CardSpot> dataSpot, @org.jetbrains.annotations.Nullable()
    java.util.List<com.gok.myapplication.model.CardProduct> dataProduct, @org.jetbrains.annotations.Nullable()
    com.gok.myapplication.model.Card dataCash);
    
    public abstract void onError(@org.jetbrains.annotations.Nullable()
    java.lang.String error);
}