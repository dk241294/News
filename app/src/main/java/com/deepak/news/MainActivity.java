package com.deepak.news;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    //ui
    private EditText searchField;
    private ImageButton searchButton;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        searchField=findViewById(R.id.search_field);
        searchButton=findViewById(R.id.search_button);
        recyclerView=findViewById(R.id.result_list);
    }

}
