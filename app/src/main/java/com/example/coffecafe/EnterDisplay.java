package com.example.coffecafe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EnterDisplay extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_enter);
    }

    public void onAboutClick(View view) {
        if (view.getId()==R.id.btnAbout) {
            Intent b = new Intent(EnterDisplay.this, EnterAbout.class);
            startActivity(b);
        }
    }

    public void onContactClick(View view){
        if (view.getId()==R.id.btnContact){
            Intent c = new Intent(EnterDisplay.this, EnterContact.class);
            startActivity(c);
        }
    }

    public void onMapClick(View view){
        if (view.getId()==R.id.btnMap){
            Intent d = new Intent(EnterDisplay.this, EnterMap.class);
            startActivity(d);
        }
    }

    public void onMenuClick(View view){
        if (view.getId()==R.id.btnMenu){
            Intent e = new Intent(EnterDisplay.this, EnterMenu.class);
            startActivity(e);
        }
    }

    public void onTestClick(View view){
        if (view.getId()==R.id.btnTest){
            Intent f = new Intent(EnterDisplay.this, EnterTest.class);
            startActivity(f);
        }
    }
}
