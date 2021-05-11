package edu.gcit.todo_16;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.WordViewHolder> {
    private final LinkedList<String> mworkList;
    private LayoutInflater mInflater;

    public WordAdapter(Context context, LinkedList<String> mworkList){
        mInflater = LayoutInflater.from(context);
        this.mworkList = mworkList;
    }
    @NonNull
    @Override
    public WordAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item,parent,false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordAdapter.WordViewHolder holder, int position) {
        String mCurrent = mworkList.get(position);
        holder.worditemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mworkList.size();
    }

    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private final TextView worditemView;
        final WordAdapter mAdapter;
        public WordViewHolder(@NonNull View itemView, WordAdapter mAdapter) {
            super(itemView);
            worditemView = itemView.findViewById(R.id.text);
            this.mAdapter = mAdapter;
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View v){
            int mPosition = getLayoutPosition();
            String ele = mworkList.get(mPosition);
            mworkList.set(mPosition,"Clicked" + ele);
            mAdapter.notifyDataSetChanged();
        }
    }

}
