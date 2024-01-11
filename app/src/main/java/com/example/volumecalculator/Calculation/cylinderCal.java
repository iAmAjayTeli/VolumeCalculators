package com.example.volumecalculator.Calculation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.volumecalculator.R;

public class cylinderCal extends AppCompatActivity {

    EditText radiusEt, heightEt;
    Button btn;
    TextView ans;
    float radius, height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder_cal);

        radiusEt = findViewById(R.id.radius);
        heightEt = findViewById(R.id.height);
        btn = findViewById(R.id.btn);
        ans = findViewById(R.id.ans);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radiusEt.getText() != null && heightEt.getText() != null && !radiusEt.getText().toString().isEmpty() && !heightEt.getText().toString().isEmpty()) {
                    try {
                        radius = Float.parseFloat(radiusEt.getText().toString());
                        height = Float.parseFloat(radiusEt.getText().toString());
                        Volume(radius, height);
                    } catch (Exception e) {
                        Toast.makeText(cylinderCal.this, e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(cylinderCal.this, "Enter in both field", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void Volume(float radius, float height) {
        float volume = (float) Math.PI * radius * radius * height;
        ans.setText("Volume= " + volume + " cm^3");
    }


}