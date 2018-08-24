package com.example.rahmanm2.list_grid_zigzag_view.App;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.example.rahmanm2.list_grid_zigzag_view.Adapter.RecyclerAdapter;
import com.example.rahmanm2.list_grid_zigzag_view.Adapter.diffrentViewAdapter;
import com.example.rahmanm2.list_grid_zigzag_view.Data_Model.Animals;
import com.example.rahmanm2.list_grid_zigzag_view.R;


public class differentViewActivity extends AppCompatActivity  {

    Toolbar mToolbar;
    RecyclerView mRecyclerView;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_different_view);

        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        mToolbar.setTitle("Different View Page");

       // mToolbar.inflateMenu(R.menu.menu);
        //mToolbar.setOnMenuItemClickListener(this);
       // setUprecycleView();
    }
    public void setUprecycleView(){
        mRecyclerView = (RecyclerView)findViewById(R.id.differentViewID);
        diffrentViewAdapter adapter = new diffrentViewAdapter(this, Animals.GetData());
        mRecyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);
    }

   /* @Override
    public boolean onMenuItemClick(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.notification_icon_ID:
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
                linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
                mRecyclerView.setLayoutManager(linearLayoutManager);
        };
        return true;
    }*/


}
