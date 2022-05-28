package com.example.hackathoncontests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.submitButton) Button mSubmitButton;
    @BindView(R.id.nameEditText) EditText mName;
    @BindView(R.id.schoolEditText) EditText mSchool;
    @BindView(R.id.passwordEditText) EditText mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        mSubmitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mSubmitButton){
            //capture the user input data
            String name = mName.getText().toString();
            String school = mSchool.getText().toString();
            String password = mPassword.getText().toString();

            Intent intent = new Intent(LoginActivity.this, ContestsActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("school", school);
            intent.putExtra("password", password);

            startActivity(intent);
        }

    }
}