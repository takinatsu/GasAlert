package com.gasalert.android.gasalert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.gasalert.android.gasalart.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");

        TextView tvWelcomeMsg = findViewById(R.id.welcomeMsg);

        tvWelcomeMsg.setText(userName);
    }
}
