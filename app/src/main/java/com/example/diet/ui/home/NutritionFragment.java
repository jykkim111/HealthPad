package com.example.diet.ui.home;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.fragment.app.Fragment;


import com.example.diet.R;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class NutritionFragment extends Fragment{
    View view;
    private PieChart nutritionChart;



    public static NutritionFragment newInstance() {
        NutritionFragment fragment = new NutritionFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_nutrition, container, false);


        nutritionChart = (PieChart) view.findViewById(R.id.nutrition_pie);
        nutritionChart.setUsePercentValues(true);
        nutritionChart.getDescription().setEnabled(false);
        nutritionChart.setExtraOffsets(5, 10, 5, 5);
        nutritionChart.setDragDecelerationFrictionCoef(0.95f);

        nutritionChart.setDrawHoleEnabled(true);
        nutritionChart.setHoleColor(Color.WHITE);
        nutritionChart.setTransparentCircleColor(Color.WHITE);
        nutritionChart.setTransparentCircleAlpha(110);
        nutritionChart.setHoleRadius(58f);
        nutritionChart.setTransparentCircleRadius(61f);


        nutritionChart.setRotationAngle(0);
        nutritionChart.setRotationEnabled(false);
        nutritionChart.setTouchEnabled(false);

        nutritionChart.setDrawSliceText(false);
        nutritionChart.getLegend().setEnabled(false);

        ArrayList<PieEntry> yValues = new ArrayList<>();

        yValues.add(new PieEntry(1f, "Fat"));
        yValues.add(new PieEntry(2f, "Carbs"));
        yValues.add(new PieEntry(3f, "Protein"));
        yValues.add(new PieEntry(4, "Vitamins"));

        nutritionChart.animateY(1000, Easing.EaseInOutCubic);

        PieDataSet dataSet = new PieDataSet(yValues, "");
        dataSet.setSliceSpace(10f);
        dataSet.setSelectionShift(5f);
        dataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        dataSet.setDrawValues(false);


        PieData data = new PieData(dataSet);
        nutritionChart.setData(data);





        return view;
    }







}