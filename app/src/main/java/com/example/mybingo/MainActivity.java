package com.example.mybingo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //最大値
    private int maxNumber = 75;

    //最大の入力欄
    private EditText maxNumberEditText;

    //最大値の設定ボタン
    private Button registerMaxNumberButton;

    //次の数字を出すボタン
    private Button nextNumberButton;

    //現在の数字を表示するTextView
    private TextView currentNumberTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ビューの変数を初期化する。
        maxNumberEditText = findViewById(R.id.max_number);
        registerMaxNumberButton = findViewById(R.id.register_max_number);
        nextNumberButton = findViewById(R.id.next_number);
        currentNumberTextView = findViewById(R.id.current_number);

        //最大値の初期化をEditTextにセットする。
        maxNumberEditText.setText("" + maxNumber);

        //最大値を更新する。
        registerMaxNumberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 入力値を文字列で取り出す
                String maxNumberString = maxNumberEditText.getText().toString();
                //int型に変換してから代入する。
                maxNumber = Integer.valueOf(maxNumberString);

                Log.d("MainActivity", "maxNumber: " + maxNumber);
            }
        });

        //表示中の数字を更新する。
        nextNumberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickNextNumber();
            }
        });
    }
    //nextNumberButtonがタップされたときの処理
    private void onClickNextNumber(){
        Log.d("MainActivity", "onClickNextNumber");
        //0.0~74.0(最大値が初期値の場合)の数値を生成する。
        double randomNumber = Math.random() * (maxNumber - 1);

        //1~75(最大値が初期値の場合)の整数を生成する。
        int nextNumber = (int) randomNumber + 1;

        //nextNumberを画面に表示する。
        currentNumberTextView.setText("" + nextNumber);

        Log.d("MainActivity", "nextNumber: " + nextNumber);
    }
}