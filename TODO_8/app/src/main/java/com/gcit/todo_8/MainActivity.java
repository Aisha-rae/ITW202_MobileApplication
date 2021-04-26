package com.gcit.todo_8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);


    }

    public void Next(View view) {
        String edit1 = editText1.getText().toString();
        Uri obj = Uri.parse(edit1);
        Intent sc = new Intent(Intent.ACTION_VIEW,obj);

        if(sc.resolveActivity(getPackageManager()) != null){
            startActivity(sc);
        }

    }

    public void Send(View view) {
        String location = editText2.getText().toString();
        Uri ob = Uri.parse("geo:0,0?q="+location);
        Intent intent = new Intent(Intent.ACTION_VIEW,ob);

        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }

    public void Share(View view) {
        String message = editText3.getText().toString();
        String mimetype = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimetype)
                .setChooserTitle("share this text:")
                .setText(message)
                .startChooser();


    }
}