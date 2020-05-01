package com.example.diet.ui.analyze;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.diet.BaseActivity;
import com.example.diet.R;

import java.util.ArrayList;

public class LogActivity extends BaseActivity{

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_additems);
        final Context context = this;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Add Items");

        final ArrayList<Item> list = new ArrayList<>();
        list.add(new Item(R.drawable.egg, "egg", "105 calories"));
        list.add(new Item(R.drawable.bacon, "bacon", "105 calories"));
        list.add(new Item(R.drawable.milk_icon, "milk", "105 calories"));
        list.add(new Item(R.drawable.hamburger_icon, "hamburger", "105 calories"));

        recyclerView = findViewById(R.id.recycler_view);



        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(list);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerAdapter.setOnItemClickListener(new RecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(context, ItemDetails.class).putExtra("food", list.get(position).getFoodName());
                startActivity(intent);
            }
        });
    }

}
