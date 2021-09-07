package com.example.myapplication;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private MutableLiveData mLiveData;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        Log.d("ViewModel", "allViewModel: Level_C_VM start");
    }
    public MutableLiveData<List<Model>> LoadList(){
        List<Model> listL3ItemList ; listL3ItemList =new ArrayList<>();
        Log.d("ViewModel", "allViewModel: LoadLevel3List start");
        if(mLiveData == null){
            mLiveData = new MutableLiveData();
            Log.d("ViewModel", "allViewModel: mLiveData null ");
            listL3ItemList.add(new Model("https://firebasestorage.googleapis.com/v0/b/hather-kache.appspot.com/o/HatherKacheApp%2FSylhet%2FFoodDelivery%2F1624882827761.JPEG?alt=media&token=c94f8841-4c20-46e1-b3c7-a4127271755a", "Text1","Video Text 1"));
            mLiveData.postValue(listL3ItemList);
            listL3ItemList.add(new Model("https://firebasestorage.googleapis.com/v0/b/hather-kache.appspot.com/o/HatherKacheApp%2FSylhet%2FFoodDelivery%2F1624895600219.JPEG?alt=media&token=3b151742-bbee-4ccc-b4e8-fef8f7b42c6a", "Text2","Video Text 2"));
            mLiveData.postValue(listL3ItemList);
            listL3ItemList.add(new Model("https://firebasestorage.googleapis.com/v0/b/hather-kache.appspot.com/o/HatherKacheApp%2FSylhet%2FFoodDelivery%2F1625584176179.JPEG?alt=media&token=1f4be03e-3160-4961-a9b7-8a090caaaa62", "Text3","Video Text 3"));
            mLiveData.postValue(listL3ItemList);

        }
        Log.d("ViewModel", "allViewModel: mLiveData total list size"+listL3ItemList.size());
        return mLiveData;
    }
}
