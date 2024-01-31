package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Page2 extends AppCompatActivity {
ImageView esarrrow;
ImageView caarrow;
ImageView maarrow;
ImageView moarrow;
ImageView laarrow;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        esarrrow=(ImageView) findViewById(R.id.esparrow);
        esarrrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page2.this,Espresso.class));
            }
        });
        caarrow=(ImageView) findViewById(R.id.capparrow);
        caarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page2.this, Cappuccino.class));
            }
        });
        maarrow=(ImageView) findViewById(R.id.macid);
        maarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page2.this, Macchiato.class));
            }
        });
        moarrow=(ImageView) findViewById(R.id.mocid);
        moarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page2.this, Mocha.class));
            }
        });
        laarrow=(ImageView) findViewById(R.id.latid);
        laarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page2.this, Latte.class));
            }
        });
    }
}