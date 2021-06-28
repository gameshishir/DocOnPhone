package com.example.doconphone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MedicinepannelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicinepannel);
        RecyclerView medicineList = findViewById(R.id.medicinelist);
        medicineList.setLayoutManager(new LinearLayoutManager(this));
        String[] medicineNames = { "Abacavir for disease name","Acyclovi for disease name","Omeprazole for disease name","Alemtuzumab for disease name","Abacavir for disease name","Acyclovi for disease name","Omeprazole for disease name","Alemtuzumab for disease name",
                "Abacavir for disease name","Acyclovi for disease name","Omeprazole for disease name","Alemtuzumab for disease name"};
        medicineList.setAdapter(new medicineAdapter(medicineNames));
    }
}