package com.example.ejercicio5;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import java.util.List;
import com.example.ejercicio5.databinding.ItemBinding;

public class AdapterWords extends RecyclerView.Adapter <AdapterWords.ViewHolder>{
    private List<String> words;
    @NonNull
    @Override
    public AdapterWords.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterWords.ViewHolder holder, int position) {
        String item = words.get(position);
        holder.showInformation(item);
    }

    @Override
    public int getItemCount() {

        return words.size();
    }

    public void setData(List<String> data) {
        this.words = data;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemBinding itemBinding;
        public ViewHolder(@NonNull ItemBinding binding) {
            super(binding.getRoot());
            itemBinding = binding;
        }
        public void showInformation(String words){
            itemBinding.textView.setText(words);
        }
    }
}