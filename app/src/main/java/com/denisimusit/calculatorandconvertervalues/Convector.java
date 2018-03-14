package com.denisimusit.calculatorandconvertervalues;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Convector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convector);
    }

    public void onClick(View view) {

        RadioButton radioButton$To₴ = (RadioButton) findViewById(R.id.radioButtonGToS);
        RadioButton radioButton₴To$ = (RadioButton) findViewById(R.id.radioButtonSToG);
        RadioButton radioButtonCToF = (RadioButton) findViewById(R.id.radioButtonCToF);
        RadioButton radioButtonFToC = (RadioButton) findViewById(R.id.radioButtonFToC);
        RadioButton radioButtonHourToMinutes = (RadioButton) findViewById(R.id.radioButtonHourToMinutes);
        RadioButton radioButtonMinutesToHour = (RadioButton) findViewById(R.id.radioButtonMinutesToHour);
        RadioButton radioButtonKgToMg = (RadioButton) findViewById(R.id.radioButtonKgToMg);
        RadioButton radioButtonMgToKg = (RadioButton) findViewById(R.id.radioButtonMgToKg);
        EditText inputEditText = (EditText) findViewById(R.id.editText);

        if (inputEditText.getText().length() == 0) {
            Toast.makeText(getApplicationContext(), R.string.text_if_edit_text_is_empty,
                    Toast.LENGTH_LONG).show();
            return;
        }

        float inputValue = Float.parseFloat(inputEditText.getText().toString());
        if (radioButton$To₴.isChecked()) {
            inputEditText.setText(String
                    .valueOf(convert$To₴(inputValue)));
        }
        if (radioButton₴To$.isChecked()) {
            inputEditText.setText(String
                    .valueOf(convert₴To$(inputValue)));
        }
        if (radioButtonCToF.isChecked()) {
            inputEditText.setText(String
                    .valueOf(convertCToF(inputValue)));
        }
        if (radioButtonFToC.isChecked()) {
            inputEditText.setText(String
                    .valueOf(convertFToC(inputValue)));
        }
        if (radioButtonMinutesToHour.isChecked()) {
            inputEditText.setText(String
                    .valueOf(convertMinutesToHour(inputValue)));
        }
        if (radioButtonHourToMinutes.isChecked()) {
            inputEditText.setText(String
                    .valueOf(convertHourToMinutes(inputValue)));
        }
        if (radioButtonKgToMg.isChecked()) {
            inputEditText.setText(String
                    .valueOf(convertKgToMg(inputValue)));
        }
        if (radioButtonMgToKg.isChecked()) {
            inputEditText.setText(String
                    .valueOf(convertMgToKg(inputValue)));
        }
    }

    private double convertMgToKg(float inputValue) {
        return inputValue / 1000;
    }

    private double convertKgToMg(double inputValue) {
        return inputValue * 1000;
    }

    private float convertHourToMinutes(float inputValue) {
        return inputValue * 60;
    }

    private float convertMinutesToHour(float inputValue) {

        return inputValue / 60;
    }

    private float convertFToC(float inputValue) {
        return (float) ((inputValue - 32) / 1.8);
    }

    private float convertCToF(float inputValue) {
        return (float) ((inputValue * 1.8) + 32);
    }

    private double convert₴To$(float inputValue) {
        return inputValue * 26.2526;
    }

    private double convert$To₴(float inputValue) {
        return inputValue * 26.4282;
    }
}
