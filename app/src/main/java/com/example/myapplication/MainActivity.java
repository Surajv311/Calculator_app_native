package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b1, b2 , b3 , b4 , b5 , b6 , b7 , b8 , b9 , b0 , bAdd , bSubtract , bMultiply , bDivide , bEqual , bDot ;
Button bClear ;
EditText ed1 ;
float Res1 , Res2 ;
boolean Add , Sub , Mul , Div ;



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






    }
}
