package com.example.volumecalculator.Calculation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.volumecalculator.R;

public class sphereCal extends AppCompatActivity {

    EditText radiusEt;
    Button btn;
    TextView ans;
    float radius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere_cal);

        radiusEt = findViewById(R.id.radius);
        btn = findViewById(R.id.btn);
        ans = findViewById(R.id.ans);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radiusEt.getText() != null && !radiusEt.getText().toString().isEmpty()) {
                    try {
                        radius = Float.parseFloat(radiusEt.getText().toString());
                        Volume(radius);
                    } catch (Exception e) {
                        Toast.makeText(sphereCal.this, e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(sphereCal.this, "Enter Radius", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void Volume(float radius) {
        float volume = (float) ((4.0 / 3.0) * Math.PI * radius * radius * radius);
        ans.setText("Volume= " + volume + " cm^3");
    }

}