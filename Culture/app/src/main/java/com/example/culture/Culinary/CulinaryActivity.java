package com.example.culture.Culinary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.culture.R;
import com.example.culture.prehistoric.Adapter_RV;
import com.example.culture.prehistoric.Data_Prehistoric;

import java.util.ArrayList;

public class CulinaryActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter_RV adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culinary);

        init();

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void init(){
        this.recyclerView = findViewById(R.id.my_recycler_view);
        this.layoutManager = new LinearLayoutManager(getBaseContext());
        this.adapter = new Adapter_RV(getBaseContext(), getListData());
    }

    private ArrayList<Data_Prehistoric> getListData(){
        ArrayList<Data_Prehistoric> arrayListData = new ArrayList<>();

        arrayListData.add(new Data_Prehistoric(R.drawable.coto, "Coto Makassar"));
        arrayListData.add(new Data_Prehistoric(R.drawable.konro, "Konro"));
        arrayListData.add(new Data_Prehistoric(R.drawable.sop, "Sop Saudara"));

        return  arrayListData;
    }
}
