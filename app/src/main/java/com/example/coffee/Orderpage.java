package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Orderpage extends AppCompatActivity {
    ImageView bckarrow;
    TextView otype;
    TextView ocount;
    TextView oamount;
    TextView osize;
    TextView ocube;
    public static String type,size,cube;
    public  static int count,amount;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderpage);
        bckarrow=(ImageView) findViewById(R.id.imbackarrow);
        bckarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        otype=(TextView) findViewById(R.id.type);
        ocount=(TextView) findViewById(R.id.count);
        oamount=(TextView) findViewById(R.id.amount);
        osize=(TextView) findViewById(R.id.size);
        ocube=(TextView) findViewById(R.id.cube);
        otype.setText(type);
        ocount.setText(""+count);
        oamount.setText("" +count+ "*" +amount+ "=" +(count*amount));
        osize.setText(size);
        ocube.setText(cube);


    }
}