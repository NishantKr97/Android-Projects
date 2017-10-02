package com.example.android.xox;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class xox_game extends AppCompatActivity {
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xox_game);
    }

    public void refresh(){
       for(int k=1;k<=9;k++){
           String boxes = "textView" + k + "";
         //  TextView textView = (TextView) findViewById(R.id."textView"+k);
       }
    }
    public void box(View view) {
        TextView afterClick = (TextView) view;
        if (i % 2 == 0) {
            ((TextView) view).setText("X");
        }
        else
            ((TextView) view).setText("O");
        i++;
        winnerCheck();
    }

    public void winnerCheck() {
           //getText(box0(View));
    }
}

