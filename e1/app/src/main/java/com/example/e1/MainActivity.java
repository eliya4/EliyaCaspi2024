package com.example.e1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find the button
        Button btn=findViewById(R.id.button);
        //create a listener and action
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MYActivityApp","YESSS");
                Toast.makeText(MainActivity.this,"you pressed it",Toast.LENGTH_SHORT).show();
            }
        });
    }
}