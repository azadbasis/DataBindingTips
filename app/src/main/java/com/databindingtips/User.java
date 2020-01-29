package com.databindingtips;

import android.databinding.BindingAdapter;
import android.support.v4.content.ContextCompat;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class User {
    public String name,email;
    public int image;

    public User(String name, String email, int image) {
        this.name = name;
        this.email = email;
        this.image = image;
    }

    @BindingAdapter("android:imageUrl")
    public static void loadImage(View view,int imageId){
        CircleImageView circleImageView=(CircleImageView)view;
        circleImageView.setImageDrawable(ContextCompat.getDrawable(view.getContext(),imageId));
    }
}
