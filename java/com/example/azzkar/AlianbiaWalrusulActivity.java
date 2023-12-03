package com.example.azzkar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class AlianbiaWalrusulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alianbia_walrusul);

        Button Bt_walrusul8 = findViewById(R.id.button);
        Bt_walrusul8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_walrusul8=new Intent(getApplicationContext(),walrusul8.class);
                startActivity(Bt_walrusul8);
                finish();
            }
        });
        Button Bt_mogzat8  = findViewById(R.id.button2);
        Bt_mogzat8 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_mogzat8=new Intent(getApplicationContext(),mogzat8 .class);
                startActivity(Bt_mogzat8);
                finish();
            }
        });


    }
}