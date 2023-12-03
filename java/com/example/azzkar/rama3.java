package com.example.azzkar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class rama3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rama3);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button Bt_nara13  = findViewById(R.id.button1);
        Bt_nara13 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_nara13=new Intent(getApplicationContext(),nara13 .class);
                startActivity(Bt_nara13);
                finish();
            }
        });
        Button Bt_magfara23  = findViewById(R.id.button2);
        Bt_magfara23 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_magfara23=new Intent(getApplicationContext(),magfara23 .class);
                startActivity(Bt_magfara23);
                finish();
            }
        });
        Button Bt_rahd33  = findViewById(R.id.button3);
        Bt_rahd33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_rahd33=new Intent(getApplicationContext(),rahd33.class);
                startActivity(Bt_rahd33);
                finish();
            }
        });
        Button Bt_ker43 = findViewById(R.id.button4);
        Bt_ker43 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_ker43=new Intent(getApplicationContext(),ker43 .class);
                startActivity(Bt_ker43);
                finish();
            }
        });
        Button Bt_elwaleden53  = findViewById(R.id.button5);
        Bt_elwaleden53 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_elwaleden53=new Intent(getApplicationContext(),elwaleden53 .class);
                startActivity(Bt_elwaleden53);
                finish();
            }
        });
        Button Bt_eldeen63  = findViewById(R.id.button6);
        Bt_eldeen63 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_eldeen63=new Intent(getApplicationContext(),eldeen63 .class);
                startActivity(Bt_eldeen63);
                finish();
            }
        });
        Button Bt_alhal73  = findViewById(R.id.button7);
        Bt_alhal73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_alhal73=new Intent(getApplicationContext(),alhal73.class);
                startActivity(Bt_alhal73);
                finish();
            }
        });
        Button Bt_aleafw83  = findViewById(R.id.button8);
        Bt_aleafw83 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_aleafw83=new Intent(getApplicationContext(),aleafw83 .class);
                startActivity(Bt_aleafw83);
                finish();
            }
        });
        Button Bt_nafsi93  = findViewById(R.id.button9);
        Bt_nafsi93 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_nafsi93=new Intent(getApplicationContext(),nafsi93 .class);
                startActivity(Bt_nafsi93);
                finish();
            }
        });
        Button Bt_alfiten103  = findViewById(R.id.button10);
        Bt_alfiten103 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_alfiten103=new Intent(getApplicationContext(),alfiten103 .class);
                startActivity(Bt_alfiten103);
                finish();
            }
        });
        Button Bt_alhifz113  = findViewById(R.id.button11);
        Bt_alhifz113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_alhifz113=new Intent(getApplicationContext(),alhifz113.class);
                startActivity(Bt_alhifz113);
                finish();
            }
        });
        Button Bt_twslat123  = findViewById(R.id.button12);
        Bt_twslat123 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_twslat123=new Intent(getApplicationContext(),twslat123 .class);
                startActivity(Bt_twslat123);
                finish();
            }
        });



    }
}