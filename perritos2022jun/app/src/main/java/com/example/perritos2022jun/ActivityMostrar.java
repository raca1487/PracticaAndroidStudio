package com.example.perritos2022jun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ActivityMostrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        RecyclerView recyclerView = findViewById(R.id.reciclador);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        DogAdapter adapter = new DogAdapter(cargarDatos());
        recyclerView.setAdapter(adapter);
    }

    public List<Dog> cargarDatos() {
        ArrayList<Dog> listaDogs = new ArrayList<>();

        listaDogs.add(new Dog(R.drawable.perro1, "Locki", 12));
        listaDogs.add(new Dog(R.drawable.perro2, "Roko", 20));
        listaDogs.add(new Dog(R.drawable.perro3, "Rafalito", 18));
        listaDogs.add(new Dog(R.drawable.perro4, "Simba", 8));
        listaDogs.add(new Dog(R.drawable.perro5, "Akura", 10));
        listaDogs.add(new Dog(R.drawable.perro6, "AwesomeDog", 5));

        return listaDogs;

    }

}