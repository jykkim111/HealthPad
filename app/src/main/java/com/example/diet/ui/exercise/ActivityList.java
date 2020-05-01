package com.example.diet.ui.exercise;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.diet.BaseActivity;
import com.example.diet.R;
import com.example.diet.ui.analyze.Item;
import com.example.diet.ui.analyze.ItemDetails;
import com.example.diet.ui.analyze.RecyclerAdapter;

import java.util.ArrayList;

public class ActivityList extends BaseActivity{

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_addactivities);
        final Context context = this;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Add Items");

        final ArrayList<ExerciseActivity> list = new ArrayList<>();
        list.add(new ExerciseActivity(R.drawable.tennis, "Tennis", "105 calories/h"));
        list.add(new ExerciseActivity(R.drawable.ping_pong, "Ping Pong", "105 calories/h"));
        list.add(new ExerciseActivity(R.drawable.running, "Running", "105 calories/h"));
        list.add(new ExerciseActivity(R.drawable.badminton, "Badminton", "105 calories/h"));

        recyclerView = findViewById(R.id.recycler_view);

        ExerciseRecyclerAdapter recyclerAdapter = new ExerciseRecyclerAdapter(list);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerAdapter.setOnItemClickListener(new ExerciseRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(context, ActivityDetails.class).putExtra("activity", list.get(position).getActivityName());
                startActivity(intent);
            }
        });
    }

}
