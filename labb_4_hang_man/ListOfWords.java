package com.example.labb_4_hang_man;

import java.util.Arrays;
import java.util.Random;

public class ListOfWords {
    private String[] swedishWords = new String[] {"Ridutflykt","Sommar", "Kemikalie", "Rafinaderi", "Rabarber", "Saftblandare", "cykelpunktering", "Knasboll", "Smurfidol"};
    private String[] englishWords = new String[]{"Colorpicker", "Saladbar", "Housewife", "Songwriter","Hufflepuff", "Hogwarts"};


    public ListOfWords() {
        this.swedishWords = swedishWords;
        this.englishWords = englishWords;
    }

    public static void randomWord(String[] swedishWords){
        int numberOfWords = swedishWords.length;
        System.out.println(numberOfWords);
        System.out.println(swedishWords[0]);
    }
    @Override
    public String toString() {
        return "ListOfWords{" +
                "swedishWords=" + Arrays.toString(swedishWords) +
                '}';
    }

    public String[] getEnglishWords() {
        return englishWords;
    }

    private String getRandomWord(String[] stringArray){
        Random r = new Random();
        int rNumber = r.nextInt(stringArray.length);
        return stringArray[rNumber];
    }
}
