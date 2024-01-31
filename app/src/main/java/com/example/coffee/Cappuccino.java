package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Cappuccino extends AppCompatActivity {
    ImageView bckarrow;
    ImageView min;
    ImageView max;
    TextView con;
    TextView rsp;
    int count=1;
    int rate=190;

    ImageView scup;
    ImageView mcup;
    ImageView lcup;
    ImageView fcube;
    ImageView scube;
    ImageView tcube;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cappuccino);
        bckarrow=(ImageView) findViewById(R.id.imbackarrow);
        /*bckarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });*/
        min=(ImageView) findViewById(R.id.minus);
        max=(ImageView) findViewById(R.id.add);
        con=(TextView) findViewById(R.id.count);
        rsp=(TextView) findViewById(R.id.rs);
        max.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=count+1;
                con.setText(""+count);
                rsp.setText(""+(count*190));
            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=count-1;
                if(count<=1)
                    count=1;
                con.setText(""+count);
                rsp.setText(""+(count*190));

            }
        });
        scup = (ImageView) findViewById(R.id.smallcup);
        mcup = (ImageView) findViewById(R.id.medcup);
        lcup = (ImageView) findViewById(R.id.largecup);
        scup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scup.setAlpha(1.0f);
                mcup.setAlpha(0.3f);
                lcup.setAlpha(0.3f);
               rate=180;
                con.setText(""+count);
                rsp.setText(""+(rate*count));
            }
        });
        mcup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scup.setAlpha(0.3f);
                mcup.setAlpha(1.0f);
                lcup.setAlpha(0.3f);
                rate=190;
                con.setText(""+count);
                rsp.setText(""+(rate*count));
            }
        });
        lcup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scup.setAlpha(0.3f);
                mcup.setAlpha(0.3f);
                lcup.setAlpha(1.0f);
                rate=200;
                con.setText(""+count);
                rsp.setText(""+(rate*count));
            }
        });
        fcube=(ImageView) findViewById(R.id.onecube);
        scube=(ImageView) findViewById(R.id.twocube);
        tcube=(ImageView) findViewById(R.id.threecube);
        fcube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fcube.setAlpha(1.0f);
                scube.setAlpha(0.3f);
                tcube.setAlpha(0.3f);
            }
        });
        ;
        scube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fcube.setAlpha(0.3f);
                scube.setAlpha(1.0f);
                tcube.setAlpha(0.3f);
            }
        });
        tcube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fcube.setAlpha(0.3f);
                scube.setAlpha(0.3f);
                tcube.setAlpha(1.0f);
            }
        });


    }
}