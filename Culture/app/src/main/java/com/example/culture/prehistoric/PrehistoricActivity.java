package com.example.culture.prehistoric;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.culture.R;

import java.util.ArrayList;

public class PrehistoricActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter_RV adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prehistoric);

        init();

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void init(){
        this.recyclerView = findViewById(R.id.my_recycler_view);
        this.layoutManager = new LinearLayoutManager(getBaseContext());
        this.adapter = new Adapter_RV(getBaseContext(), getListData());
    }

    private ArrayList<Data_Prehistoric>getListData(){
        ArrayList<Data_Prehistoric> arrayListData = new ArrayList<>();

        arrayListData.add(new Data_Prehistoric(R.drawable.leang, "Leang-leang"));
        arrayListData.add(new Data_Prehistoric(R.drawable.sumpang, "Sumpang Bita"));
        arrayListData.add(new Data_Prehistoric(R.drawable.balla, "Balla Lompoa"));

        return  arrayListData;
    }
}
