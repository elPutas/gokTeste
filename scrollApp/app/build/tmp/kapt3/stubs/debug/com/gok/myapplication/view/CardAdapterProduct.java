package com.gok.myapplication.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/gok/myapplication/view/CardAdapterProduct;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/gok/myapplication/view/CardAdapterProduct$MViewHolder;", "cards", "", "Lcom/gok/myapplication/model/CardProduct;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "vh", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "p1", "update", "data", "MViewHolder", "app_debug"})
public final class CardAdapterProduct extends androidx.recyclerview.widget.RecyclerView.Adapter<com.gok.myapplication.view.CardAdapterProduct.MViewHolder> {
    private java.util.List<com.gok.myapplication.model.CardProduct> cards;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.gok.myapplication.view.CardAdapterProduct.MViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.gok.myapplication.view.CardAdapterProduct.MViewHolder vh, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    java.util.List<com.gok.myapplication.model.CardProduct> data) {
    }
    
    public CardAdapterProduct(@org.jetbrains.annotations.NotNull()
    java.util.List<com.gok.myapplication.model.CardProduct> cards) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/gok/myapplication/view/CardAdapterProduct$MViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "imageView", "Landroid/widget/ImageView;", "bind", "", "card", "Lcom/gok/myapplication/model/CardProduct;", "app_debug"})
    public static final class MViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView imageView = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.gok.myapplication.model.CardProduct card) {
        }
        
        public MViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}