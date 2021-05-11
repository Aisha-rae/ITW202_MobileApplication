package edu.gcit.todo_16;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecycleView;
    private WordAdapter mAdpter;
    private final LinkedList<String> mworkList = new LinkedList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i=0; i<0; i++){
            mworkList.addLast("word"+i);
        }
        mRecycleView = findViewById(R.id.recyclerView);
        mAdpter = new WordAdapter(this, mworkList);
        mRecycleView.setAdapter(mAdpter);
        LinearLayoutManager obj = new LinearLayoutManager(this);
        mRecycleView.setLayoutManager(obj);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wordListSize = mworkList.size();
                mworkList.addLast("+ Word" + wordListSize);
                mRecycleView.getAdapter().notifyItemInserted(wordListSize);
                mRecycleView.smoothScrollToPosition(wordListSize);
            }
        });
    }
}