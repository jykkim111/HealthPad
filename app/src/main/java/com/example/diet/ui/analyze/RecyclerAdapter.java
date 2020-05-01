package com.example.diet.ui.analyze;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.diet.R;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private OnItemClickListener mListener;
    private ArrayList<Item> foodList;

    public RecyclerAdapter(ArrayList<Item> list){
        this.foodList = list;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView text1, text2;
        ImageView foodImage;

        public MyViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            text1 = itemView.findViewById(R.id.food_name);
            text2 = itemView.findViewById(R.id.food_description);
            foodImage = itemView.findViewById(R.id.food_icon);

            itemView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onItemClick(position);
                        }
                    }
                }
            });

        }
    }



    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_row, parent,false);
        return new MyViewHolder(view, mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {
        Item currentItem = foodList.get(position);
        holder.text1.setText(currentItem.getFoodName());
        holder.text2.setText(currentItem.getFoodDescription());
        holder.foodImage.setImageResource(currentItem.getImageSrc());
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }


    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;

    }
}
