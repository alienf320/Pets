package com.mchavez.pets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class DetallePets extends AppCompatActivity {

    private RecyclerView rvPets;
    private PetAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        establishToolbar();

        rvPets = findViewById(R.id.rvPets);
        adapter = new PetAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvPets.setLayoutManager(linearLayoutManager);
        rvPets.setAdapter(adapter);



        adapter.agregaPets(new Mascota(R.drawable.pet2, "Ruffo", "9"));
        adapter.agregaPets(new Mascota(R.drawable.pet3, "Lola", "9"));
        adapter.agregaPets(new Mascota(R.drawable.pet4, "Krali", "9"));
        adapter.agregaPets(new Mascota(R.drawable.pet5, "Peli", "9"));
        adapter.agregaPets(new Mascota(R.drawable.pet6, "Truco", "9"));
    }

    public void establishToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        // Botón "volver atrás"
        ab.setDisplayHomeAsUpEnabled(true);
    }



}