package com.example.recyly.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyly.R;
import com.example.recyly.data.UserDataModel;

public class UserListViewHolder extends RecyclerView.ViewHolder {

    ConstraintLayout constraintLayout;
    TextView member_info;
    TextView member_number;

    public UserListViewHolder(@NonNull View itemView) {
        super(itemView);
        constraintLayout = itemView.findViewById(R.id.ryparent);
        member_info = itemView.findViewById(R.id.tv_member);
        member_number = itemView.findViewById(R.id.tv_member_number);
    }

    public void onBind(UserDataModel userdatamodel) {
        member_info.setText("회원: "+userdatamodel);
        member_number.setText("번호:"+userdatamodel.getTvmember_number());
    }
}
