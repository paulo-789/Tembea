package com.example.tembea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mfindSitesButton;
    private EditText mLocationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLocationEditText=(EditText)findViewById(R.id.locationEditText) ;
        mfindSitesButton = (Button)findViewById(R.id.findSitesButton);
        mfindSitesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = mLocationEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this,Places.class);
                intent.putExtra("location", location);
                startActivity(intent);

            }
        });
    }
}
