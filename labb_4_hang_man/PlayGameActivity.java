package com.example.labb_4_hang_man;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Random;

public class PlayGameActivity extends AppCompatActivity {

    private ListOfWords svenska;
    private String[] swedishWords2 = new String[] {"Ridutflykt","Sommar", "Kemikalie", "Rafinaderi", "Rabarber", "Saftblandare", "cykelpunktering", "Knasboll", "Smurfidol"};
    private String[] englishWords2 = new String[]{"Colorpicker", "Saladbar", "Housewife", "Songwriter","Hufflepuff", "Hogwarts"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);
    }

    private String getRandomWord(String [] sArray){
        Random r = new Random();
        int rNumber = r.nextInt(sArray.length);
        return sArray[rNumber];
    }




}