package com.example.diet.ui.analyze;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.example.diet.R;

import java.util.ArrayList;

public class LogFragment extends Fragment {

    private View view;
    private ImageButton breakfastCamera;
    private ImageButton lunchCamera;
    private ImageButton dinnerCamera;
    private ImageButton addBreakfast;
    private ImageButton addLunch;
    private ImageButton addDinner;

    public static LogFragment newInstance() {
        LogFragment fragment = new LogFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_log, container, false);

        ArrayList<ImageButton> cameraButtons = new ArrayList<ImageButton>();
        breakfastCamera = (ImageButton) view.findViewById(R.id.breakfast_camera);
        lunchCamera = (ImageButton) view.findViewById(R.id.lunch_camera);
        dinnerCamera = (ImageButton) view.findViewById(R.id.dinner_camera);
        cameraButtons.add(breakfastCamera);
        cameraButtons.add(lunchCamera);
        cameraButtons.add(dinnerCamera);

        ArrayList<ImageButton> addButtons = new ArrayList<ImageButton>();
        addBreakfast = (ImageButton) view.findViewById(R.id.breakfast_add);
        addLunch = (ImageButton) view.findViewById(R.id.lunch_add);
        addDinner = (ImageButton) view.findViewById(R.id.dinner_add);
        addButtons.add(addBreakfast);
        addButtons.add(addLunch);
        addButtons.add(addDinner);

        for(ImageButton buttons : cameraButtons){

            buttons.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openCamera();
                }
            });
        }

        for(ImageButton buttons : addButtons){

            buttons.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    addFood();
                }
            });
        }





        return view;
    }
    public void addFood(){
        Intent intent = new Intent(this.getContext(), LogActivity.class);
        startActivity(intent);
    }

    public void openCamera(){
        Intent intent = new Intent(this.getContext(), CameraActivity.class);
        startActivity(intent);
    }
}
