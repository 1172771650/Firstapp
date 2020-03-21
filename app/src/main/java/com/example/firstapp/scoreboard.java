package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class scoreboard extends AppCompatActivity {
    TextView score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreboard);
        score = (TextView)findViewById(R.id.score);
    }
    public void btn1(View btn){
        showscore(1);
    }
    public void btn2(View btn){
        showscore(2);
    }
    public void btn3(View btn){
        showscore(3);
    }
    public void btn0(View btn){
        score.setText("0");
    }
    private void showscore(int inc){
        Log.i("show","inc="+inc);
        String oldscore = (String) score.getText();
        int newscore = Integer.parseInt(oldscore) + inc;
        score.setText(""+newscore);

    }

}
