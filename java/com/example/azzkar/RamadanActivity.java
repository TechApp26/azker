package com.example.azzkar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class RamadanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramadan);

        Button Bt_rama3  = findViewById(R.id.button);
        Bt_rama3 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_rama3=new Intent(getApplicationContext(),rama3 .class);
                startActivity(Bt_rama3);
                finish();
            }
        });
        Button Bt_taraweh3  = findViewById(R.id.button2);
        Bt_taraweh3 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_taraweh3=new Intent(getApplicationContext(),taraweh3 .class);
                startActivity(Bt_taraweh3);
                finish();
            }
        });
        Button Bt_eid3  = findViewById(R.id.button3);
        Bt_eid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_eid3=new Intent(getApplicationContext(),eid3.class);
                startActivity(Bt_eid3);
                finish();
            }
        });
        Button Bt_leyel3  = findViewById(R.id.button4);
        Bt_leyel3 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_leyel3=new Intent(getApplicationContext(),leyel3 .class);
                startActivity(Bt_leyel3);
                finish();
            }
        });



    }
}