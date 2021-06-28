package com.example.doconphone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class doctorlistActivity extends AppCompatActivity {
    RecyclerView doctorlist;
    List<String> tittles;
    List<Integer> imagaes;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorlist);

        doctorlist = findViewById(R.id.doctorlist);

        tittles = new ArrayList<>();
        imagaes = new ArrayList<>();

        tittles.add("Dr.Rishe");
        tittles.add("Dr.Sunita");
        tittles.add("Dr.Piyush");
        tittles.add("Dr.Ashish");
        tittles.add("Dr.Nilam");
        tittles.add("Dr.Ravi");
        tittles.add("Dr.Shiva");
        tittles.add("Dr.Nirma");
        tittles.add("Dr.Nav");
        tittles.add("Dr.Alka");
        tittles.add("Dr.Nitesh");
        tittles.add("Dr.Yogesh");
        tittles.add("Dr.Sweta");
        tittles.add("Dr.Shishir");


        imagaes.add(R.drawable.image1);
        imagaes.add(R.drawable.image1);
        imagaes.add(R.drawable.image1);
        imagaes.add(R.drawable.image1);
        imagaes.add(R.drawable.image1);
        imagaes.add(R.drawable.image1);
        imagaes.add(R.drawable.image1);
        imagaes.add(R.drawable.image1);
        imagaes.add(R.drawable.image1);
        imagaes.add(R.drawable.image1);
        imagaes.add(R.drawable.image1);
        imagaes.add(R.drawable.image1);
        imagaes.add(R.drawable.image1);
        imagaes.add(R.drawable.image1);

        adapter = new Adapter(this,tittles,imagaes);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        doctorlist.setLayoutManager(gridLayoutManager);
        doctorlist.setAdapter(adapter);



    }
}