package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b1, b2 , b3 , b4 , b5 , b6 , b7 , b8 , b9 , b0 , bAdd , bSubtract , bMultiply , bDivide , bEqual , bDot ;
Button bClear ;
EditText edit_text ;
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
        edit_text = (EditText)findViewById(R.id.editText2);

        // now for action on click

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                edit_text.setText(edit_text.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                edit_text.setText(edit_text.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                edit_text.setText(edit_text.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                edit_text.setText(edit_text.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                edit_text.setText(edit_text.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                edit_text.setText(edit_text.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                edit_text.setText(edit_text.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                edit_text.setText(edit_text.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                edit_text.setText(edit_text.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                edit_text.setText(edit_text.getText() + "0");
            }
        });
        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setting the value 1 whatever you put in the edit box
                edit_text.setText(edit_text.getText() + ".");
            }
        });


        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit_text==null){
                    edit_text.setText("");
                }
                else{
                    res1 = Float.parseFloat(edit_text.getText() + "");
                    // now when '+' pressed then the text box empty & the variable stored in 'Add' ...
                    Add = true;
                    edit_text.setText(null);
                }
            }
        });

        bSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit_text==null){
                    edit_text.setText("");
                }
                else{
                    res1 = Float.parseFloat(edit_text.getText() + "");
                    Subtract = true;
                    edit_text.setText(null);
                }
            }
        });

        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit_text==null){
                    edit_text.setText("");
                }
                else{
                    res1 = Float.parseFloat(edit_text.getText() + "");
                    Multiply = true;
                    edit_text.setText(null);
                }
            }
        });

        bDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit_text==null){
                    edit_text.setText("");
                }
                else{
                    res1 = Float.parseFloat(edit_text.getText() + "");
                    Divide = true;
                    edit_text.setText(null);
                }
            }
        });

bEqual.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        res2 = Float.parseFloat(edit_text.getText()+ "");
        if(Add==true){
            edit_text.setText(res1 + res2 + "");
            Add=false ;
        }
        if(Subtract==true){
            edit_text.setText(res1 - res2 + "");
            Subtract=false ;
        }
        if(Multiply==true){
            edit_text.setText(res1 * res2 + "");
            Multiply=false ;
        }
        if(Divide==true){
            edit_text.setText(res1 / res2 + "");
            Divide=false ;
        }
    }
});


bClear.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        edit_text.setText("");
    }
});



    }
}
