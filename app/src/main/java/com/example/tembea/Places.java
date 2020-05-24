package com.example.tembea;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Places extends AppCompatActivity {
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
