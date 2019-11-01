package com.example.guess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class guessnum extends AppCompatActivity {
    private int value,guesstime,random;
    private boolean start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);
        Button back = (Button) findViewById(R.id.button_back);
        TextView decide = (TextView) findViewById(R.id.textView_decide);
        //--------------------------------------------------------------------------------//
        Intent intent = new Intent();
        //start = getIntent().getBooleanExtra("start", true);
        value = getIntent().getIntExtra("value", 0);
        random = getIntent().getIntExtra("random",0);
        guesstime = getIntent().getIntExtra("guesstime",0);
        //--------------------------------------------------------------------------------//
        Log.e("dddgwrwwgw","===start==="+start+"===value==="+value+"===random==="+random+"===guesstime==="+guesstime+"========");
        if(random==value){
            decide.setText("猜對了\n"+"共猜了："+guesstime+"次");
            back.setText("再玩一次");
            start = true;
            guesstime=0;
        }
        else if(random<value){
            decide.setText("太大了");
            start = false;
        }
        else if(random>value){
            decide.setText("太小了");
            start = false;
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guessnum.this,guess_main.class);
                intent.putExtra("start", start);
                intent.putExtra("random", random);
                intent.putExtra("guesstime", guesstime);
                startActivity(intent);
            }
        });

    }
}
