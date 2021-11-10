package com.skypan.android_09_guess_the_number_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        res = (TextView)findViewById(R.id.res);
        Intent intent = this.getIntent();
        res.setText(intent.getStringExtra("wrong"));
    }

    public void back(View view){
        MainActivity2.this.finish();
    }
}