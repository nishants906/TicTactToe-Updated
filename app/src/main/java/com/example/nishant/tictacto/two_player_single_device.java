package com.example.nishant.tictacto;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class two_player_single_device extends AppCompatActivity {

    public static Activity act_2p_single;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        act_2p_single = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player_single_device);
    }
}
