package com.example.simplediceroller16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView displayNumber = findViewById(R.id.textDisplay);
        ImageView displayDice = findViewById(R.id.imageDisplay);
        Button generateNumber = findViewById(R.id.buttonGenerate);

        generateNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final int max = 6;
                final int min = 1;

                int randomNumber = (int)Math.floor(Math.random()*(max-min+1)+min);

                if(randomNumber==1)
                {
                    displayDice.setImageResource(R.drawable.dice1);
                    displayNumber.setText("1");
                }
                else
                    if(randomNumber==2)
                    {
                        displayNumber.setText("2");
                        displayDice.setImageResource(R.drawable.dice2);
                    }
                else
                    if(randomNumber==3)
                    {
                        displayNumber.setText("3");
                        displayDice.setImageResource(R.drawable.dice3);
                    }
                else
                    if(randomNumber==4)
                    {
                        displayNumber.setText("4");
                        displayDice.setImageResource(R.drawable.dice4);
                    }
                else
                    if(randomNumber==5)
                    {
                        displayNumber.setText("5");
                        displayDice.setImageResource(R.drawable.dice5);
                    }
                else
                    if(randomNumber==6)
                    {
                        displayNumber.setText("6");
                        displayDice.setImageResource(R.drawable.dice6);
                    }


            }
        });
    }
}