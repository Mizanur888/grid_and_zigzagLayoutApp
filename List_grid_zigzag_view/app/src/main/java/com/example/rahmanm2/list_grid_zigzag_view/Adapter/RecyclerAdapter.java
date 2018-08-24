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

import com.example.rahmanm2.list_grid_zigzag_view.Data_Model.CatalogModel;
import com.example.rahmanm2.list_grid_zigzag_view.R;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.myViewHolder> {

    private static final String TAG = RecyclerAdapter.class.getSimpleName();

    private List<CatalogModel> mCatalogModel;
    LayoutInflater mLayoutInflater;

    //constructor
    public RecyclerAdapter(Context context, List<CatalogModel>mCatalogModel){
        this.mCatalogModel = mCatalogModel;
        this.mLayoutInflater = LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG,"onCreateViewHolder");
        View view =mLayoutInflater.inflate(R.layout.list_item_view,parent,false);
        myViewHolder viewHolder = new myViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        Log.d(TAG,"onBindViewHolder"+position);
        CatalogModel currentobj = mCatalogModel.get(position);
        holder.SetupData(currentobj, position);
    }

    @Override
    public int getItemCount() {
        return mCatalogModel.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder{

        ImageView mAddImage, mDeleteImage, mCopyImage;
        TextView mTitleView, mDiscreptionView;
        int postion;
        CatalogModel current;
        public myViewHolder(View itemView) {
            super(itemView);
            //get id
            mTitleView = (TextView)itemView.findViewById(R.id.Tv_titleId);
            mAddImage = (ImageView)itemView.findViewById(R.id.image_row);
            mDeleteImage = (ImageView)itemView.findViewById(R.id.Image_row_deleteID);
            mCopyImage = (ImageView)itemView.findViewById(R.id.Image_row_CopyID);

        }
        public void SetupData(CatalogModel current, int position){
            //set value to the id
            mTitleView.setText(current.getTitle());
            mAddImage.setImageResource(current.getImageId());
            this.postion = position;
            this.current = current;
        }
    }
}
