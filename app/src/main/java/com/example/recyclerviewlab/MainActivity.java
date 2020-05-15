package com.example.recyclerviewlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> stringList = new ArrayList<String>();

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.populateList();

        recyclerView = findViewById(R.id.recyclerView);
        //recyclerView.setAdapter();
    }

    private void populateList() {
        for(int i = 0; i <= 10; i++) {
            stringList.add("Gabriel "+i);
        }
    }
}
