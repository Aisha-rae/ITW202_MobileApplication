package edu.gcit.todo_14;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.todo_12";
    String mssg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void displayToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void SelectDonut(View view) {
        mssg = getString(R.string.donut);
        displayToast(mssg);
    }

    public void SelectSand(View view) {
        mssg = getString(R.string.icecream_sandwitch);
        displayToast(mssg);    }

    public void SelectFroyo(View view) {
        mssg = getString(R.string.froyo);
        displayToast(mssg);    }

    public void cart(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(EXTRA_MESSAGE, mssg);
        startActivity(intent);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //inflates the menu; this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.action_order:
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra(EXTRA_MESSAGE, mssg);
                startActivity(intent);
                return true;
            case R.id.action_status:
                displayToast("You selected status");
                return true;
            case R.id.action_favourites:
                displayToast("You selected Favourites");
                return true;
            case R.id.action_contact:
                displayToast("You selected Contact");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


