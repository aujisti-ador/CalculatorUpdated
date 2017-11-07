package com.ador.calculatorupdated;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView history,display;
    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_dot,btn_plus,btn_minus,btn_div,btn_mul,btn_clear,btn_alter,btn_percent,btn_del,btn_result;

    double value_1,value_2;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision,mPercent ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        history = findViewById(R.id.tv_history);
        display = findViewById(R.id.tv_result);

        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);

        btn_dot = findViewById(R.id.btn_dot);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_div = findViewById(R.id.btn_div);
        btn_mul = findViewById(R.id.btn_multi);
        btn_clear = findViewById(R.id.btn_clear);
        btn_alter = findViewById(R.id.btn_alter);
        btn_percent = findViewById(R.id.btn_percent);
        btn_del = findViewById(R.id.btn_del);
        btn_result = findViewById(R.id.btn_equal);

        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);

        btn_dot.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_mul.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_alter.setOnClickListener(this);
        btn_percent.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_result.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btn_0:
                display.setText(display.getText()+"0");
                //history.setText(history.getText()+"0");
                break;
            case R.id.btn_1:
                display.setText(display.getText()+"1");
                //history.setText(history.getText()+"1");
                break;
            case R.id.btn_2:
                display.setText(display.getText()+"2");
                //history.setText(history.getText()+"2");
                break;
            case R.id.btn_3:
                display.setText(display.getText()+"3");
                //history.setText(history.getText()+"3");
                break;
            case R.id.btn_4:
                display.setText(display.getText()+"4");
                //history.setText(history.getText()+"4");
                break;
            case R.id.btn_5:
                display.setText(display.getText()+"5");
                //history.setText(history.getText()+"5");
                break;
            case R.id.btn_6:
                display.setText(display.getText()+"6");
                //history.setText(history.getText()+"6");
                break;
            case R.id.btn_7:
                display.setText(display.getText()+"7");
                //history.setText(history.getText()+"7");
                break;
            case R.id.btn_8:
                display.setText(display.getText()+"8");
                //history.setText(history.getText()+"8");
                break;
            case R.id.btn_9:
                display.setText(display.getText()+"9");
                //history.setText(history.getText()+"9");
                break;


            case R.id.btn_dot:
                String dotCheck = (String) display.getText();
                if (dotCheck.indexOf('.')!=-1)
                {
                    Toast.makeText(this, "Cant enter . (dot) twice!", Toast.LENGTH_SHORT).show();
                    break;
                }
                else {
                    display.setText(display.getText()+".");
                    history.setText(history.getText()+".");
                    break;
                }
            case R.id.btn_clear:
                display.setText("");
                history.setText("");
                break;
            case R.id.btn_alter:
                String alterCheck = display.getText().toString();
                if (alterCheck.indexOf('-')==-1)
                {
                    display.setText("-"+alterCheck);
                }
                else {
                    display.setText(""+display.getText());
                    break;
                }
            case R.id.btn_del:
                if (display.getText().toString() == null)
                {
                    display.setText("");
                }
                else {

                    try {
                        String text = display.getText().toString();
                        String text2 = display.getText().toString();
                        display.setText(text.substring(0, text.length() - 1));
                        history.setText(text2.substring(0, text.length() - 1));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                //history.setText(text.substring(0, text.length() - 1));
                break;

            case R.id.btn_plus:
                if (display.getText().toString() == null){
                    display.setText("");
                }else {
                    try {
                        history.setText(history.getText()+display.getText().toString()+"+");
                        value_1 = Double.parseDouble(display.getText() + "");
                        mAddition = true;
                        display.setText(null);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case R.id.btn_minus:
                if (display.getText().toString() == null){
                    display.setText("");
                }else {
                    try {
                        history.setText(history.getText()+display.getText().toString()+"-");
                        value_1 = Double.parseDouble(display.getText() + "");
                        mSubtract = true;
                        display.setText(null);

                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case R.id.btn_div:
                if (display.getText().toString() == null){
                    display.setText("");
                }else {
                    try {
                        history.setText(history.getText()+display.getText().toString()+"÷");
                        value_1 = Double.parseDouble(display.getText() + "");
                        mDivision = true;
                        display.setText(null);

                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case R.id.btn_multi:
                if (display.getText().toString() == null){
                    display.setText("");
                }else {
                    try {
                        history.setText(history.getText()+display.getText().toString()+"x");
                        value_1 = Double.parseDouble(display.getText() + "");
                        mMultiplication = true;
                        display.setText(null);

                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
                break;

            case R.id.btn_percent:
                if (display == null){
                    display.setText("");
                }else {
                    try {
                        //history.setText(history.getText()+"%");
                        //history.setText(history.getText()+display.getText().toString()+"%");
                        value_1 = Double.parseDouble(display.getText() + "");
                        value_1=value_1/100;
                        display.setText(String.valueOf(value_1));
                        history.setText(history.getText()+"%"+String.valueOf(value_1));
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
                break;

            case R.id.btn_equal:
                if (display == null){
                    display.setText("");
                }else {
                    try {
                        value_2 = Double.parseDouble(display.getText() + "");


                        if (mAddition == true){
                            value_1=value_1+value_2;
                            history.setText(history.getText().toString()+display.getText().toString());
                            display.setText(value_1+"");
                            mAddition=false;
                        }


                        else if (mSubtract == true){
                            value_1=value_1-value_2;
                            history.setText(history.getText().toString()+display.getText().toString());
                            display.setText(value_1+"");
                            mSubtract=false;
                        }

                        else if (mMultiplication == true){
                            value_1=value_1*value_2;
                            history.setText(history.getText().toString()+display.getText().toString());
                            display.setText(value_1+"");
                            mMultiplication=false;
                        }

                        else if (mDivision == true){
                            value_1=value_1/value_2;
                            history.setText(history.getText().toString()+display.getText().toString());
                            display.setText(value_1+"");
                            mDivision=false;
                        }
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
                break;


        }



    }
}
