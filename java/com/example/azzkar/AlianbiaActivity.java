package com.example.azzkar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AlianbiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alianbia);





        Button Bt_ayat7 = findViewById(R.id.button2);
        Bt_ayat7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_ayat7=new Intent(getApplicationContext(),ayat7.class);
                startActivity(Bt_ayat7);
                finish();
            }
        });
        Button Bt_alianbia7  = findViewById(R.id.button);
        Bt_alianbia7 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_alianbia7=new Intent(getApplicationContext(),alianbia7 .class);
                startActivity(Bt_alianbia7);
                finish();
            }
        });
    }

    }
