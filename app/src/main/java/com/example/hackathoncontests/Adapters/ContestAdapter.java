package com.example.hackathoncontests.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hackathoncontests.R;
import com.example.hackathoncontests.models.ContestResponse;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ContestAdapter extends RecyclerView.Adapter<ContestAdapter.DisplayViewHolder> {

    private Context mContext;
    private List<ContestResponse> contestResponseList;

    public ContestAdapter(Context mContext, List<ContestResponse> contestResponseList) {
        this.mContext = mContext;
        this.contestResponseList = contestResponseList;
    }

    @NonNull
    @Override
    public ContestAdapter.DisplayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_display, parent, false);
        DisplayViewHolder displayViewHolder = new DisplayViewHolder(view);
        return displayViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContestAdapter.DisplayViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return contestResponseList.size();
    }

    public class DisplayViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.mycard) CardView mCard;
        @BindView(R.id.nameView) TextView mName;
        @BindView(R.id.url) TextView mUrl;
        @BindView(R.id.startView) TextView mStart;
        @BindView(R.id.endView) TextView mEnd;

        public DisplayViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }
        public void bindCountry(ContestResponse contestResponse){
            mName.setText(contestResponse.getName());
            mUrl.setText(contestResponse.getUrl());
            mStart.setText(contestResponse.getStartTime());
            mEnd.setText(contestResponse.getEndTime());

        }
    }
}