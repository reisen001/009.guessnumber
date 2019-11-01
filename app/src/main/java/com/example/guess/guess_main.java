package com.example.guess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class guess_main extends AppCompatActivity {
    private int guesstime,random;
    private Boolean start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button number1 = (Button)findViewById(R.id.button1);       // ID
        Button number2 = (Button)findViewById(R.id.button2);
        Button number3 = (Button)findViewById(R.id.button3);
        Button number4 = (Button)findViewById(R.id.button4);
        Button number5 = (Button)findViewById(R.id.button5);
        Button number6 = (Button)findViewById(R.id.button6);
        Button number7 = (Button)findViewById(R.id.button7);
        Button number8 = (Button)findViewById(R.id.button8);
        Button  number9 = (Button)findViewById(R.id.button9);
        Button again = (Button)findViewById(R.id.button_again);
        //.....................................................................................//
        Intent intent = getIntent();
        start = intent.getBooleanExtra("start",true);
        guesstime = intent.getIntExtra("guesstime",0);
        random = intent.getIntExtra("random",0);
        //....................................................................................//


        if(start == true) {
            random = (int) (Math.random() * 9 + 1);
            intent.putExtra("start",false);
        }
        //......................................................................................//
        number1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guesstime++;
                Intent intent = new Intent(guess_main.this,guessnum.class);
                intent.putExtra("value",1);
                intent.putExtra("random", random);
                intent.putExtra("guesstime", guesstime);
                startActivity(intent);
            }
        });
        number2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guesstime++;
                Intent intent = new Intent(guess_main.this,guessnum.class);
                intent.putExtra("value",2);
                intent.putExtra("random", random);
                intent.putExtra("guesstime", guesstime);
                startActivity(intent);
            }
        });
        number3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guesstime++;
                Intent intent = new Intent(guess_main.this,guessnum.class);
                intent.putExtra("value",3);
                intent.putExtra("random", random);
                intent.putExtra("guesstime", guesstime);
                startActivity(intent);
            }
        });
        number4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guesstime++;
                Intent intent = new Intent(guess_main.this,guessnum.class);
                intent.putExtra("value",4);
                intent.putExtra("random", random);
                intent.putExtra("guesstime", guesstime);
                startActivity(intent);
            }
        });
        number5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guesstime++;
                Intent intent = new Intent(guess_main.this,guessnum.class);
                intent.putExtra("value",5);
                intent.putExtra("random", random);
                intent.putExtra("guesstime", guesstime);
                startActivity(intent);
            }
        });
        number6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guesstime++;
                Intent intent = new Intent(guess_main.this,guessnum.class);
                intent.putExtra("value",6);
                intent.putExtra("random", random);
                intent.putExtra("guesstime", guesstime);
                startActivity(intent);
            }
        });
        number7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guesstime++;
                Intent intent = new Intent(guess_main.this,guessnum.class);
                intent.putExtra("value",7);
                intent.putExtra("random", random);
                intent.putExtra("guesstime", guesstime);
                startActivity(intent);
            }
        });
        number8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guesstime++;
                Intent intent = new Intent(guess_main.this,guessnum.class);
                intent.putExtra("value",8);
                intent.putExtra("random", random);
                intent.putExtra("guesstime", guesstime);
                startActivity(intent);
            }
        });
        number9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guesstime++;
                Intent intent = new Intent(guess_main.this,guessnum.class);
                intent.putExtra("value",9);
                intent.putExtra("random", random);
                intent.putExtra("guesstime", guesstime);
                startActivity(intent);
            }
        });
        again.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                random =  (int)(Math.random()* 9+1);
                guesstime = 0;

            }
        });
}
    }