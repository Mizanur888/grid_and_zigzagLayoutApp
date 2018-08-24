package com.example.rahmanm2.list_grid_zigzag_view.Data_Model;

import com.example.rahmanm2.list_grid_zigzag_view.R;

import java.util.ArrayList;

public class CatalogModel {
    private int ImageId;
    private String title;
    private String Discription;


    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return Discription;
    }

    public void setDiscription(String discription) {
        Discription = discription;
    }

    public static ArrayList<CatalogModel>GetData(){
        ArrayList<CatalogModel>dataList = new ArrayList<>();
        int []image = getImage();


        for(int i = 0;i<image.length;i++){
            CatalogModel catalogModel = new CatalogModel();
            catalogModel.setImageId(image[i]);
            catalogModel.setTitle("Catalog"+i);
            dataList.add(catalogModel);
        }
        return dataList;

    }
    public static int []getImage(){

        int []images = {
                R.drawable.thumb_1_0,R.drawable.thumb_1_1,R.drawable.thumb_1_2,R.drawable.thumb_1_3,
                R.drawable.thumb_1_4,R.drawable.thumb_1_5,R.drawable.thumb_1_6,R.drawable.thumb_1_7,
                R.drawable.thumb_1_8,R.drawable.thumb_1_9,R.drawable.thumb_2_0,R.drawable.thumb_2_1,
                R.drawable.thumb_2_2,R.drawable.thumb_2_3,R.drawable.thumb_2_4,R.drawable.thumb_2_5,
                R.drawable.thumb_2_6,R.drawable.thumb_2_7,R.drawable.thumb_2_8,R.drawable.thumb_2_9,
                R.drawable.thumb_3_0,R.drawable.thumb_3_2,R.drawable.thumb_3_2,R.drawable.thumb_3_3,
                R.drawable.thumb_3_4,R.drawable.thumb_3_5,R.drawable.thumb_3_6,R.drawable.thumb_3_7,
                R.drawable.thumb_3_8,R.drawable.thumb_3_9,R.drawable.thumb_4_0,R.drawable.thumb_4_1,
                R.drawable.thumb_4_2,R.drawable.thumb_4_3,R.drawable.thumb_4_4,R.drawable.thumb_4_5,
                R.drawable.thumb_4_6,R.drawable.thumb_4_7,R.drawable.thumb_4_8,R.drawable.thumb_4_9,

                R.drawable.thumb_5_0,R.drawable.thumb_5_1,
                R.drawable.thumb_5_2,R.drawable.thumb_5_3,R.drawable.thumb_5_4,R.drawable.thumb_5_5,
                R.drawable.thumb_5_6,R.drawable.thumb_5_7,R.drawable.thumb_5_8,R.drawable.thumb_5_9,

                R.drawable.thumb_6_0,R.drawable.thumb_6_1,
                R.drawable.thumb_6_2,R.drawable.thumb_6_3,R.drawable.thumb_6_4,R.drawable.thumb_6_5,
                R.drawable.thumb_6_6,R.drawable.thumb_6_7,R.drawable.thumb_6_8,R.drawable.thumb_6_9,
        };
        return images;
    }
}
