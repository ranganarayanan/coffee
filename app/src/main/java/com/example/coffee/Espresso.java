package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Espresso extends AppCompatActivity {
    ImageView bckarrow;
    ImageView min;
    ImageView max;
    TextView con;
    TextView rsp;
    int count = 1;
    int rate = 210;
    ImageView scup;
    ImageView mcup;
    ImageView lcup;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espresso);
        bckarrow = (ImageView) findViewById(R.id.imbackarrow);
        bckarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        min = (ImageView) findViewById(R.id.minus);
        max = (ImageView) findViewById(R.id.add);
        con = (TextView) findViewById(R.id.count);
        rsp = (TextView) findViewById(R.id.rs);
        max.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count + 1;
                con.setText("" + count);
                rsp.setText("" + (count * rate));
            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count - 1;
                if (count <= 1)
                    count = 1;
                con.setText("" + count);
                rsp.setText("" + (count * rate));

            }
        });
        scup = (ImageView) findViewById(R.id.smallcup);
        mcup = (ImageView) findViewById(R.id.medcup);
        lcup = (ImageView) findViewById(R.id.largecup);
        scup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rate=200;
                con.setText(""+count);
                rsp.setText(""+(rate*count));
            }
        });
        mcup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rate=210;
                con.setText(""+count);
                rsp.setText(""+(rate*count));
            }
        });
        lcup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rate=230;
                con.setText(""+count);
                rsp.setText(""+(rate*count));
            }
        });

    }
}

