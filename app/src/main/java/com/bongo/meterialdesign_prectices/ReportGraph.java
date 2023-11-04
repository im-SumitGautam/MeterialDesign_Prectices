package com.bongo.meterialdesign_prectices;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;

import java.util.ArrayList;
import java.util.List;


public class ReportGraph extends AppCompatActivity {

    AnyChartView anyChartView;

    String[] month = {"JAN","FEB","MAR","APR","MAY","JUNE"};
    int[] earning = {100,400,400,300,200,100};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_graph);

        Toolbar toolbar = (Toolbar) findViewById(R.id.home_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Reports");

        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.baseline_keyboard_backspace_24));

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });



        anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);
        setupPieChart();


    }

    public void setupPieChart(){

        Pie pie = AnyChart.pie();
        List<DataEntry> dataEntries = new ArrayList<>();

        for(int i = 0; i<month.length; i++){
            dataEntries.add(new ValueDataEntry(month[i], earning[i]));
        }

        pie.data(dataEntries);
        anyChartView.setChart(pie);

    }
}