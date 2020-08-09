package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b1, b2 , b3 , b4 , b5 , b6 , b7 , b8 , b9 , b0 , bAdd , bSubtract , bMultiply , bDivide , bEqual , bDot ;
Button bClear ;
EditText ed1 ;
float res1 , res2 ;
boolean Add , Subtract , Multiply , Divide ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        we have now mapped the buttons with id
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);
        b7 = (Button)findViewById(R.id.b7);
        b8 = (Button)findViewById(R.id.b8);
        b9 = (Button)findViewById(R.id.b9);
        b0 = (Button)findViewById(R.id.b0);
        bAdd = (Button)findViewById(R.id.bAdd);
        bSubtract = (Button)findViewById(R.id.bSubtract);
        bMultiply = (Button)findViewById(R.id.bMultiply);
        bDivide = (Button)findViewById(R.id.bDivide);
        bDot = (Button)findViewById(R.id.bDot);
        bClear = (Button)findViewById(R.id.bClear);
        bEqual = (Button)findViewById(R.id.bEqual);
        ed1 = (EditText)findViewById(R.id.editText2);

        // now for action on click

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                ed1.setText(ed1.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                ed1.setText(ed1.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                ed1.setText(ed1.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                ed1.setText(ed1.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                ed1.setText(ed1.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                ed1.setText(ed1.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                ed1.setText(ed1.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                ed1.setText(ed1.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                ed1.setText(ed1.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                ed1.setText(ed1.getText() + "0");
            }
        });
        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                ed1.setText(ed1.getText() + ".");
            }
        });


        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    res1 = Float.parseFloat(ed1.getText() + "");
                    // now when '+' pressed then the text box empty & the variable stored in 'Add' ...
                    Add = true;
                    ed1.setText(null);
                }
            }
        });

        bSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    res1 = Float.parseFloat(ed1.getText() + "");
                    Subtract = true;
                    ed1.setText(null);
                }
            }
        });

        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    res1 = Float.parseFloat(ed1.getText() + "");
                    Multiply = true;
                    ed1.setText(null);
                }
            }
        });

        bDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    res1 = Float.parseFloat(ed1.getText() + "");
                    Divide = true;
                    ed1.setText(null);
                }
            }
        });







        
    }
}
