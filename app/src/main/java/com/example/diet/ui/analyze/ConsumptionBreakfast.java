package com.example.diet.ui.analyze;

import android.content.Context;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.diet.BaseActivity;
import com.example.diet.R;

import java.util.ArrayList;

public class ConsumptionBreakfast extends BaseActivity {


    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_consumption_list);
        final Context context = this;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Consumed for breakfast");

        final ArrayList<Item> list = new ArrayList<>();
        list.add(new Item(R.drawable.egg, "egg", "105 calories"));
        list.add(new Item(R.drawable.milk_icon, "milk", "250 calories"));


        recyclerView = findViewById(R.id.recycler_view);

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(list);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
