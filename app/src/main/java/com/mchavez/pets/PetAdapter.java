package com.mchavez.pets;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import com.mchavez.pets.PetHolder;

public class PetAdapter extends RecyclerView.Adapter<PetHolder> {

    private List<Mascota> petList;

    public PetAdapter() {
        petList = new ArrayList<>();
    }

    @NonNull
    @Override
    public PetHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        return new PetHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PetHolder holder, int i) {
        PetHolder.init(petList.get(i));
    }

    @Override
    public int getItemCount() {
        return petList.size();
    }

    public void agregaPets(Mascota mascota) {
        petList.add(mascota);
        notifyDataSetChanged();
    }
}