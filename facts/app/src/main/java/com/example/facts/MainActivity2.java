package com.example.facts;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String t;
        TextView text;

        Random rand = new Random();
        text=findViewById(R.id.text1);
        Intent intent =getIntent();
        String[] facts={"taylor swift is the best singer","Folklore is the best album","the best number is 15"};
        int n = rand.nextInt(4);
        t=facts[n];
        text.setText(t);


    }
}