package com.example.diet.ui.home;

import android.graphics.Color;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.fragment.app.Fragment;


import com.example.diet.R;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.LegendRenderer;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class NutritionFragment extends Fragment{
    View view;
    private PieChart nutritionChart;
    int[] colorClassArray = new int[] {Color.parseColor("#feffab"), Color.parseColor("#ff2181"), Color.parseColor("#ff9421")};



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
        nutritionChart.setTransparentCircleAlpha(100);
        nutritionChart.setHoleRadius(48f);
        nutritionChart.setTransparentCircleRadius(51f);


        nutritionChart.setRotationAngle(0);
        nutritionChart.setRotationEnabled(false);
        nutritionChart.setTouchEnabled(false);

        nutritionChart.setDrawSliceText(false);
        nutritionChart.getLegend().setEnabled(false);

        ArrayList<PieEntry> yValues = new ArrayList<>();

        yValues.add(new PieEntry(1f, "Fat"));
        yValues.add(new PieEntry(2f, "Carbs"));
        yValues.add(new PieEntry(3f, "Protein"));

        nutritionChart.setDrawEntryLabels(true);
        nutritionChart.setEntryLabelColor(R.color.black);
        nutritionChart.animateY(1000, Easing.EaseInOutCubic);

        PieDataSet dataSet = new PieDataSet(yValues, "");
        dataSet.setSliceSpace(10f);
        dataSet.setSelectionShift(5f);
        dataSet.setColors(colorClassArray);
        dataSet.setDrawValues(true);
        dataSet.setValueTextSize(20.0f);


        PieData data = new PieData(dataSet);
        nutritionChart.setData(data);

        ArrayList<BarEntry> dataVals = new ArrayList<BarEntry>();
        dataVals.add(new BarEntry(0, new float[]{1, 2, 3}));
        dataVals.add(new BarEntry(1, new float[]{1, 3, 2}));
        dataVals.add(new BarEntry(2, new float[]{3, 2, 1}));
        dataVals.add(new BarEntry(3, new float[]{1, 2, 3}));
        dataVals.add(new BarEntry(4, new float[]{3, 2, 1}));
        dataVals.add(new BarEntry(5, new float[]{1, 3, 2}));
        dataVals.add(new BarEntry(6, new float[]{1, 2, 3}));

        BarChart stackedChart = (BarChart) view.findViewById(R.id.nutrient_week_chart);
        BarDataSet barDataSet = new BarDataSet(dataVals, "");
        barDataSet.setColors(colorClassArray);

        BarData barData = new BarData(barDataSet);
        stackedChart.setData(barData);
        stackedChart.getLegend().setEnabled(false);
        stackedChart.setTouchEnabled(false);
        stackedChart.setDrawValueAboveBar(false);
        stackedChart.getXAxis().setDrawLabels(false);











        return view;
    }





}