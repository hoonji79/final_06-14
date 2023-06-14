package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class select_mypage extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_mypage);


        ToggleButton move_profile = findViewById(R.id.move_profile);
        ToggleButton move_carProtile = findViewById(R.id.move_carProfile);

        move_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(select_mypage.this,mypage.class);
                startActivity(intent);
            }
        });

        move_carProtile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(select_mypage.this,insert_vehicle.class);
            }
        });

    }
}
