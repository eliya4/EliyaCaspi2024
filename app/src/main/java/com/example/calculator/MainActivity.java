package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display=findViewById(R.id.EditText);
        display.setShowSoftInputOnFocus(false);
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getString(R.string.enter_num).equals(display.getText().toString()))
                {
                    display.setText("");
                }
            }
        });
    }
    private  void updateText(String stringToAdd){
       String oldStr = display.getText().toString();
       int cursorPos = display.getSelectionStart();
       String leftStr = oldStr.substring(0, cursorPos);
       String rightSrr =oldStr.substring(cursorPos);
       display.setText(String.format("%s%s%s",leftStr,stringToAdd,rightSrr));
       display.setSelection(cursorPos+1);

    }

    public void button1(View view){
        updateText("0");

    }
    public void button(View view){
        updateText("1");

    }
    public  void button2(View view){
        updateText("2");

    }
    public  void  button3(View view){
        updateText("3");

    }
    public  void button4(View view){
        updateText("4");

    }
    public  void button5(View view){
        updateText("5");

    }
    public  void button6(View view){
        updateText("6");

    }
    public  void button7(View view){
        updateText("7");

    }
    public void button8(View view){
        updateText("8");

    }
    public  void button9(View view){
        updateText("9");

    }
    public  void dot(View view){
        updateText(".");

    }
    public  void eqol(View view){

    }
    public  void Pr(View view){
        updateText("=");

    }
    public  void div(View view){
        updateText("/");

    }
    public  void  multiplication(View view){
        updateText("*");

    }
    public  void plus(View view){
        updateText("+");

    }
    public  void min(View view){
        updateText("-");

    }
    public  void pow(View view){
        updateText("^");

    }
    public  void root(View view){

    }
    public  void c(View view){
        display.setText("");

    }
    public  void del(View view){

    }



}