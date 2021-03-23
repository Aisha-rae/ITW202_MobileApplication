package com.gcit.todo_5;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.gcit.todo_5.R;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.gcit.todo_5";

    private static final String LOG_TAG = MainActivity2.class.getSimpleName();

    private EditText mMessageEditText;

    public static final int TEXT_REQUEST = 1;

    private TextView mReplyTextView;
    private TextView mReplyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditText = findViewById(R.id.editText_main);
        mReplyTextView = findViewById(R.id.textView_reply);
        mReplyText = findViewById(R.id.textView_mreply);
    }

    public void Next(View view) {
        Intent obj = new Intent(this, MainActivity2.class);
        String message = mMessageEditText.getText().toString();
        obj.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(obj, TEXT_REQUEST);
    }

    public void onActivityResult(int requestCode,
                                 int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(MainActivity2.EXTRA_REPLY);
                mReplyTextView.setVisibility(View.VISIBLE);
                mReplyText.setText(reply);
                mReplyText.setVisibility(View.VISIBLE);
            }
        }
    }


    @Override
    protected void onStart() {

        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }
}