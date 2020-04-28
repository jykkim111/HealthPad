package com.example.diet.ui.home;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.graphics.Typeface;


import androidx.fragment.app.Fragment;


import com.example.diet.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.MPPointF;

import java.util.ArrayList;

public class HomeFragment extends Fragment{
    View view;
    private PieChart nutritionChart;



    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

        /*
        nutritionChart = (PieChart) view.findViewById(R.id.nut_chart);
        nutritionChart.setUsePercentValues(true);
        nutritionChart.getDescription().setEnabled(false);
        nutritionChart.setExtraOffsets(5, 10, 5, 5);
        nutritionChart.setDragDecelerationFrictionCoef(0.95f);


        nutritionChart.setCenterText("1816\nCalories Under Budget");

        nutritionChart.setDrawHoleEnabled(true);
        nutritionChart.setHoleColor(Color.WHITE);


        nutritionChart.setTransparentCircleColor(Color.WHITE);
        nutritionChart.setTransparentCircleAlpha(110);

        nutritionChart.setHoleRadius(58f);
        nutritionChart.setTransparentCircleRadius(61f);

        nutritionChart.setDrawCenterText(true);

        nutritionChart.setRotationAngle(0);
        nutritionChart.setRotationEnabled(false);




        XAxis xAxis = nutritionChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setAxisMinimum(0f);
        xAxis.setGranularity(1f);
        ArrayList<String> chartLabels = new ArrayList<>();
        chartLabels.add("Protein");
        chartLabels.add("Carbs");
        chartLabels.add("Vitamins");
        chartLabels.add("Fiber");
        xAxis.setValueFormatter(new IndexAxisValueFormatter(chartLabels));


        nutritionChart.setTouchEnabled(false);



*/

        return view;
    }







}