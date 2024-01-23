package com.example.myapplication;

import static android.view.View.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button1);
        button=findViewById(R.id.button2);
        button=findViewById(R.id.button3);
        button=findViewById(R.id.button4);
        editText=findViewById(R.id.edt1);
        editText=findViewById(R.id.edt2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button2 = (Button) findViewById(R.id.button2);
                Button button3 = (Button) findViewById(R.id.button3);
                EditText edt1=(EditText)findViewById(R.id.edt1);
                EditText edt2=(EditText)findViewById(R.id.edt2);
                int num1,num2;
                num1= Integer.parseInt(edt1.getText().toString());
                num2=Integer.parseInt(edt2.getText().toString());

                if(button2.isPressed())
               {
                   Toast.makeText(getBaseContext(),num1+num2,Toast.LENGTH_LONG).show();
               }
               else if(button3.isPressed())
               {
                   Toast.makeText(getBaseContext(),num1-num2,Toast.LENGTH_LONG).show();
               }

            }
        });
    }
}