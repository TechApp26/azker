package com.example.azzkar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        Button Bt_answer9  = findViewById(R.id.button);
        Bt_answer9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bt_answer9=new Intent(getApplicationContext(),answer9.class);
                startActivity(Bt_answer9);
                finish();
            }
        });


    }
}