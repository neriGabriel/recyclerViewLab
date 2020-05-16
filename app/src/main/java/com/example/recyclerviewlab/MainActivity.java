package com.example.recyclerviewlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // UTILIZADO PARA LOG DE ERROS
    // public static final String TAG = MainActivity.class.getSimpleName();

    private List<String> stringList = new ArrayList<String>();
    private RecyclerAdapter myAdapter;
    private Random random           = new Random();

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.recyclerView = findViewById(R.id.recyclerView);


        //SETO O LAYOUTMANAGER DA RECYCLERVIEW
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //STARTO MEU ARRAY DE ITENS
        this.populateList();
        //STARTO MEU ADAPTER INICIANDO COM VALORES
        this.myAdapter = new RecyclerAdapter(this.stringList);
        //SETO MEU ADAPTER PARA O RECYCLER VIEW
        this.recyclerView.setAdapter(myAdapter);
    }

    private void populateList() {

        int numero = this.random.nextInt(100);
        for(int i = 0; i <= 10; i++) {
            stringList.add("Gabriel "+ (numero+i));
        }
    }
}
