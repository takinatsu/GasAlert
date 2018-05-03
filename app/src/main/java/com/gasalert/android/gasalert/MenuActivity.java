package com.gasalert.android.gasalert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        // ようこそメッセージ
        tvWelcomeMsg.setText("ようこそ、" + userName + "さん！");

        // ボタン押下時イベント
        Button btClick = findViewById(R.id.mapButton);
        EventListener eventListener = new EventListener();
        btClick.setOnClickListener(eventListener);
    }

    private class EventListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MenuActivity.this, MapsActivity.class);
            startActivity(intent);
        }
    }
}
