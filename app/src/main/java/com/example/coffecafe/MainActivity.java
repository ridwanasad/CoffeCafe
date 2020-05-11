package com.example.coffecafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Struktuern af metoden
    public void onButtonClick(View view) {
        // vi skaber en object of intent class
        if (view.getId() == R.id.btnEnter) {
            Intent i = new Intent(MainActivity.this, EnterDisplay.class);
            startActivity(i);
        }

    }
    public void onProfileClick(View view) {
        if (view.getId() == R.id.btnProfile) {
            Intent h = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(h);
        }

    }

}


