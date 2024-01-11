package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.volumecalculator.Adapters.Adapter;
import com.example.volumecalculator.Calculation.CubeCal;
import com.example.volumecalculator.Calculation.PrismCal;
import com.example.volumecalculator.Calculation.cylinderCal;
import com.example.volumecalculator.Calculation.sphereCal;
import com.example.volumecalculator.Models.ModelClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

  ArrayList<ModelClass> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.gridview);

        list =new ArrayList<>();

        list.add(new ModelClass(R.drawable.sphere, "Sphere"));
        list.add(new ModelClass(R.drawable.cube, " Cube"));
        list.add(new ModelClass(R.drawable.cylinder, "Cylinder"));
        list.add(new ModelClass(R.drawable.prism, "Prism"));

        Adapter adapter=new Adapter(list, this);
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              if(i==0){
                  Intent intent=new Intent(MainActivity.this, sphereCal.class);
                  startActivity(intent);
              } else if (i==1) {
                  Intent intent=new Intent(MainActivity.this, CubeCal.class);
                  startActivity(intent);
              } else if (i==2) {
                  Intent intent=new Intent(MainActivity.this, cylinderCal.class);
                  startActivity(intent);
              } else if (i==3) {
                  Intent intent=new Intent(MainActivity.this, PrismCal.class);
                  startActivity(intent);
              }
            }
        });
    }



}