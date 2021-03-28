package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    String numbers = "";
    String view = "";
    float result = 0;
    int sign = 0;

    TextView textView;
    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;
    Button button_9;
    Button button_0;
    Button button_point;
    Button button_plus;
    Button button_minus;
    Button button_multiply;
    Button button_divide;
    Button button_percent;
    Button button_equally;
    Button button_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculator);

        textView = (TextView) findViewById(R.id.textView);
        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
        button_3 = (Button) findViewById(R.id.button_3);
        button_4 = (Button) findViewById(R.id.button_4);
        button_5 = (Button) findViewById(R.id.button_5);
        button_6 = (Button) findViewById(R.id.button_6);
        button_7 = (Button) findViewById(R.id.button_7);
        button_8 = (Button) findViewById(R.id.button_8);
        button_9 = (Button) findViewById(R.id.button_9);
        button_0 = (Button) findViewById(R.id.button_0);
        button_point = (Button) findViewById(R.id.button_point);
        button_plus = (Button) findViewById(R.id.button_plus);
        button_minus = (Button) findViewById(R.id.button_minus);
        button_multiply = (Button) findViewById(R.id.button_multiply);
        button_divide = (Button) findViewById(R.id.button_divide);
        button_percent = (Button) findViewById(R.id.button_percent);
        button_equally = (Button) findViewById(R.id.button_equally);
        button_reset = (Button) findViewById(R.id.button_reset);

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
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1:
                numbers += 1;
                view += 1;
                textView.setText(view);
                break;
            case R.id.button_2:
                numbers += 2;
                view += 2;
                textView.setText(view);
                break;
            case R.id.button_3:
                numbers += 3;
                view += 3;
                textView.setText(view);
                break;
            case R.id.button_4:
                numbers += 4;
                view += 4;
                textView.setText(view);
                break;
            case R.id.button_5:
                numbers += 5;
                view += 5;
                textView.setText(view);
                break;
            case R.id.button_6:
                numbers += 6;
                view += 6;
                textView.setText(view);
                break;
            case R.id.button_7:
                numbers += 7;
                view += 7;
                textView.setText(view);
                break;
            case R.id.button_8:
                numbers += 8;
                view += 8;
                textView.setText(view);
                break;
            case R.id.button_9:
                numbers += 9;
                view += 9;
                textView.setText(view);
                break;
            case R.id.button_0:
                numbers += 0;
                view += 0;
                textView.setText(view);
                break;
            case R.id.button_point:
                numbers += ".";
                view += ".";
                textView.setText(view);
                break;
            case R.id.button_plus:
                checkSign();
                numbers = "";
                view += "+";
                sign = 1;
                textView.setText(view);
                break;
            case R.id.button_minus:
                checkSign();
                numbers = "";
                view += "-";
                sign = 2;
                textView.setText(view);
                break;
            case R.id.button_multiply:
                checkSign();
                numbers = "";
                view += "*";
                sign = 3;
                textView.setText(view);
                break;
            case R.id.button_percent:
                checkSign();
                numbers = "";
                view += "%";
                textView.setText(view);
                break;
            case R.id.button_equally:
                checkSign();
                numbers = String.valueOf(result);
                view = String.valueOf(result);
                sign = 0;
                textView.setText(view);
                break;
            case R.id.button_reset:
                result = 0;
                numbers = "";
                view = "";
                sign = 0;
                textView.setText(view);
                break;
        }
    }

    private void checkSign() {
        if (sign == 0) result = Float.parseFloat(numbers);
        else if (sign == 1) result += Float.parseFloat(numbers);
        else if (sign == 2) result -= Float.parseFloat(numbers);
        else if (sign == 3) result *= Float.parseFloat(numbers);
        else if (sign == 4) result /= Float.parseFloat(numbers);
    }
}