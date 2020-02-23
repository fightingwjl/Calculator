package com.example.less3_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnPot,btnAdd,btnSub,btnMul,btnDiv,btnEqu,btnClear,btnDel;
    private TextView textResult;
    private StringBuffer digtalA = new StringBuffer(), digtalB = new StringBuffer();
    private boolean isChar = false; //标记是否按下键
    private int operator = 0; //默认运算符为 +
    private boolean isDigtA = true; //标记第一个操作数，用于退格删除textRexsult中的内容

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcu);
        initView();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(digtalA.length() == 0){
                    return;
                }
                isChar = true;
                operator = 0;
                textResult.setText("0");
                isDigtA = false;
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(digtalA.length() == 0){
                    return;
                }
                isChar = true;
                operator = 1;
                textResult.setText("0");
                isDigtA = false;

            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(digtalA.length() == 0){
                    return;
                }
                isChar = true;
                operator = 2;
                textResult.setText("0");
                isDigtA = false;

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(digtalA.length() == 0){
                    return;
                }
                isChar = true;
                operator = 3;
                textResult.setText("0");
                isDigtA = false;

            }
        });

        btnEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(digtalA.length() == 0 || digtalB.length() ==0){
                    return;
                }
                float a = Float.parseFloat(digtalA.toString());
                float b = Float.parseFloat(digtalB.toString());
                float c = 0;
                switch (operator){
                    case 0:
                         c = a + b; break;
                    case 1:
                         c = a - b; break;
                    case 2:
                        c = a * b; break;
                    case 3:
                        c = a / b; break;
                }
                textResult.setText(c + "");
                isChar = false;
                operator = 0;
                isDigtA = true;
                digtalA = new StringBuffer();
                digtalB =new StringBuffer();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isDigtA){
                    textResult.setText("0");
                    digtalA = new StringBuffer();
                }else{
                    isChar = true;
                    textResult.setText("0");
                    digtalB = new StringBuffer();
                }
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isDigtA){
                    if(digtalA.length() > 0)
                    {
                        String temp = digtalA.substring(0, digtalA.length() - 1);
                        textResult.setText(temp);
                        digtalA = new StringBuffer();
                        digtalA.append(temp);
                    }else{
                        textResult.setText("0");
                        return;
                    }
                }else{
                    if(digtalB.length() > 0)
                    {
                        isChar = true;
                        String temp = digtalB.substring(0,digtalB.length()-1);
                        textResult.setText(temp);
                        digtalB = new StringBuffer();
                        digtalB.append(temp);
                    }else{
                        textResult.setText("0");
                        digtalB = new StringBuffer();
                        digtalB.append("0");
                        return;
                    }
                }
            }
        });

    }

    void initView(){
        textResult = this.findViewById(R.id.textResult);
        btnAdd = this.findViewById(R.id.btnAdd);
        btnSub = this.findViewById(R.id.btnSub);
        btnMul = this.findViewById(R.id.btnMul);
        btnDiv = this.findViewById(R.id.btnDiv);
        btnEqu = this.findViewById(R.id.btnEqu);
        btnClear = this.findViewById(R.id.btnC);
        btnDel = this.findViewById(R.id.btnDel);

    }
    public void myOnclick(View v){
        switch (v.getId()){
            case R.id.btn0:
                setVal("0");
                break;
            case R.id.btn1:
                setVal("1");
                break;
            case R.id.btn2:
                setVal("2");
                break;
            case R.id.btn3:
                setVal("3");
                break;
            case R.id.btn4:
                setVal("4");
                break;
            case R.id.btn5:
                setVal("5");
                break;
            case R.id.btn6:
                setVal("6");
                break;
            case R.id.btn7:
                setVal("7");
                break;
            case R.id.btn8:
                setVal("8");
                break;
            case R.id.btn9:
                setVal("9");
                break;
            case R.id.btnDot:
                setVal(".");
                break;
        }
    }

    void setVal(String s){
        if(isChar){
            digtalB.append(s);
            textResult.setText(digtalB);
        }else{
            digtalA.append(s);
            textResult.setText(digtalA);
        }
    }
}
