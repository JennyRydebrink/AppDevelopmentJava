package com.example.labb_4_hang_man;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
    //onClick button pressed return to main menu
    public void returnToMainMenu(View view) {
        Intent returnToMainMenu = new Intent(this, MainActivity.class);
        startActivity(returnToMainMenu);
    }
}