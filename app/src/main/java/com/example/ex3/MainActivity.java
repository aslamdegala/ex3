package com.example.ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ll(View view) {
        Intent i=new Intent(MainActivity.this,linear.class);
        startActivity(i);
    }

    public void RL(View view) {
        Intent i =new Intent(MainActivity.this,relative.class);
        startActivity(i);
    }

    public void TL(View view) {
        Intent i =new Intent(MainActivity.this,table.class);
        startActivity(i);
    }
}