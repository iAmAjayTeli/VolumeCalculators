package com.example.volumecalculator.Calculation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.volumecalculator.R;

public class PrismCal extends AppCompatActivity {

    EditText BaseAreaEt, heightEt;
    Button btn;
    TextView ans;
    float baseArea, height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism_cal);

        BaseAreaEt = findViewById(R.id.BaseArea);
        heightEt = findViewById(R.id.height);
        btn = findViewById(R.id.btn);
        ans = findViewById(R.id.ans);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (BaseAreaEt.getText() != null && heightEt.getText() != null && !BaseAreaEt.getText().toString().isEmpty() && !heightEt.getText().toString().isEmpty()) {
                    try {
                        baseArea = Float.parseFloat(BaseAreaEt.getText().toString());
                        height = Float.parseFloat(heightEt.getText().toString());
                        Volume(baseArea, height);
                    } catch (Exception e) {
                        Toast.makeText(PrismCal.this, e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(PrismCal.this, "Enter in both field", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void Volume(float baseArea, float height) {
        float volume = (float) baseArea * height;
        ans.setText("Volume= " + volume + " cm^3");
    }

}
