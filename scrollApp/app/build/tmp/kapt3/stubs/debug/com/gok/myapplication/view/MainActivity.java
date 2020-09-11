package com.gok.myapplication.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001bH\u0014J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00120\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/gok/myapplication/view/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapterProduct", "Lcom/gok/myapplication/view/CardAdapterProduct;", "adapterSpot", "Lcom/gok/myapplication/view/CardAdapterSpot;", "defaultImg", "", "getDefaultImg", "()Ljava/lang/String;", "emptyListObserver", "Landroidx/lifecycle/Observer;", "", "isViewLoadingObserver", "onMessageErrorObserver", "", "renderCards", "", "Lcom/gok/myapplication/model/CardSpot;", "renderCardsCash", "Lcom/gok/myapplication/model/Card;", "renderCardsProduct", "Lcom/gok/myapplication/model/CardProduct;", "viewModel", "Lcom/gok/myapplication/viewModel/CardsViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setupUI", "setupViewModel", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String defaultImg = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAAAP1BMVEXk5OSSkpKOjo7o6OiMjIzc3Nytra3Dw8Pp6emkpKSnp6e1tbXg4ODU1NSTk5Pe3t6dnZ26urrOzs7Hx8fR0dE9mt/DAAACD0lEQVR4nO3a23KqMBSAYchKyjnBw/s/6yYgSqsCdTq1K/v/rjoOF/ldYkCaZQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8bkeD2aOXdK32RdL3Zp27fvdbXOJPvZHqVU5TG5H29h/f2qDFRPnLjStlWFsYUOguNcZc/1w+Mhceu/IU1/axroYSzk5XIWHiq7EHdGOfCtrLW9u75+sfCOtd3Ls6F3vj4fRmeHxgLC5N/6CyUw7RnmOfrH8/DTG9hddnz/HL94haf2rGwNSvvwR91KewfFErI81ui9sLm8imtF0Nzw5npr4nKC+drN9vdZubGr55rovZCOft4cX36GnhL1F44XNCcDqfbDZIEP19w+zC+qr4w3icuz8HlTcU4xQQKly/eJnidYhqFcp4+kO5TYDwXEyksC3sop33wK5dE4RCYD/cOdxOM+2QjCRTGwGFHLMJ9YBqFU2A86e4DkyiUOfChBArjBB8NL5nC9QkmUdivTTCRwvRnmHyhXae/sNug+qotv7+3eHig3sJhhuUeagvjs6dqD5/bo8bCLHzn+WHQWJh1vd35DDi+HRoLM2nD8G0Z2g1SStkq/FV/JI01VbNDHff+d6/2Jd94mL9ra/l74g/CG1c1E3/WOcL4g/Cu/6lxG4/CAQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAUvQPO+QdjH50+9MAAAAASUVORK5CYII=";
    private com.gok.myapplication.viewModel.CardsViewModel viewModel;
    private com.gok.myapplication.view.CardAdapterSpot adapterSpot;
    private com.gok.myapplication.view.CardAdapterProduct adapterProduct;
    private final androidx.lifecycle.Observer<java.util.List<com.gok.myapplication.model.CardSpot>> renderCards = null;
    private final androidx.lifecycle.Observer<java.util.List<com.gok.myapplication.model.CardProduct>> renderCardsProduct = null;
    private final androidx.lifecycle.Observer<com.gok.myapplication.model.Card> renderCardsCash = null;
    private final androidx.lifecycle.Observer<java.lang.Boolean> isViewLoadingObserver = null;
    private final androidx.lifecycle.Observer<java.lang.Object> onMessageErrorObserver = null;
    private final androidx.lifecycle.Observer<java.lang.Boolean> emptyListObserver = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "CONSOLE";
    public static final com.gok.myapplication.view.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDefaultImg() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupUI() {
    }
    
    private final void setupViewModel() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/gok/myapplication/view/MainActivity$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}