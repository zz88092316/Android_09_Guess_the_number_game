package com.skypan.android_09_guess_the_number_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int num,count;
    private TextView answer1,answer2;
    private Button One,Two,Three,Four,Five,Six,Seven,Eight,Nine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer1 = (TextView)findViewById(R.id.answer1);
        answer2 = (TextView)findViewById(R.id.answer2);
        One = (Button)findViewById(R.id.One);
        Two = (Button)findViewById(R.id.Two);
        Three = (Button)findViewById(R.id.Three);
        Four = (Button)findViewById(R.id.Four);
        Five = (Button)findViewById(R.id.Five);
        Six = (Button)findViewById(R.id.Six);
        Seven = (Button)findViewById(R.id.Seven);
        Eight = (Button)findViewById(R.id.Eight);
        Nine = (Button)findViewById(R.id.Nine);
        Random rand = new Random();
        num = rand.nextInt(10);
        if(num==0){
            num+=1;
        }
    }
    public void guess(int num,int buttonNum){
        count+=1;
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        if(num==buttonNum){
            answer1.setText("O");
            answer2.setText("猜對了！總共猜了 : "+count+"次");
            One.setEnabled(false);
            Two.setEnabled(false);
            Three.setEnabled(false);
            Four.setEnabled(false);
            Five.setEnabled(false);
            Six.setEnabled(false);
            Seven.setEnabled(false);
            Eight.setEnabled(false);
            Nine.setEnabled(false);
        }
        else if(num<buttonNum){
            answer1.setText("GAME OVER");
            intent.putExtra("wrong","太大了~");
            startActivity(intent);
        }
        else if(num>buttonNum){
            answer1.setText("GAME OVER");
            intent.putExtra("wrong","太小了~");
            startActivity(intent);
        }
    }
    public void one(View view) {
        guess(num,1);
    }
    public void two(View view) {
        guess(num,2);
    }

    public void three(View view) {
        guess(num,3);
    }

    public void four(View view) {
        guess(num,4);
    }

    public void five(View view) {
        guess(num,5);
    }

    public void six(View view) {
        guess(num,6);
    }

    public void seven(View view) {
        guess(num,7);
    }

    public void eight(View view) {
        guess(num,8);
    }

    public void nine(View view) {
        guess(num,9);
    }

    public void restart(View view) {
        count=0;
        answer1.setText("");
        answer2.setText("");
        One.setEnabled(true);
        Two.setEnabled(true);
        Three.setEnabled(true);
        Four.setEnabled(true);
        Five.setEnabled(true);
        Six.setEnabled(true);
        Seven.setEnabled(true);
        Eight.setEnabled(true);
        Nine.setEnabled(true);
    }
}