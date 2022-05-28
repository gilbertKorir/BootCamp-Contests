package com.example.hackathoncontests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;

import Adapters.ContestAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ContestsActivity extends AppCompatActivity {
    @BindView(R.id.viewName) TextView mViewname;
    @BindView(R.id.viewSchool) TextView mViewSchool;
    @BindView(R.id.listContests) ListView mViewContests;

    String contestList[] = {"June App Lab Meetup","Supernova","Microsoft Azure","TRON Grand Hackathon","aelf Web3.0 Hackathon",
            "HPB","SG Game Jam","Late NightHacks","Color Snack Creative Studio","Highland Engineering Challenge",
            "poolesville_hacks","Stem Explorers’ Contest","Hack4Green","BioMedTech Hackathon","Math Hackathon Challenge"};
    int contestImages[] = {R.drawable.im0,R.drawable.im1,R.drawable.im2,R.drawable.im3,R.drawable.im4,
            R.drawable.im5,R.drawable.im6,R.drawable.im7,R.drawable.im8,R.drawable.im9,
            R.drawable.im10,R.drawable.im11,R.drawable.im12,R.drawable.im13,R.drawable.im14};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        setContentView(R.layout.activity_contests);
        ButterKnife.bind(this);
        listView = (ListView) findViewById(R.id.listContests);

        ContestAdapter adapter = new ContestAdapter(this, android.R.layout.simple_list_item_1, contestList, contestImages);
    }
}