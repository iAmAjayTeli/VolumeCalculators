package com.example.volumecalculator.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.volumecalculator.Models.ModelClass;
import com.example.volumecalculator.R;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<ModelClass> {

    ArrayList<ModelClass> list;
    Context context;

    public Adapter(ArrayList<ModelClass> list, Context context) {
        super(context.getApplicationContext(), R.layout.sample_design, list);
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
      view= LayoutInflater.from(context).inflate(R.layout.sample_design, parent,false);

      ImageView img= (ImageView) view.findViewById(R.id.img);
      TextView name= (TextView) view.findViewById(R.id.name);

     img.setImageResource(list.get(position).getImg());
     name.setText(list.get(position).getName());

      return  view;
    }



}
