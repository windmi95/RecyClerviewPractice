package com.example.recyly.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyly.R;
import com.example.recyly.viewholder.UserListViewHolder;
import com.example.recyly.data.UserDataModel;

import java.util.ArrayList;

/**
 * Create Date: 2024/04/28
 *
 * @author Leemanhee
 *
 * 유저 리스트용 리사이클러뷰 어댑터입니다.
 * \
 **/
public class RecyClerViewAdapter extends RecyclerView.Adapter<UserListViewHolder> {

    private ArrayList<UserDataModel> userDataModelList;

    @NonNull
    @Override
    public UserListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.user_info,
                parent,
                false
        );
        return new UserListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserListViewHolder holder, int position) {
        holder.onBind(userDataModelList.get(position));
    }

    @Override
    public int getItemCount() {
        return userDataModelList.size();
    }

    public void setUserDataModelList(ArrayList<UserDataModel> userDataModelList) {
        this.userDataModelList = userDataModelList;
        notifyDataSetChanged();
    }
}
