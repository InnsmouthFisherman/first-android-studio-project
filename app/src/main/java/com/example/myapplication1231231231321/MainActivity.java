package com.example.myapplication1231231231321;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        double coat = 70; // 77% off
        double hat = 25; // 37% off
        double costume = 53; // 44% off
        double shirt = 19; // 0% off
        double shoes = 41; // 32% off
        int account = 312;
        double total = coat + hat + costume + shirt + shoes;
        double remains_with_discount = account - (coat * (1-0.77) + hat * (1-0.37) + costume * (1-0.44) + shirt + shoes * (1 - 0.32));
        double remains = account - total;
        TextView r = findViewById(R.id.r);
        TextView prices = findViewById(R.id.prices);
        TextView rwd = findViewById(R.id.rwd);
        Button button = findViewById(R.id.button);
        prices.setText("Пальто 77% off " + coat + "\nШляпа 37% off " + hat + "\nКостюм 44% off " + costume + "\nСорочка 0% off " + shirt + "\nТуфли 32% off " + shoes);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rwd.setText("После покупки с учетом скидки останется " + remains_with_discount);
                r.setText("После покупки без учета скидки останется " + remains);
            }
        });
    }
}