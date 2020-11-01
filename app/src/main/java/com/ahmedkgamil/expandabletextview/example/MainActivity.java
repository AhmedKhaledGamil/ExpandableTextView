package com.ahmedkgamil.expandabletextview.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ahmedkgamil.expandabletextview.ExpandableTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExpandableTextView expandableTextView = findViewById(R.id.expand_text_view);

        expandableTextView.setText("Day 1" +
                "\n• Arrive early at the Bahariya Oasis and get ready for the expedition" +
                "\n• Tour the Pharoanic tombs and Museum of Bahariya Oasis" +
                "\n• ride our 4X4 Cars through the Black Desert and stopping by Marsos Mountain" +
                "\n• Head to the Agabat Valley to enjoy the sand boarding experience.");
    }
}