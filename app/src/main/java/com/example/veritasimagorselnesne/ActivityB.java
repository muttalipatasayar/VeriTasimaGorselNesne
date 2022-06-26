package com.example.veritasimagorselnesne;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {
    private TextView textViewCikti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        textViewCikti = findViewById(R.id.textViewCikti);

        String gelenVeri= getIntent().getStringExtra("mesaj");
        textViewCikti.setText(gelenVeri);

    }
}