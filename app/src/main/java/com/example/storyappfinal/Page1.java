package com.example.storyappfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
    }

    public void openP2Talk (View view){
        Intent intent = new Intent(this, Page2Talk.class);
        startActivity(intent);
    }

    public void openP2Avoid (View view){
        Intent intent = new Intent(this, Page2Avoid.class);
        startActivity(intent);
    }
}
