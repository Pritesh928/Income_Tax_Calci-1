package com.firstapp.incometaxcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView6);
        editText = findViewById(R.id.editTextNumber2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                double income = Double.parseDouble(s);
                double tax = 1;
                if(income <= 300000){
                    tax = income * 0.00;
                }else if(income <= 600000){
                    tax = income * 0.09;
                }else if(income <= 900000){
                    tax = income * 0.18;
                }else if(income <= 1200000){
                    tax = income * 0.27;
                }else if(income <= 1500000){
                    tax = income* 0.36;
                }else if(income <= 1800000){
                    tax = income * 0.45;
                }else if(income <= 2100000){
                    tax = income * 0.54;
                }else if(income <= 2400000){
                    tax = income * 0.63;
                }else if(income <= 2700000){
                    tax = income * 0.72;
                }else if(income <= 3000000){
                    tax = income * 0.81;
                }else{
                    tax = income * 1;
                }
                textView.setText("You have to pay " + tax + " Inr as income tax.");
                Toast.makeText(MainActivity.this, "Thanks for using my app!!:)", Toast.LENGTH_SHORT).show();
            }
        });
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
}