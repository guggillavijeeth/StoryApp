package com.example.storyappfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page2Talk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2_talk);
    }

    public void openFinal(View view){
        Intent intent = new Intent(this, FinalPage.class);
        startActivity(intent);
    }
}
