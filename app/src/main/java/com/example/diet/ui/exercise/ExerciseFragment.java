package com.example.diet.ui.exercise;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.diet.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ExerciseFragment extends Fragment {
    View view;
    private FloatingActionButton addButton;


    public static ExerciseFragment newInstance() {
        ExerciseFragment fragment = new ExerciseFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_exercise, container, false);
        addButton = (FloatingActionButton) view.findViewById(R.id.activity_addbutton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ActivityList.class);
                startActivity(intent);
            }
        });

        return view;
    }
}