package com.example.tembea;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Places extends AppCompatActivity {
    private String places[]=new String[]{"Mount Kenya National","Amboseli National Park","South Island National Park","Saiwa Swamp National",
    "Sibiloi National Park","Ruma National Park","Ol Donyo Sabuk National","Ndere Island National","Mount Longonot National"};
    private TextView mlocationTextView;
    private ListView mListView;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places);
        mlocationTextView=(TextView)findViewById(R.id.locationTextView);
        mListView=(ListView)findViewById(R.id.listView) ;

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,places);
        mListView.setAdapter(adapter);


        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String places = ((TextView)view).getText().toString();
                Toast.makeText(Places.this,places,Toast.LENGTH_LONG).show();

            }
        });
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mlocationTextView.setText("showing results for" + location);
    }
}
