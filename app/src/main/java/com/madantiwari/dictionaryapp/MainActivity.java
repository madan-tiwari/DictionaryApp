package com.madantiwari.dictionaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   private AutoCompleteTextView txtAuto;
   private Button btnsearch;
   private TextView tvmeaning;
   private ListView lstwords;
   private Map<String,String> wordMeanings;
   String word;

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
//autocomplete text
        ArrayAdapter autoArray = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, new ArrayList(wordMeanings.keySet())
        );

        txtAuto.setAdapter(autoArray);
        txtAuto.setThreshold(1);
//btn code

        btnsearch.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        word = txtAuto.getText().toString();
        String meaning = wordMeanings.get(word);
        tvmeaning.setText("The meaning of "+word+" is "+meaning);

       // Toast.makeText(this, "The meaning of "+word+" is "+meaning, Toast.LENGTH_SHORT).show();
    }
}
