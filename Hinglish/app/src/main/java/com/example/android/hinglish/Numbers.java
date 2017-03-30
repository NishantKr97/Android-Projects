package com.example.android.hinglish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("ek","one"));
        words.add(new word("do","two"));
        words.add(new word("teen","three"));
        words.add(new word("char","four"));
        words.add(new word("paanch","five"));
        words.add(new word("chhe","six"));
        words.add(new word("saat","seven"));
        words.add(new word("aatth","eight"));
        words.add(new word("nau","nine"));
        words.add(new word("dus","ten"));



        ArrayAdapter<word> itemsAdapter = new ArrayAdapter<word>(this,R.layout.list_item, words);

       ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
