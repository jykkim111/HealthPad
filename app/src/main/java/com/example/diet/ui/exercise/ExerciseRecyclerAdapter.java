package com.example.diet.ui.exercise;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.diet.R;
import com.example.diet.ui.analyze.Item;

import java.util.ArrayList;

public class ExerciseRecyclerAdapter extends RecyclerView.Adapter<ExerciseRecyclerAdapter.MyViewHolder> {
    private OnItemClickListener mListener;
    private ArrayList<ExerciseActivity> activityList;

    public ExerciseRecyclerAdapter(ArrayList<ExerciseActivity> list){
        this.activityList = list;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView text1, text2;
        ImageView activityImage;

        public MyViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            text1 = itemView.findViewById(R.id.food_name);
            text2 = itemView.findViewById(R.id.food_description);
            activityImage = itemView.findViewById(R.id.food_icon);

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
    public ExerciseRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_row, parent,false);
        return new MyViewHolder(view, mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseRecyclerAdapter.MyViewHolder holder, int position) {
        ExerciseActivity currentItem = activityList.get(position);
        holder.text1.setText(currentItem.getActivityName());
        holder.text2.setText(currentItem.getActivityDescription());
        holder.activityImage.setImageResource(currentItem.getImageSrc());
    }

    @Override
    public int getItemCount() {
        return activityList.size();
    }


    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;

    }
}
