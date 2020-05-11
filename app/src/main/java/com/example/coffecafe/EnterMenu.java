package com.example.coffecafe;

import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class EnterMenu extends Activity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int image [] = {R.drawable.ice_coffee, R.drawable.ice_latte, R.drawable.frappe,
            R.drawable.coffee, R.drawable.tea, R.drawable.espresso, R.drawable.cappachino,
            R.drawable.coco, R.drawable.latte, R.drawable.strawberry_sprinkles,
            R.drawable.plaine_coco, R.drawable.smiley, R.drawable.coconut, R.drawable.coco_sprinkles};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_enter);

        recyclerView = findViewById(R.id.recyclerView);

        // Storring inside my string varibles
        s1 = getResources().getStringArray(R.array.Products);
        s2 = getResources().getStringArray(R.array.Description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, image);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}

