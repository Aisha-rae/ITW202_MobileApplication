package com.gcit.todo_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView mtext;
    private String[] mColorArray = {"Periwinkle","HotPink","Salmon","MediumAquamarine","palegreen",
            "Cobalt_Blue","Cornflower_Blue","Baby_Blue","Garnet","light_marron"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtext = findViewById(R.id.textView);
    }

    public void color(View view) {
        Random random = new Random();
        String colorname = mColorArray[random.nextInt(10)];
         int colorResourceName = getResources().getIdentifier(colorname,"color",
                 getApplicationContext().getPackageName());
         int colorRes = ContextCompat.getColor(this, colorResourceName);
         mtext.setTextColor(colorRes);
    }

}