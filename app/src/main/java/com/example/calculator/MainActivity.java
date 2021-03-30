package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View.OnClickListener;

import com.google.android.material.radiobutton.MaterialRadioButton;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private String numbers = "";
    private double result = 0;
    private Sign s = Sign.EQUALLY;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculator);

        textView = findViewById(R.id.textView);
        Button button_1 = findViewById(R.id.button_1);
        Button button_2 = findViewById(R.id.button_2);
        Button button_3 = findViewById(R.id.button_3);
        Button button_4 = findViewById(R.id.button_4);
        Button button_5 = findViewById(R.id.button_5);
        Button button_6 = findViewById(R.id.button_6);
        Button button_7 = findViewById(R.id.button_7);
        Button button_8 = findViewById(R.id.button_8);
        Button button_9 = findViewById(R.id.button_9);
        Button button_0 = findViewById(R.id.button_0);
        Button button_point = findViewById(R.id.button_point);
        Button button_plus = findViewById(R.id.button_plus);
        Button button_minus = findViewById(R.id.button_minus);
        Button button_multiply = findViewById(R.id.button_multiply);
        Button button_divide = findViewById(R.id.button_divide);
        Button button_percent = findViewById(R.id.button_percent);
        Button button_equally = findViewById(R.id.button_equally);
        Button button_reset = findViewById(R.id.button_reset);
        Button button_setting = findViewById(R.id.button_setting);

        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_0.setOnClickListener(this);
        button_point.setOnClickListener(this);
        button_plus.setOnClickListener(this);
        button_minus.setOnClickListener(this);
        button_multiply.setOnClickListener(this);
        button_divide.setOnClickListener(this);
        button_percent.setOnClickListener(this);
        button_equally.setOnClickListener(this);
        button_reset.setOnClickListener(this);
        button_setting.setOnClickListener(this);
    }

    public enum Sign {
        PLUS,
        MINUS,
        MULTIPLY,
        DIVIDE,
        EQUALLY,
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button_1:
                numbers += 1;
                textView.setText(numbers);
                break;
            case R.id.button_2:
                numbers += 2;
                textView.setText(numbers);
                break;
            case R.id.button_3:
                numbers += 3;
                textView.setText(numbers);
                break;
            case R.id.button_4:
                numbers += 4;
                textView.setText(numbers);
                break;
            case R.id.button_5:
                numbers += 5;
                textView.setText(numbers);
                break;
            case R.id.button_6:
                numbers += 6;
                textView.setText(numbers);
                break;
            case R.id.button_7:
                numbers += 7;
                textView.setText(numbers);
                break;
            case R.id.button_8:
                numbers += 8;
                textView.setText(numbers);
                break;
            case R.id.button_9:
                numbers += 9;
                textView.setText(numbers);
                break;
            case R.id.button_0:
                numbers += 0;
                textView.setText(numbers);
                break;
            case R.id.button_point:
                numbers += ".";
                textView.setText(numbers);
                break;
            case R.id.button_plus:
                checkSign(s);
                numbers = "";
                s = Sign.PLUS;
                textView.setText("+");
                break;
            case R.id.button_minus:
                checkSign(s);
                numbers = "";
                s = Sign.MINUS;
                textView.setText("-");
                break;
            case R.id.button_multiply:
                checkSign(s);
                numbers = "";
                s = Sign.MULTIPLY;
                textView.setText("*");
                break;
            case R.id.button_divide:
                checkSign(s);
                numbers = "";
                s = Sign.DIVIDE;
                textView.setText("/");
                break;
            case R.id.button_percent:
                checkSign(s);
                numbers = "";
                textView.setText("%");
                break;
            case R.id.button_equally:
                checkSign(s);
                numbers = String.valueOf(result);
                s = Sign.EQUALLY;
                textView.setText(numbers);
                break;
            case R.id.button_reset:
                result = 0;
                numbers = "";
                s = Sign.EQUALLY;
                textView.setText("");
                break;
            case R.id.button_setting:
                Intent runSettings = new Intent(MainActivity.this, SettingsActivity.class);
                // Метод стартует активити, указанную в интенте
                startActivity(runSettings);
                break;
        }
    }

    private void checkSign(Sign s) {
        switch (s) {
            case EQUALLY:
                result = Double.parseDouble(numbers);
                break;
            case PLUS:
                result += Double.parseDouble(numbers);
                break;
            case MINUS:
                result -= Double.parseDouble(numbers);
                break;
            case MULTIPLY:
                result *= Double.parseDouble(numbers);
                break;
            case DIVIDE:
                result /= Double.parseDouble(numbers);
                break;
        }
    }
}