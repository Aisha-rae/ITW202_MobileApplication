package edu.gcit.todo_13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
public class MainActivity extends AppCompatActivity {
    public static final String LOG = MainActivity.class.getName();
    FloatingActionButton floatingActionButton;
    String list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton =(FloatingActionButton) findViewById(R.id.floatingActionButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("list",list);
                startActivity(intent);
            }
        });
    }
    public void SelectDonut(View view) {
        String mssg = "You Ordered a Donut";
        list = mssg;
        Toast.makeText(this,"You Ordered a Donut",Toast.LENGTH_SHORT).show();
    }

    public void SelectSand(View view) {
        String mssg = "You Ordered a Icecream Sandwitch";
        list = mssg;
        Toast.makeText(this,"You Ordered a Icecream Sandwitch", Toast.LENGTH_SHORT).show();
    }

    public void SelectFroyo(View view) {
        String mssg = "You Ordered a Froyo";
        list = mssg;
        Toast.makeText(this,"You Ordered a Froyo",Toast.LENGTH_SHORT).show();
    }


}