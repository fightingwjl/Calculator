package com.example.less3_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPot,btnAdd,btnSub,btnMul,btnDiv;
    Button[] btn = new Button[10];
    int[] btnId = {R.id.btn0,R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9};
    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcu);
       initView();
        textResult = this.findViewById(R.id.textResult);
        //匿名内部类实现方法
//        btn0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textResult.setText("0");
//            }
//        });
        for(int i=0; i<btn.length; i++){
            btn[i].setOnClickListener(new myClick());
        }
//        btn1.setOnClickListener(new myClick());
//        btn2.setOnClickListener(new myClick());
//        btn3.setOnClickListener(new myClick());
//        btn4.setOnClickListener(new myClick());
//        btn5.setOnClickListener(new myClick());
//        btn6.setOnClickListener(new myClick());
//        btn7.setOnClickListener(new myClick());
//        btn8.setOnClickListener(new myClick());
//        btn9.setOnClickListener(new myClick());
    }
    void  initView(){
        for(int i=0; i < btn.length; i++){
            btn[i] = this.findViewById(btnId[i]);
        }
//        btn0 = this.findViewById(R.id.btn0);
//        btn1 = this.findViewById(R.id.btn1);
//        btn2 = this.findViewById(R.id.btn2);
//        btn3 = this.findViewById(R.id.btn3);
//        btn4 = this.findViewById(R.id.btn4);
//        btn5 = this.findViewById(R.id.btn5);
//        btn6 = this.findViewById(R.id.btn6);
//        btn7 = this.findViewById(R.id.btn7);
//        btn8 = this.findViewById(R.id.btn8);
//        btn9 = this.findViewById(R.id.btn9);
    }

    //定义内部类实现方法
    class myClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn0: textResult.setText("0"); break;
                case R.id.btn1: textResult.setText("1"); break;
                case R.id.btn2: textResult.setText("2"); break;
                case R.id.btn3: textResult.setText("3"); break;
                case R.id.btn4: textResult.setText("4"); break;
                case R.id.btn5: textResult.setText("5"); break;
                case R.id.btn6: textResult.setText("6"); break;
                case R.id.btn7: textResult.setText("7"); break;
                case R.id.btn8: textResult.setText("8"); break;
                case R.id.btn9: textResult.setText("9"); break;
            }
        }
    }
}
