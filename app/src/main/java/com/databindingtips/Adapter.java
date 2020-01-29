package com.databindingtips;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.databindingtips.databinding.ItemLayoutBinding;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyHolder> {


    private Context context;
    private List<User> userList = new ArrayList<>();

    public Adapter(Context context, List<User> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemLayoutBinding layoutBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.item_layout, viewGroup, false);
        MyHolder holder = new MyHolder(layoutBinding);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        User user = userList.get(i);
        myHolder.itemLayoutBinding.setMUser(user);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder {
        ItemLayoutBinding itemLayoutBinding;

        public MyHolder(@NonNull ItemLayoutBinding itemView) {
            super(itemView.getRoot());
            itemLayoutBinding = itemView;

        }
    }
}
