package com.mchavez.pets;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PetHolder extends RecyclerView.ViewHolder {

    private static ImageView imgPet;

    public static ImageButton btnHueso;
    private static TextView nombrePet;
    private static TextView rating;
    private static ImageButton btnHueso2;

    public PetHolder(@NonNull View itemView) {
        super(itemView);

        imgPet = itemView.findViewById(R.id.imgPet);
        btnHueso = itemView.findViewById(R.id.btnHueso);
        nombrePet = itemView.findViewById(R.id.nombrePet);
        rating = itemView.findViewById(R.id.rating);
        btnHueso2 = itemView.findViewById(R.id.btnHueso2);
    }

    public static void init(Mascota mascota) {
        imgPet.setImageResource((mascota.getFoto()));
        nombrePet.setText(mascota.getNombre());
        rating.setText(mascota.getRating());


    }
}
