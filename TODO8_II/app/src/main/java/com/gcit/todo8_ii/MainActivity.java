package com.gcit.todo8_ii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text= findViewById(R.id.text);

        Intent obj = getIntent();
        Uri scr = obj.getData();

        if (scr != null) {
            String msg = scr.toString();
            text.setText(msg);
        }
    }
}