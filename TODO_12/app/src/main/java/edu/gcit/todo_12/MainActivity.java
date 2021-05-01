package edu.gcit.todo_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void SelectDonut(View view) {
        String mssg = "You Ordered a Donut";
        Toast toast = Toast.makeText(this,mssg, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void SelectSand(View view) {
        String mssg = "You Ordered a Icecream Sandwitch";
        Toast toast = Toast.makeText(this,mssg, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void SelectFroyo(View view) {
        String mssg = "You Ordered a Froyo";
        Toast toast = Toast.makeText(this,mssg, Toast.LENGTH_SHORT);
        toast.show();
    }
    public void Call(View view){
        Intent obj = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:17919976"));
        startActivity(obj);
    }
}