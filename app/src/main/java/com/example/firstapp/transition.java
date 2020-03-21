package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class transition extends AppCompatActivity implements View.OnClickListener{
    TextView show;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);

        show = findViewById(R.id.show);
        input = findViewById(R.id.input);
        Button btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String C = input.getText().toString();
                int F = Integer.parseInt(C) * 9/5 + 32;
                show.setText("结果是："+F+"F");
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
