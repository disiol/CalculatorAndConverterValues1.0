package com.denisimusit.calculatorandconvertervalues;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mButtonCalculator;
    Button mButtonConvectorValues;
    Button mButtonExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonCalculator = (Button) findViewById(R.id.buttonCalculator);
        mButtonCalculator = (Button) findViewById(R.id.buttonConvectorValues);
        mButtonCalculator = (Button) findViewById(R.id.buttonExit);
    }

    public void onClick(View view) {
        switch (view.getId()) {


            case R.id.buttonCalculator:

                break;

            case R.id.buttonConvectorValues:

                break;
            case R.id.buttonExit:
                finish();//остонавливае приложение
                break;

            default:
                break;
        }
    }
}
