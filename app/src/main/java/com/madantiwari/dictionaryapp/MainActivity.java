package com.madantiwari.dictionaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView txtAuto;
    Button btnsearch;
    ListView lstwords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAuto = findViewById(R.id.autoText);
        btnsearch = findViewById(R.id.btnSearch);
        lstwords = findViewById(R.id.lstWords);


    }
}
