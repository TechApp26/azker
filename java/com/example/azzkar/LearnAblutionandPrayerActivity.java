package com.example.azzkar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class LearnAblutionandPrayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_ablutionand_prayer);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button Bt_learn4  = findViewById(R.id.button1);
        Bt_learn4 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_learn4=new Intent(getApplicationContext(),learn4 .class);
                startActivity(Bt_learn4);
                finish();
            }
        });

        Button Bt_elhajua4  = findViewById(R.id.button3);
        Bt_elhajua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_elhajua4=new Intent(getApplicationContext(),elhajua4.class);
                startActivity(Bt_elhajua4);
                finish();
            }
        });
        Button Bt_aistikharua4  = findViewById(R.id.button4);
        Bt_aistikharua4 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_aistikharua4=new Intent(getApplicationContext(),aistikharua4 .class);
                startActivity(Bt_aistikharua4);
                finish();
            }
        });


    }
}