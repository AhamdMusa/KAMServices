package com.brainybrains.kamservices.adaptar;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.brainybrains.kamservices.Address;
import com.brainybrains.kamservices.MainListRV;
import com.brainybrains.kamservices.R;
import com.brainybrains.kamservices.Salonathome;
import com.brainybrains.kamservices.pogs.MenuList;

import java.util.ArrayList;

public class mainlistAdaptor extends RecyclerView.Adapter<mainlistAdaptor.ViewHolder> {
    Context context;
    ArrayList<MenuList> menuList;
    String titelText;

    public mainlistAdaptor(Context context, ArrayList<MenuList> menuList) {
        this.context = context;
        this.menuList = menuList;
    }

    @NonNull
    @Override
    public mainlistAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.listmenu,parent,false);


        return new mainlistAdaptor.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mainlistAdaptor.ViewHolder holder, int position) {


        MenuList menu=menuList.get(position);
        if(menu.getTitel()!=null){

            holder.titel.setText(menu.getTitel());
            titelText=holder.titel.getText().toString();
        }

        if(menu.getFirstDitels()!=null){
            holder.firstDitels.setText(menu.getFirstDitels());}

        if(menu.getSecondDitels()!=null){
            holder.secondDitels.setText(menu.getSecondDitels());

        }if(menu.getThiredDitels()!=null){
            holder.thiredDitels.setText(menu.getThiredDitels());}

        if(menu.getPrice()!=null){
            holder.price.setText(menu.getPrice());}

        holder.image.setImageResource(menu.getImage());

        holder.next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, Address.class);
                intent.putExtra("service", titelText);
                context.startActivity(intent);


            }
        });


    }



    @Override
    public int getItemCount() {
        return menuList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView titel, firstDitels,secondDitels,thiredDitels,price;
        public ImageView image,next;
        public Context context;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            titel = itemView.findViewById(R.id.lestitemtitle);
            firstDitels = itemView.findViewById(R.id.firstditels);
            secondDitels = itemView.findViewById(R.id.seconddetels);
            thiredDitels = itemView.findViewById(R.id.threddetels);
            price = itemView.findViewById(R.id.price);
            image = itemView.findViewById(R.id.cardicon);
            next = itemView.findViewById(R.id.next);
        }
    }
}
