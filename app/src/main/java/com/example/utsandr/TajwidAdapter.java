package com.example.utsandr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.utsandr.R;

import java.util.List;

public class TajwidAdapter extends RecyclerView.Adapter<TajwidAdapter.TajwidViewHolder> {

    private List<String> itemList;

    public TajwidAdapter(List<String> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public TajwidViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tajwid, parent, false);
        return new TajwidViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TajwidViewHolder holder, int position) {
        holder.tvItemTitle.setText(itemList.get(position));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class TajwidViewHolder extends RecyclerView.ViewHolder {
        TextView tvItemTitle;

        public TajwidViewHolder(@NonNull View itemView) {
            super(itemView);
            tvItemTitle = itemView.findViewById(R.id.tvItemTitle);
        }
    }
}