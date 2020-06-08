package com.example.tembea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mapbox.services.android.navigation.ui.v5.NavigationContract;

import butterknife.BindView;
import butterknife.ButterKnife;

public class activity_login extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.registerTextView) TextView mRegisterTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);
        mRegisterTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == mRegisterTextView) {
            Intent intent = new Intent(activity_login.this, CreateAccountActivity.class);
            startActivity(intent);
            finish();
        }
    }
}