package com.example.azzkar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class FridayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friday);

        Button Bt_friday6  = findViewById(R.id.button);
        Bt_friday6 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_friday6=new Intent(getApplicationContext(),friday6 .class);
                startActivity(Bt_friday6 );
                finish();
            }
        });


    }
}