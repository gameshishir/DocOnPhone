package com.example.doconphone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class medicineAdapter extends RecyclerView.Adapter<medicineAdapter.medicineViewHolder> {


    private String[] data;
    public medicineAdapter(String[] data){

        this.data = data;
    }
    @NonNull
    @Override
    public medicineViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout,parent,false);
        return new medicineViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull medicineViewHolder holder, int position) {
        String title = data[position];
        holder.txttitle.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class medicineViewHolder extends RecyclerView.ViewHolder{
        ImageView imgicon;
        TextView txttitle;
        public medicineViewHolder(@NonNull View itemView) {
            super(itemView);
            imgicon = itemView.findViewById(R.id.imgitem);
            txttitle = itemView.findViewById(R.id.txttitle);
        }
    }
}
