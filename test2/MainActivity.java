package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn9,btn8,btn7,btn6,btn5,btn4,btn3,btn2,btn1,btn0,
            dot,sub,add,mul,div,eq,clr;
    private TextView result;
    private TextView current ;
    private double val1 = Double.NaN,val2;
    private final char ADD = '+',SUB = '-',DIV = '/',MUL = '*',EQUAL = '=';
    private char compute  = '0';

    private void setButton(){
        Button btn9 = (Button)findViewById(R.id.btn9);
        Button btn8 = (Button)findViewById(R.id.btn8);
        Button btn7 = (Button)findViewById(R.id.btn7);
        Button btn6 = (Button)findViewById(R.id.btn6);
        Button btn5 = (Button)findViewById(R.id.btn5);
        Button btn4 = (Button)findViewById(R.id.btn4);
        Button btn3 = (Button)findViewById(R.id.btn3);
        Button btn2 = (Button)findViewById(R.id.btn2);
        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn0 = (Button)findViewById(R.id.btn0);
        Button dot = (Button)findViewById(R.id.btndot);
        Button sub = (Button)findViewById(R.id.btnsub);
        Button add = (Button)findViewById(R.id.btnadd);
        Button div = (Button)findViewById(R.id.btndiv);
        Button mul = (Button)findViewById(R.id.btnmul);
        Button clr = (Button)findViewById(R.id.btnclr);
        Button eq = (Button)findViewById(R.id.btneq);
        TextView result = (TextView)findViewById(R.id.resulttext);
        TextView current = (TextView)findViewById(R.id.currenttext);
    }
    private void click(){

        current.setText(null);
        result.setText(null);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current.setText(current.getText().toString().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current.setText(current.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current.setText(current.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current.setText(current.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current.setText(current.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current.setText(current.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current.setText(current.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current.setText(current.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current.setText(current.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current.setText(current.getText().toString() + "9");
            }
        });
        /*dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current.setText(current.getText().toString() + ".");
            }
        });*/
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solve();
                current.setText(current.getText().toString() + "/");
                compute = DIV;
                current.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute = MUL;
                solve();
                current.setText(current.getText().toString() + "*");

                current.setText(null);
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solve();
                current.setText(current.getText().toString() + "=");

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute = ADD;
                solve();
                current.setText(current.getText().toString() + "+");

                current.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute =SUB;
                solve();
                current.setText(current.getText().toString() + "-");

                current.setText(null);
            }
        });




    }
    private  void solve(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(current.getText().toString());
            switch (compute){
                case ADD:
                    val1 = val2 + val1;
                case SUB:
                    val1 = val2 - val1;
                case  MUL:
                    val1 = val2 * val1;
                case  DIV:
                    val1 = val2 / val1;
                case EQUAL:
                    break;
            }

        }
        else{
            val1 = Double.parseDouble(current.getText().toString());
        }

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButton();
        click();



    }
}