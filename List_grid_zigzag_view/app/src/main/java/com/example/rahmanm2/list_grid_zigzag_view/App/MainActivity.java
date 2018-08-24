package com.example.rahmanm2.list_grid_zigzag_view.App;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toolbar;

import com.example.rahmanm2.list_grid_zigzag_view.Adapter.RecyclerAdapter;
import com.example.rahmanm2.list_grid_zigzag_view.Data_Model.CatalogModel;
import com.example.rahmanm2.list_grid_zigzag_view.R;

public class MainActivity extends AppCompatActivity {
    android.support.v7.widget.Toolbar mtoolbar;
    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpTools();
    mButton.setText("Click Me");
    mButton.setPadding(0,5,0,0);

    //put menu inside toolbar
        mtoolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.toolbar);
        mtoolbar.setTitle("Home Page");

        mtoolbar.inflateMenu(R.menu.menu);


    }

    public void setUpTools(){
        //init lize data to the adapter
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycleview_ID);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(this, CatalogModel.GetData());
        recyclerView.setAdapter(recyclerAdapter);

        //that will set view to display
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }



}
