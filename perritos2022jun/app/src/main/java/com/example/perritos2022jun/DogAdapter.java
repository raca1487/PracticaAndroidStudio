package com.example.perritos2022jun;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DogAdapter extends RecyclerView.Adapter<DogAdapter.DogViewHolder> {

    private List<Dog> items;

    public static class DogViewHolder extends RecyclerView.ViewHolder {
        public ImageView imagen;
        public TextView nombre;
        public TextView visitas;

        public DogViewHolder(View v){
            super(v);
            imagen = (ImageView) v.findViewById(R.id.imageView2);
            nombre = (TextView) v.findViewById(R.id.nombre);
            visitas = (TextView) v.findViewById(R.id.visitas);
        }
    }

    public DogAdapter(List<Dog> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public DogAdapter.DogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.dog_card, parent, false);

        return new DogViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DogAdapter.DogViewHolder holder, int position) {
        holder.imagen.setImageResource(items.get(position).getImagen());
        holder.nombre.setText(items.get(position).getNombre());
        holder.visitas.setText("Visitas: " + items.get(position).getVisitas());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
