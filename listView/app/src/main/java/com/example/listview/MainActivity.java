package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lst;
    String list[]={"1989","reputation","Taylor Swift","folklore","Midnights","Red","Lover","Fearless ","Speak Now"};
   ArrayAdapter arrayAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lst = findViewById(R.id.list);
        arrayAdapter = new ArrayAdapter<String>(this,R.layout.custom,R.id.textView,list);
        lst.setAdapter(arrayAdapter);


    }
}