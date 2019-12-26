package com.example.culture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.culture.Culinary.CulinaryActivity;
import com.example.culture.Culture.CultureActivity;
import com.example.culture.Tribe.TribeActivity;
import com.example.culture.prehistoric.PrehistoricActivity;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private CardView prasejarah,kuliner,suku,budaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        prasejarah = (CardView) findViewById(R.id.prehistoric);
        kuliner = (CardView) findViewById(R.id.culinary);
        suku = (CardView) findViewById(R.id.tribe);
        budaya = (CardView) findViewById(R.id.culture);

        prasejarah.setOnClickListener(this);
        kuliner.setOnClickListener(this);
        suku.setOnClickListener(this);
        budaya.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.prehistoric : i = new Intent(this, PrehistoricActivity.class); startActivity(i); break;
            case R.id.culinary : i = new Intent(this, CulinaryActivity.class); startActivity(i); break;
            case R.id.tribe : i = new Intent(this, TribeActivity.class); startActivity(i); break;
            case R.id.culture : i = new Intent(this, CultureActivity.class); startActivity(i); break;
            default:break;
        }
    }
}
