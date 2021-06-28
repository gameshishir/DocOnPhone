package com.example.doconphone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Home_Activity extends AppCompatActivity {

    private Button doctor,medicine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);

        doctor = findViewById(R.id.doctor);
        medicine = findViewById(R.id.medicine);

        doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doctorIntent = new Intent(Home_Activity.this,doctorlistActivity.class);
                startActivity(doctorIntent);

            }
        });
        medicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent medicineIntent = new Intent(Home_Activity.this,MedicinepannelActivity.class);
                startActivity(medicineIntent);
            }
        });


    }

}