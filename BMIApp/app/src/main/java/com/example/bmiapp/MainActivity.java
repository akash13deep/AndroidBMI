package com.example.bmiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etHeight, etWeight;
    TextView textView4;

    TextView tvtvtv;

    // ALT+enter == automatic import
    // cntrl+alt+L format code
    // cntril+space = auto suggest

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etHeight = findViewById(R.id.editText);
        etWeight = findViewById(R.id.editText2);

        textView4 = findViewById(R.id.textView4);

//        Button b = findViewById(R.id.button);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });


    }

    public void button(View v) {


        try {
            Double height = Double.parseDouble(etHeight.getText().toString());
            Double weight = Double.parseDouble(etWeight.getText().toString());

            textView4.setText(Double.toString(height * weight));
        }catch(Exception e){
            Toast.makeText(this, ""+e.toString(), Toast.LENGTH_SHORT).show();
        }

    }

}
