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

public class MainActivity extends AppCompatActivity {

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

        adapter.agregaPets(new Mascota(R.drawable.pet1, "Choki", "5"));
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
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mimenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.id_estrella) {
            Intent intent = new Intent(this, DetallePets.class);

            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}