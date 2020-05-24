package com.example.tembea;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Places extends AppCompatActivity {
    private String places[]=new String[]{"Mount Kenya National","Amboseli National Park","South Island National Park","Saiwa Swamp National",
    "Sibiloi National Park","Ruma National Park","Ol Donyo Sabuk National","Ndere Island National","Mount Longonot National"};
    private TextView mlocationTextView;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places);
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mlocationTextView.setText(location);
    }
}
