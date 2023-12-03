package com.example.azzkar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class PretendtoTravelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pretendto_travel);

        Button Bt_travel5  = findViewById(R.id.button);
        Bt_travel5 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_travel5=new Intent(getApplicationContext(),travel5 .class);
                startActivity(Bt_travel5 );
                finish();
            }
        });


    }
}