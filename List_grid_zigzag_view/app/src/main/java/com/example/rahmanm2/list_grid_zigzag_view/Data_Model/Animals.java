package com.example.rahmanm2.list_grid_zigzag_view.Data_Model;

import com.example.rahmanm2.list_grid_zigzag_view.R;

import java.util.ArrayList;

public class Animals {
    private int ID;
    private String title;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static ArrayList<Animals>GetData(){
        ArrayList<Animals>mData = new ArrayList<>();
        int[]image = getImage();

        for(int i = 0;i<image.length;i++){
            Animals animals = new Animals();
            animals.setID(image[i]);
            animals.setTitle("Animals"+i);
            mData.add(animals);
        }
        return mData;
    }
    public static int[]getImage(){
        int[]images = {
                R.drawable.ani_cat_five,R.drawable.ani_cat_four,R.drawable.ani_cat_one,
                R.drawable.ani_cat_seven,R.drawable.ani_cat_six,R.drawable.ani_cat_three,
                R.drawable.ani_cat_two,
                R.drawable.ani_deer_four,R.drawable.ani_deer_one,
                R.drawable.ani_deer_three,R.drawable.ani_deer_two,
                R.drawable.ani_dog_five,
                R.drawable.ani_dog_four,R.drawable.ani_dog_one,R.drawable.ani_dog_three,
                R.drawable.ani_dog_two,
                R.drawable.bird_parrot_eight,R.drawable.ani_cat_five,R.drawable.bird_parrot_four,
                R.drawable.bird_parrot_one,R.drawable.bird_parrot_seven,R.drawable.bird_parrot_six,
                R.drawable.bird_parrot_three,R.drawable.bird_parrot_two,
        };
        return images;
    }
}
