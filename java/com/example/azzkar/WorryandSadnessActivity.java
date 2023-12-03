package com.example.azzkar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class WorryandSadnessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worryand_sadness);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button Bt_haam2  = findViewById(R.id.button);
        Bt_haam2 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_haam2=new Intent(getApplicationContext(),haam2 .class);
                startActivity(Bt_haam2);
                finish();
            }
        });
        Button Bt_ayat2  = findViewById(R.id.button2);
        Bt_ayat2 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_ayat2=new Intent(getApplicationContext(),ayat2 .class);
                startActivity(Bt_ayat2);
                finish();
            }
        });
        Button Bt_razk2  = findViewById(R.id.button3);
        Bt_razk2 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_razk2=new Intent(getApplicationContext(),razk2 .class);
                startActivity(Bt_razk2);
                finish();
            }
        });



    }
}