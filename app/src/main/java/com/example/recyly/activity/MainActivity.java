package com.example.recyly.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyly.R;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = findViewById(R.id.rv_main);
        recyclerView = findViewById(R.id.RecyParent);






    }
}