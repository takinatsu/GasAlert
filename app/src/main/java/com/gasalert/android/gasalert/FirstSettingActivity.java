package com.gasalert.android.gasalert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.gasalert.android.gasalart.R;

public class FirstSettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.addButton);
        EventListener eventListener = new EventListener();
        btClick.setOnClickListener(eventListener);

    }

    private class EventListener implements View.OnClickListener {
        @Override
        public void onClick(View view){
            // 要素取得
            EditText nameInput = findViewById(R.id.nameInputText);
            EditText fuelConsumptionInput = findViewById(R.id.fuelConsumptionInputText);
            EditText capacityInput = findViewById(R.id.capacityInputText);

            // 名前文字列
            String userName = nameInput.getText().toString();

            // 燃費
            int fuelInt = Integer.parseInt(fuelConsumptionInput.getText().toString());

            // タンク容量
            Double capacityInt = Double.parseDouble(capacityInput.getText().toString());

            // 何キロ走るか計算させる
            String resultString = String.valueOf(fuelInt * capacityInt);

            // 結果
            // Toast.makeText(FirstSettingActivity.this, nameString + "さんのバイクは" + resultString + "km走ります！", Toast.LENGTH_LONG).show();

            // 画面遷移時に渡すパラメーター
            Intent intent = new Intent(FirstSettingActivity.this, MenuActivity.class);
            intent.putExtra("userName" ,userName);

            // 次画面スタート
            startActivity(intent);

        }
    }
}
