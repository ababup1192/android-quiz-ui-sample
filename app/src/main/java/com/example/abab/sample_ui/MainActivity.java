package com.example.abab.sample_ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list_view);

        List<Choice> choiceList = new ArrayList<>();
        choiceList.add(new Choice("A"));
        choiceList.add(new Choice("B"));
        choiceList.add(new Choice("C"));
        choiceList.add(new Choice("D"));

        ChoiceAdapter adapter = new ChoiceAdapter(MainActivity.this, choiceList);
        listView.setAdapter(adapter);
    }
}
