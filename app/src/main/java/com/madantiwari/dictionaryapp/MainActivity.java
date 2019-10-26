package com.madantiwari.dictionaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
   private AutoCompleteTextView txtAuto;
   private Button btnsearch;
   private TextView tvmeaning;
   private ListView lstwords;
   private Map<String,String> wordMeanings;

    public static final String wordTomeaning[]={
            "consider","deem to be",
            "accord","concurrence of opinion",
            "intend","have in mind as a purpose",
            "approach","move towards",
            "establish","set up or found",
            "obtain","come into possession of",
            "straight","successive, without a break",
            "vain","unproductive of success",
            "constant","a quantity that does not vary",
            "render","give an interpretation of",
            "appeal","be attractive to",
            "generate","bring into existence",
            "confer","have a meeting in order to talk something over",
            "grant","allow to have",
            "entertain","provide amusement for",
            "yield","give or supply",
            "inspire","serve as the inciting cause of",
            "reflect","reflect",
            "venture","proceed somewhere despite the risk of possible dangers",
            "temper","a characteristic state of feeling",
            "bent","fixed in your purpose",
            "majority","more than half of the votes in an election",
            "tide","the periodic rise and fall of the sea level",
            "distinction","a discrimination between things as different",
            "allege","report or maintain"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAuto = findViewById(R.id.autoText);
        btnsearch = findViewById(R.id.btnSearch);
        tvmeaning = findViewById(R.id.tvMeaning);
        lstwords = findViewById(R.id.lstWords);

        wordMeanings = new HashMap<>();
        for (int i = 0; i<wordTomeaning.length; i+=2)
        {
            wordMeanings.put(wordTomeaning[i], wordTomeaning[i+1]);
        }

        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, new ArrayList(wordMeanings.keySet())
        );

        lstwords.setAdapter(arrayAdapter);



    }
}
