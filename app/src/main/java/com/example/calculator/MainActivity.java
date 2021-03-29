package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View.OnClickListener;

import com.google.android.material.radiobutton.MaterialRadioButton;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    String numbers = "";
    String view = "";
    double result = 0;
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
        setTheme(getAppTheme(R.style.MyCoolStyle));
        setContentView(R.layout.activity_main_calculator);
        initThemeChooser();

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
    // Имя настроек
    private static final String NameSharedPreference = "LOGIN";

    // Имя параметра в настройках
    private static final String appTheme = "APP_THEME";

    private static final int MyCoolCodeStyle = 0;
    private static final int AppThemeLightCodeStyle = 1;
    private static final int AppThemeCodeStyle = 2;
    private static final int AppThemeDarkCodeStyle = 3;

    // Инициализация радиокнопок
    private void initThemeChooser() {
        initRadioButton(findViewById(R.id.radioButtonMyCoolStyle),
                MyCoolCodeStyle);
        initRadioButton(findViewById(R.id.radioButtonMaterialDark),
                AppThemeDarkCodeStyle);
        initRadioButton(findViewById(R.id.radioButtonMaterialLight),
                AppThemeLightCodeStyle);
        initRadioButton(findViewById(R.id.radioButtonMaterialLightDarkAction),
                AppThemeCodeStyle);
        RadioGroup rg = findViewById(R.id.radioButtons);
        ((MaterialRadioButton)rg.getChildAt(getCodeStyle(MyCoolCodeStyle))).setChecked(true);
    }

    // Все инициализации кнопок очень похожи, поэтому создадим метод для переиспользования
    private void initRadioButton(View button, final int codeStyle){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAppTheme(codeStyle);
                recreate();
            }
        });
    }

    private int getAppTheme(int codeStyle) {
        return codeStyleToStyleId(getCodeStyle(codeStyle));
    }

    // Чтение настроек, параметр «тема»
    private int getCodeStyle(int codeStyle){
        // Работаем через специальный класс сохранения и чтения настроек
        SharedPreferences sharedPref = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);
        //Прочитать тему, если настройка не найдена - взять по умолчанию
        return sharedPref.getInt(appTheme, codeStyle);
    }

    // Сохранение настроек
    private void setAppTheme(int codeStyle) {
        SharedPreferences sharedPref = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);
        // Настройки сохраняются посредством специального класса editor.
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(appTheme, codeStyle);
        editor.apply();
    }

    private int codeStyleToStyleId(int codeStyle){
        switch(codeStyle){
            case AppThemeCodeStyle:
                return R.style.AppTheme;
            case AppThemeLightCodeStyle:
                return R.style.AppThemeLight;
            case AppThemeDarkCodeStyle:
                return R.style.AppThemeDark;
            default:
                return R.style.MyCoolStyle;
        }
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
            case R.id.button_divide:
                checkSign();
                numbers = "";
                view += "/";
                sign = 4;
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
        if (sign == 0) result = Double.parseDouble(numbers);
        else if (sign == 1) result += Double.parseDouble(numbers);
        else if (sign == 2) result -= Double.parseDouble(numbers);
        else if (sign == 3) result *= Double.parseDouble(numbers);
        else if (sign == 4) result /= Double.parseDouble(numbers);
    }
}