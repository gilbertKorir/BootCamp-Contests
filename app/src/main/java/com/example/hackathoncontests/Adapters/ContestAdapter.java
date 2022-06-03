package com.example.hackathoncontests.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hackathoncontests.R;

public class ContestAdapter extends RecyclerView.Adapter<ContestAdapter.DisplayViewHolder> {
    @NonNull
    @Override
    public ContestAdapter.DisplayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ContestAdapter.DisplayViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class DisplayViewHolder extends RecyclerView.ViewHolder {
        public DisplayViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}