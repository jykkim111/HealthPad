package com.example.diet.ui.analyze;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.diet.R;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    String data1[], data2[];
    int images[];
    Context context;

    public RecyclerAdapter(Context context, String s1[], String s2[], int images[]){
        this.context = context;
        this.data1 = s1;
        this.data2 = s2;
        this.images = images;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView text1, text2;
        ImageView foodImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.food_name);
            text2 = itemView.findViewById(R.id.food_description);
            foodImage = itemView.findViewById(R.id.food_icon);

        }
    }



    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_row, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {
        holder.text1.setText(data1[position]);
        holder.text2.setText(data2[position]);
        holder.foodImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }
}
