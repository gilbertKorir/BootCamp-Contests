package com.example.hackathoncontests.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hackathoncontests.Adapters.ContestAdapter;
import com.example.hackathoncontests.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ContestsActivity extends AppCompatActivity {
    @BindView(R.id.viewName) TextView mViewname;
    @BindView(R.id.viewSchool) TextView mViewSchool;
    @BindView(R.id.listContests) ListView mViewContests;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        setContentView(R.layout.activity_contests);
        ButterKnife.bind(this);

    }
}