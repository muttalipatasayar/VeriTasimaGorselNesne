package com.example.veritasimagorselnesne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextGirdi;
    private Button buttonGonder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextGirdi = findViewById(R.id.editTextGirdi);
        buttonGonder = findViewById(R.id.buttonGonder);

        buttonGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String veri= editTextGirdi.getText().toString();
                Intent yeniIntent =new Intent(MainActivity.this,ActivityB.class);
                yeniIntent.putExtra("mesaj",veri);
                startActivity(yeniIntent);
            }
        });
    }
}