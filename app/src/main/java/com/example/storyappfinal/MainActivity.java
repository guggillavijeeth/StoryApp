package com.example.storyappfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    //public static final String EXTRA_MESSAGE = "start.story.MESSAGE"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void startStory(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Page1.class);
        startActivity(intent);
    }
}
