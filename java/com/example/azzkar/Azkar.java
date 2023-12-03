package com.example.azzkar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Azkar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar);



        Button Bt_MorningandEveningActivity = findViewById(R.id.button);
        Bt_MorningandEveningActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_MorningandEveningActivity = new Intent(getApplicationContext(), MorningandEveningActivity.class);
                startActivity(Bt_MorningandEveningActivity);
                finish();
            }
        });
        Button Bt_WorryandSadnessActivity = findViewById(R.id.button2);
        Bt_WorryandSadnessActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_WorryandSadnessActivity = new Intent(getApplicationContext(), WorryandSadnessActivity.class);
                startActivity(Bt_WorryandSadnessActivity);
                finish();
            }
        });
        Button Bt_RamadanActivity = findViewById(R.id.button3);
        Bt_RamadanActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_RamadanActivity = new Intent(getApplicationContext(), RamadanActivity.class);
                startActivity(Bt_RamadanActivity);
                finish();
            }
        });
        Button Bt_LearnAblutionandPrayerActivity = findViewById(R.id.button4);
        Bt_LearnAblutionandPrayerActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_LearnAblutionandPrayerActivity = new Intent(getApplicationContext(), LearnAblutionandPrayerActivity.class);
                startActivity(Bt_LearnAblutionandPrayerActivity);
                finish();
            }
        });
        Button Bt_PretendtoTravelActivity = findViewById(R.id.button5);
        Bt_PretendtoTravelActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_PretendtoTravelActivity = new Intent(getApplicationContext(), PretendtoTravelActivity.class);
                startActivity(Bt_PretendtoTravelActivity);
                finish();
            }
        });
        Button Bt_FridayActivity = findViewById(R.id.button6);
        Bt_FridayActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_FridayActivity = new Intent(getApplicationContext(), FridayActivity.class);
                startActivity(Bt_FridayActivity);
                finish();
            }
        });
        Button Bt_AlianbiaActivity = findViewById(R.id.button7);
        Bt_AlianbiaActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_AlianbiaActivity = new Intent(getApplicationContext(), AlianbiaActivity.class);
                startActivity(Bt_AlianbiaActivity);
                finish();
            }
        });
        Button Bt_AlianbiaWalrusulActivity = findViewById(R.id.button8);
        Bt_AlianbiaWalrusulActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_AlianbiaWalrusulActivity = new Intent(getApplicationContext(), AlianbiaWalrusulActivity.class);
                startActivity(Bt_AlianbiaWalrusulActivity);
                finish();
            }
        });
        Button Bt_AnswerActivity = findViewById(R.id.button9);
        Bt_AnswerActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_AnswerActivity = new Intent(getApplicationContext(), AnswerActivity.class);
                startActivity(Bt_AnswerActivity);
                finish();
            }
        });


    }
}