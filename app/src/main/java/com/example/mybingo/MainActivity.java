package com.example.mybingo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //最大値
    private int maxNumber = 75;

    //最大の入力欄
    private EditText maxNumberEditText;

    //最大値の設定ボタン
    private Button registerMaxNumberButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "maxNumber: " + maxNumber);
    }
}