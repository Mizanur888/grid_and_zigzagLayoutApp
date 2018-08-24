package com.example.rahmanm2.list_grid_zigzag_view.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rahmanm2.list_grid_zigzag_view.Data_Model.Animals;
import com.example.rahmanm2.list_grid_zigzag_view.R;

import java.util.List;

public class diffrentViewAdapter extends RecyclerView.Adapter<diffrentViewAdapter.myViewHolder> {
private static final String TAG = diffrentViewAdapter.class.getSimpleName();
    private List<Animals>mAnimalsList;
    LayoutInflater mLayoutInflater;

    public diffrentViewAdapter(Context context, List<Animals>animalsList){
        this.mAnimalsList = animalsList;
        this.mLayoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.different_view, parent,false);
        myViewHolder viewHolder = new myViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        Animals currentObj = mAnimalsList.get(position);
        holder.setData(currentObj);
    }

    @Override
    public int getItemCount() {
        return mAnimalsList.size();
    }


    class myViewHolder extends RecyclerView.ViewHolder{

        ImageView mImageView;
        TextView mTextView;
        public myViewHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView)itemView.findViewById(R.id.image_ID_differentView);
            mTextView = (TextView)itemView.findViewById(R.id.text_ID_differentview);
        }

        public void setData(Animals animals){
            this.mTextView.setText(animals.getTitle());
            this.mImageView.setImageResource(animals.getID());
        }
    }
}
