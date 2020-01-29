package com.databindingtips;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.databindingtips.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainBinding.recyclerView.setHasFixedSize(true);
        Adapter adapter = new Adapter(this, prepareUser());
        mainBinding.recyclerView.setAdapter(adapter);
    }

    private List<User> prepareUser() {
        List<String> nameList = new ArrayList<>();
        nameList.add("Azhar");
        nameList.add("Anwar");
        nameList.add("Anis");
        List<String> emailList = new ArrayList<>();
        emailList.add("azad@gmail.com");
        emailList.add("anwar@gmail.com");
        emailList.add("anis@gmail.com");
        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.me);
        imageList.add(R.drawable.azhar);
        imageList.add(R.drawable.habib);
        List<User> userList = new ArrayList<>();
        int count = 0;
        for (String name : nameList
        ) {
            userList.add(new User(name, emailList.get(count), imageList.get(count)));
            count++;
        }
        return userList;
    }
}
