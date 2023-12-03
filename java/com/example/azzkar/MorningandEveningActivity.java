package com.example.azzkar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MorningandEveningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morningand_evening);

        Button Bt_morning1  = findViewById(R.id.button);
        Bt_morning1 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_morning1=new Intent(getApplicationContext(),morning1 .class);
                startActivity(Bt_morning1 );
                finish();
            }
        });
        Button Bt_evening1  = findViewById(R.id.button2);
        Bt_evening1 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_evening1=new Intent(getApplicationContext(),evening1 .class);
                startActivity(Bt_evening1);
                finish();
            }
        });
        Button Bt_noom1  = findViewById(R.id.button3);
        Bt_noom1 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_noom1=new Intent(getApplicationContext(),noom1 .class);
                startActivity(Bt_noom1);
                finish();
            }
        });
        Button Bt_leyel1  = findViewById(R.id.button4);
        Bt_leyel1 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_leyel1=new Intent(getApplicationContext(),leyel1 .class);
                startActivity(Bt_leyel1);
                finish();
            }
        });
        Button Bt_worrie1  = findViewById(R.id.button5);
        Bt_worrie1 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_worrie1=new Intent(getApplicationContext(),worrie1 .class);
                startActivity(Bt_worrie1);
                finish();
            }
        });
        Button Bt_helm1  = findViewById(R.id.button6);
        Bt_helm1 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_helm1=new Intent(getApplicationContext(),helm1 .class);
                startActivity(Bt_helm1);
                finish();
            }
        });
        Button Bt_weekup1  = findViewById(R.id.button7);
        Bt_weekup1 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_weekup1=new Intent(getApplicationContext(),weekup1 .class);
                startActivity(Bt_weekup1);
                finish();
            }
        });


    }
}