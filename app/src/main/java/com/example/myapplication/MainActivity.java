package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecylerviewClickInterface{

    private MutableLiveData mLiveData;
    private RecyclerView mRecylerView;
    public List<Model> listItem = new ArrayList<>();
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecylerView = (RecyclerView)findViewById(R.id.recylerview);
        callViewModel();

        /*int arr[]  = {51,25,125,6,3};
        Arrays.sort(arr);*/
    }
    private MainActivityViewModel level_c_vm;
    private void callViewModel() {
        Log.d("ViewModel", "allViewModel: start");
        level_c_vm = new ViewModelProvider(this).get(MainActivityViewModel.class);
        level_c_vm.LoadList().observe(this, new Observer<List<Model>>() {
            @Override
            public void onChanged(List<Model> models) {
                Log.d("ViewModel", "allViewModel: onChanged listview size = "+models.size());
                listItem = models;
                adapter = new Adapter(MainActivity.this,models,MainActivity.this);
                adapter.notifyDataSetChanged();
                mRecylerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL,false));
                mRecylerView.setAdapter(adapter);

            }
        });
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(getApplicationContext(),DetailsActivity.class);
        intent.putExtra("text", listItem.get(position).getText());
        intent.putExtra("photourl", listItem.get(position).getPhotoUrl());
        intent.putExtra("videofeed", listItem.get(position).getVideofeed());
        startActivity(intent);
    }


}