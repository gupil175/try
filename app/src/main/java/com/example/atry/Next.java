package com.example.atry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Next extends AppCompatActivity implements View.OnClickListener {
    private Button g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Button g = findViewById(R.id.button2);
        g.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}