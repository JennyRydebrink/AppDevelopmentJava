package com.example.labb_4_hang_man;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private String developerName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAboutPageButtonPressed(View view) {
        Intent openAboutPage = new Intent(this, AboutActivity.class);
        startActivity(openAboutPage);
    }

    public void playGameButton(View view) {
        Intent playGame = new Intent(this, PlayGameActivity.class);
        startActivity(playGame);
    }
}