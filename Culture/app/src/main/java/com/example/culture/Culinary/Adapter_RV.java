package com.example.culture.Culinary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.culture.R;

import java.util.ArrayList;

public class Adapter_RV extends RecyclerView.Adapter<Adapter_RV.dataObjectHolder> {
    private Context context;
    private ArrayList<Data_Culinary> listdata;

    public Adapter_RV(Context context, ArrayList<Data_Culinary> listdata) {
        this.context = context;
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public dataObjectHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.card_prehistoric,parent,false);
        return new dataObjectHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final dataObjectHolder holder, int position) {
        holder.txt.setText(listdata.get(position).getNo());

        Glide.with(context).load(listdata.get(position).getImg()).into(holder.img);

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Posisi "+
                holder.getAdapterPosition(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class dataObjectHolder extends RecyclerView.ViewHolder{
        private ImageView img;
        private TextView txt;

        public dataObjectHolder(View itemView) {
            super(itemView);
            this.img=itemView.findViewById(R.id.imageView);
            this.txt=itemView.findViewById(R.id.tv_namaTempat);;

        }
    }
}
