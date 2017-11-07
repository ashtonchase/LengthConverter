package com.ashtonchase.lengthconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    EditText valueMeter, valueMile, valueFoot, valueNautMile;
    float meter, mile, foot, nautMile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valueMeter = (EditText) findViewById((R.id.valueMeter));
        valueFoot = (EditText) findViewById((R.id.valueFoot));
        valueMile = (EditText) findViewById((R.id.valueMile));
        valueNautMile = (EditText) findViewById((R.id.valueNautMile));

        addUiListeners();

    }


    protected void addUiListeners() {


        /* Add listener to Meter text box */
        valueMeter.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                /* Check to see if the user hit the Go check box in the keyboard */
                if (actionId == EditorInfo.IME_ACTION_GO) {
                    /* Read in the value for the Meter */
                    float len = Float.valueOf(valueMeter.getText().toString());
                    /* Post the foot value */
                    valueFoot.setText(String.valueOf(UnitConverter.fromMeterToFeet(len)));
                    /* Post the mile value */
                    valueMile.setText(String.valueOf(UnitConverter.fromMeterToMile(len)));
                    /* Post the nautical mile value */
                    valueNautMile.setText(String.valueOf(UnitConverter.fromMeterToNautMile(len)));
                    return true;
                }
                return false;
            }
        });


        /* Add listener to Foot text box */
        valueFoot.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_GO) {
                    float len = Float.valueOf(valueFoot.getText().toString());
                    valueMeter.setText(String.valueOf(UnitConverter.fromFeetToMeter(len)));
                    valueMile.setText(String.valueOf(UnitConverter.fromFeetToMile(len)));
                    valueNautMile.setText(String.valueOf(UnitConverter.fromFeetToNautMile(len)));
                    return true;
                }
                return false;
            }
        });



        /* Add listener to Mile text box */
        valueMile.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_GO) {
                    float len = Float.valueOf(valueMile.getText().toString());
                    valueFoot.setText(String.valueOf(UnitConverter.fromMileToFeet(len)));
                    valueMeter.setText(String.valueOf(UnitConverter.fromMileToMeter(len)));
                    valueNautMile.setText(String.valueOf(UnitConverter.fromMileToNautMile(len)));
                    return true;
                }
                return false;
            }
        });


        /* Add listener to Nautical Mile text box */
        valueNautMile.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_GO) {
                    float len = Float.valueOf(valueNautMile.getText().toString());
                    valueFoot.setText(String.valueOf(UnitConverter.fromNautMileToFeet(len)));
                    valueMile.setText(String.valueOf(UnitConverter.fromNautMileToMile(len)));
                    valueMeter.setText(String.valueOf(UnitConverter.fromNautMileToMeter(len)));
                    return true;
                }
                return false;
            }
        });
        /*valueMeter.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                boolean enable = s.length() != 0;

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });*/

    }



}
