package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ProfileActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        recyclerView = findViewById(R.id.rv);
        MyListData[] myListData = new MyListData[]{
                new MyListData(R.drawable.pic_one),
                new MyListData(R.drawable.pic_two),
                new MyListData(R.drawable.pic_three),
                new MyListData(R.drawable.pic_four),
                new MyListData(R.drawable.pic_five),
                new MyListData(R.drawable.pic_six),
        };
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapter);
    }
}