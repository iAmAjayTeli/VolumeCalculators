package com.example.volumecalculator.Calculation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.volumecalculator.R;

public class CubeCal extends AppCompatActivity {

    EditText edgeLenEt;
    Button btn;
    TextView ans;
    float edgeLen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube_cal);

        edgeLenEt = findViewById(R.id.edgeLenEt);
        btn = findViewById(R.id.btn);
        ans = findViewById(R.id.ans);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edgeLenEt.getText() != null && !edgeLenEt.getText().toString().isEmpty()) {
                    try {
                        edgeLen = Float.parseFloat(edgeLenEt.getText().toString());
                        Volume(edgeLen);
                    } catch (Exception e) {
                        Toast.makeText(CubeCal.this, e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(CubeCal.this, "Enter Edge Length", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void Volume(float edgeLen) {
        float volume = (float) edgeLen * edgeLen * edgeLen;
        ans.setText("Volume= " + volume + " cm^3");
    }
}