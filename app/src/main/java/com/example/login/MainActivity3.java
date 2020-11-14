package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity3 extends AppCompatActivity {
    String Countries[] = {"Afghanistan","Albania","Algeria","Bahrain","Bangladesh","Canada","Colombia","Denmark","Egypt","France","Finland",
    "Germany","Greece","Haiti","IceLand","India","Indonesia","Iran","Iraq","Japan","Jordan","Kenya","Kuwait","Kyrgyzstan","Libya","Liberia","Lebanon",
   "Malaysia","Maldives","Nepal","Nigeria","Oman","Pakistan","Philippines","Qatar","Romaina","Russia","Saudia Arabia","Spain","Syria",
    "Tajikistan","Tanzania","Turkey","Uganda","Uzebekistan","Vanuatu","Venezuela","Wurttemberg","Yemen","Zambia","Zimbabwe"};
TextView C;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        String A = getIntent().getStringExtra("alpha");

        C = (TextView) findViewById(R.id.Country);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Countries);
        ListView listview = (ListView) findViewById(R.id.listView1);
        for(String i : Countries){
            if(i.startsWith(A)){
                C.append(i +"\n");
            }
        }


    }
}