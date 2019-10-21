package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Gravity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Scanner;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    static int number, number1, i;

    EditText guessNum;

    //Button subButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void on_button_click(View view) {

        TextView tv = this.findViewById (R.id.textView);

        Random ran = new Random();
        number1 = ran.nextInt(7);

        tv.setText(Integer.toString(number1));

        guessNum = findViewById(R.id.guessNum);
        number = Integer.valueOf(guessNum.getText().toString());
        TextView tv4 = this.findViewById(R.id.textView4);

        if (number == number1) {
            i = i +1;
            tv4.setGravity(Gravity.CENTER);

            tv4.setText("Congratulations!");
        }
        else {
            tv4.setText("");
        }

        TextView tv5 = this.findViewById(R.id.textView5);
        tv5.setText("Times guessed correctly = " + i );

    }

}
