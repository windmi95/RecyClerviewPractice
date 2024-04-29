package com.example.recyly.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyly.R;
import com.example.recyly.adapter.RecyClerViewAdapter;
import com.example.recyly.data.UserDataModel;
import com.example.recyly.viewholder.UserListViewHolder;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ConstraintLayout constraintLayout;

    RecyClerViewAdapter recyClerViewAdapter;

    UserListViewHolder userListViewHolder;

    ArrayList<UserDataModel> userDataModels;

    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = findViewById(R.id.RecyParent);
        recyclerView = findViewById(R.id.rv_main);

        recyClerViewAdapter = new RecyClerViewAdapter();
        userDataModels = new ArrayList<UserDataModel>();

        linearLayoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(recyClerViewAdapter);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);
        settingUserList();

        recyClerViewAdapter.setUserDataModelList(userDataModels);


    }

    private void settingUserList() {
        userDataModels.add(new UserDataModel("회원",1));
        userDataModels.add(new UserDataModel("회원",2));
        userDataModels.add(new UserDataModel("회원",3));
        userDataModels.add(new UserDataModel("회원",4));
        userDataModels.add(new UserDataModel("회원",5));
        userDataModels.add(new UserDataModel("회원",6));
        userDataModels.add(new UserDataModel("회원",7));
        userDataModels.add(new UserDataModel("회원",8));
        userDataModels.add(new UserDataModel("회원",9));
        userDataModels.add(new UserDataModel("회원",10));
        userDataModels.add(new UserDataModel("회원",11));
        userDataModels.add(new UserDataModel("회원",12));
        userDataModels.add(new UserDataModel("회원",13));
        userDataModels.add(new UserDataModel("회원",14));
        userDataModels.add(new UserDataModel("회원",15));
        userDataModels.add(new UserDataModel("회원",16));
        userDataModels.add(new UserDataModel("회원",17));
        userDataModels.add(new UserDataModel("회원",18));
        userDataModels.add(new UserDataModel("회원",19));
        userDataModels.add(new UserDataModel("회원",20));
    }
}