package com.example.diet.ui.analyze;

import android.content.Context;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.diet.BaseActivity;
import com.example.diet.R;

public class LogActivity extends BaseActivity {

    RecyclerView recyclerView;
    String s1[], s2[];
    int images[] = {R.drawable.egg, R.drawable.bacon, R.drawable.milk_icon, R.drawable.hamburger_icon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_additems);
        final Context context = this;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.recycler_view);

        s1 = getResources().getStringArray(R.array.foods);
        s2 = getResources().getStringArray(R.array.description);

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(this, s1, s2, images);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


}
