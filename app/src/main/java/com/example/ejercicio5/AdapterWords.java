package com.example.ejercicio5;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejercicio5.databinding.ItemBinding;
import com.example.ejercicio5.databinding.ItemBinding;

import java.util.List;


public class AdapterWords extends RecyclerView.Adapter <AdapterWords.ViewHolder>{
    private List<String>words;
    @NonNull
    @Override
    public AdapterWords.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding=ItemBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new ViewHolder(binding.getRoot());


    }

    @Override
    public void onBindViewHolder(@NonNull AdapterWords.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return words.size();
    }

    public void setDat(List<String> data) {
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


}
