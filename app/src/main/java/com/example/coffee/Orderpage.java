package com.example.coffee;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Orderpage extends AppCompatActivity {
    ImageView bckarrow;
    TextView otype;
    TextView ocount;
    TextView oamount;
    TextView osize;
    TextView ocube;
    Button buy;

    public static String type,size,cube;
    public  static int count,amount;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
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
        buy=(Button) findViewById(R.id.btnbuy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myAlterBuilder=new AlertDialog.Builder(Orderpage.this);
                myAlterBuilder.setTitle("Title");
                myAlterBuilder.setMessage("This is  Message");
                myAlterBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Orderpage.this, "sucess", Toast.LENGTH_SHORT).show();
                    }
                });
                myAlterBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Orderpage.this, "Unsucess", Toast.LENGTH_SHORT).show();
                    }
                });
                myAlterBuilder.show();


            }
        });


    }
}