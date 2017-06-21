package com.example.nishant.tictacto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class one_player extends AppCompatActivity {

    Button easy, hard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_player);
        easy = (Button) findViewById(R.id.easy);
        easy.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(one_player.this, one_p_easy.class);
                        startActivity(intent);
                    }
                }
        );
        hard = (Button) findViewById(R.id.hard);
        hard.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(one_player.this, one_p_difficult.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
