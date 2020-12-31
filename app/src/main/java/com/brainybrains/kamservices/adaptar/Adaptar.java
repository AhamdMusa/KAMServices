package com.brainybrains.kamservices.adaptar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.brainybrains.kamservices.R;
import com.brainybrains.kamservices.pogs.comments;

import java.util.ArrayList;

public class Adaptar extends RecyclerView.Adapter<Adaptar.ViewHolder> {

    private Context context;
    private ArrayList<comments> comments;

    public Adaptar(Context context, ArrayList<comments> products) {
        this.context = context;
        this.comments = products;
    }

    @NonNull
    @Override
    public Adaptar.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R
                .layout.commentcard,parent,false);

        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull Adaptar.ViewHolder holder, int position) {

        comments com=comments.get(position);
        holder.name.setText(com.getName());
        holder.comment.setText(com.getComments());
        holder.productImage.setImageResource(com.getImage());
    }

    @Override
    public int getItemCount() {
        return comments.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name, comment;
        private ImageView productImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.cardtitle);
            comment=itemView.findViewById(R.id.cardcomment);
            productImage=itemView.findViewById(R.id.cardicon);


        }
    }
}
