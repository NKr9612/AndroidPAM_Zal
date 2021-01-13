package com.example.newtodoapppam_zal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button checkIfHigher;
    private Button checkIfLower;
    private Button btnRandom;
    private Button btnToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //----------- BtnToast Listener
        btnToast = findViewById(R.id.btnToast);
        btnToast.setOnClickListener(newToast);
        //---------------BtnRandom
        btnRandom = findViewById(R.id.btnRandom);
        btnRandom.setOnClickListener(newRandom);
        //---------------checkIfHigher
        checkIfHigher = findViewById(R.id.checkIfHigher);
        checkIfHigher.setOnClickListener(newHigh);
        // -------------checkIfLower
        checkIfLower = findViewById(R.id.checkIfLower);
        checkIfLower.setOnClickListener(newLow);


    }
    private View.OnClickListener newLow = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView textArea = (TextView) findViewById(R.id.textArea);
            String text = (String) textArea.getText();
            int i = Integer.parseInt(text);

            if(i >= 5){
                Toast.makeText(MainActivity.this, "It's under 5", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(MainActivity.this, "Ups. Random other number", Toast.LENGTH_SHORT).show();
            }
        }
    };


    private View.OnClickListener newHigh = new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            TextView textArea = (TextView) findViewById(R.id.textArea);
            String text = (String) textArea.getText();
            int i = Integer.parseInt(text);

            if(i >= 5){
                  Toast.makeText(MainActivity.this, "It's bigger than 5", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(MainActivity.this, "Ups. Random other number", Toast.LENGTH_SHORT).show();
            }
        }
    };

    private View.OnClickListener newRandom = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Random rn = new Random();
            int answer = rn.nextInt(10) + 1;

            String answerA = Integer.toString(answer);

            TextView textArea = (TextView) findViewById(R.id.textArea);

            textArea.setText(answerA);


        }
    };


    private View.OnClickListener newToast = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Cheers!", Toast.LENGTH_SHORT).show();
        }
    };


}