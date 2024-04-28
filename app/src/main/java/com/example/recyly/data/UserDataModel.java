package com.example.recyly.data;
/**
 * Create Date: 2024/04/28
 *
 * @author Leemanhee
 *
 * 유저 데이터 모델
 * 유저의 이름, 나이가 들어갑니다.
 **/


public class UserDataModel {

    private String tvmember_info;

    private int tvmember_number;

    public UserDataModel(String tvmember_info, int tvmeber_number) {
        this.tvmember_info = tvmember_info;
        this.tvmember_number = tvmeber_number;
    }

    public String getTvmember_info() {
        return tvmember_info;
    }

    public void setTvmember_info(String tvmember_info) {
        this.tvmember_info = tvmember_info;
    }

    public int getTvmember_number() {
        return tvmember_number;
    }

    public void setTvmember_info(int tvmember_number) {
        this.tvmember_number = tvmember_number;
    }
}
