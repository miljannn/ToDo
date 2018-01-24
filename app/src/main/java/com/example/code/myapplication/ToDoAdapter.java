package com.example.code.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder> {

    private static final String TAG = ToDoAdapter.class.getSimpleName();
    private List<Item> itemList;

    public ToDoAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public ToDoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.to_do_item, parent, false);
        return new ToDoAdapter.ToDoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ToDoViewHolder holder, int position) {
        Item item = itemList.get(position);
        holder.naslovTextView.setText(item.getNaslov());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class ToDoViewHolder extends RecyclerView.ViewHolder {
        public TextView naslovTextView;

        public ToDoViewHolder(View itemView) {
            super(itemView);
            naslovTextView = itemView.findViewById(R.id.naslov_text_view);
        }
    }
}
