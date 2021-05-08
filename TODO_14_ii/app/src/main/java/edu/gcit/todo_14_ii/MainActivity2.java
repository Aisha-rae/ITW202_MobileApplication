package edu.gcit.todo_14_ii;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Pick(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),"datePicker");
    }
    public void processDatePickerResult(int year, int month, int dayOfMonth) {
        String month_string  = Integer.toString(month+1);
        String date_string = Integer.toString(dayOfMonth);
        String year_string = Integer.toString(year);

        String date_message = (month_string + "/" + date_string + "/" + year_string);
        Toast.makeText(this,"Date: "+date_message, Toast.LENGTH_SHORT).show();
    }

}