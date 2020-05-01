package com.example.diet.ui.analyze;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.diet.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LogFragment extends Fragment {

    private View view;
    private ImageButton breakfastCamera;
    private ImageButton lunchCamera;
    private ImageButton dinnerCamera;
    private ImageButton addBreakfast;
    private ImageButton addLunch;
    private ImageButton addDinner;
    private CardView breakfastCard;
    private CardView lunchCard;
    private CardView dinnerCard;

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

        ArrayList<CardView> logCards = new ArrayList<CardView>();
        breakfastCard = (CardView) view.findViewById(R.id.card_breakfast);
        lunchCard = (CardView) view.findViewById(R.id.card_lunch);
        dinnerCard = (CardView) view.findViewById(R.id.card_dinner);
        logCards.add(breakfastCard);
        logCards.add(lunchCard);
        logCards.add(dinnerCard);


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




        breakfastCard.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getContext(), ConsumptionBreakfast.class);
                        startActivity(intent);
                    }
                });

        lunchCard.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getContext(), ConsumptionLunch.class);
                        startActivity(intent);
                    }
                });


        dinnerCard.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getContext(), ConsumptionDinner.class);
                        startActivity(intent);
                 }
                });



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
