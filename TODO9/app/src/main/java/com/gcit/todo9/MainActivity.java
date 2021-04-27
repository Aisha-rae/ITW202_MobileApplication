package com.gcit.todo9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private TextView textView;
    private calculator Numerical;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);

        Numerical = new calculator();
    }

    public void add(View view) {
        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();
        double res = Numerical.add(Double.valueOf(value1),Double.valueOf(value2));
        textView.setText(String.valueOf(res));
        Log.d("debug","hello bugs");
    }

    public void sub(View view) {
        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();
        double res = Numerical.sub(Double.valueOf(value1),Double.valueOf(value2));
        textView.setText(String.valueOf(res));
        Log.d("debug","hello bugs");
    }

    public void multi(View view) {
        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();
        double res = Numerical.multi(Double.valueOf(value1),Double.valueOf(value2));
        textView.setText(String.valueOf(res));
        Log.d("debug","hello bugs");
    }

    public void divi(View view) {
        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();
        double res = Numerical.divi(Double.valueOf(value1),Double.valueOf(value2));
        textView.setText(String.valueOf(res));
        Log.d("debug","hello bugs");
    }
}