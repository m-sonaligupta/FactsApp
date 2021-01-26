package com.guptasonali.facts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView factsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] myfacts = Fact.getFacts();

        factsTextView = findViewById(R.id.txt_fact);

        for (String fact : myfacts){
            factsTextView.append(fact +"\n\n");
        }

    }
}