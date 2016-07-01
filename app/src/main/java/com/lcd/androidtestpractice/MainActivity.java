package com.lcd.androidtestpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lcd.androidtestpractice.adapterview.LongListActivity;
import com.lcd.androidtestpractice.calc.CalculatorActivity;
import com.lcd.androidtestpractice.intents.DialerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.calc_act).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculatorActivity.start(MainActivity.this);
            }
        });

        findViewById(R.id.list_act).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LongListActivity.start(MainActivity.this);
            }
        });

        findViewById(R.id.dialer_act).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialerActivity.start(MainActivity.this);
            }
        });
    }
}
