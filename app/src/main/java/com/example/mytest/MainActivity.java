package com.example.mytest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.example.mytest.R;

public class MainActivity extends AppCompatActivity {

    private EditText initialPrice, tax, fullPrice;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialPrice = findViewById(R.id.InitialPrice);
        tax = findViewById(R.id.Tax);
        fullPrice = findViewById(R.id.FullPrice);
        calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Read values from EditText fields
                float initialPriceValue = Float.parseFloat(initialPrice.getText().toString());
                float taxValue = Float.parseFloat(tax.getText().toString());

                // Perform your calculations here
                float fullPriceValue = initialPriceValue * (1 + taxValue);

                // Set the result in the Full Price EditText
                fullPrice.setText(String.valueOf(fullPriceValue));
            }
        });
    }
}
