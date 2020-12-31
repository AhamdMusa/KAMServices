package com.brainybrains.kamservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.brainybrains.kamservices.pogs.UserData;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Address extends AppCompatActivity {

private String name, phone,address, houseNo;
private EditText nameet, phoneet,addresset, houseNoet;
private RelativeLayout confarm;
private String service;

    FirebaseDatabase rootNode ;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        final String service = getIntent().getStringExtra("service");
        nameet=findViewById(R.id.name);
        phoneet=findViewById(R.id.phoneno);
        addresset=findViewById(R.id.location);
        houseNoet=findViewById(R.id.houseno);
        confarm=findViewById(R.id.confarm);



        confarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode =FirebaseDatabase.getInstance();
                reference=rootNode.getReference("useres");

                name=nameet.getText().toString();
                phone=phoneet.getText().toString();
                address=addresset.getText().toString();
                houseNo=houseNoet.getText().toString();


                UserData userData=new UserData(name,phone,address,houseNo,service);
                reference.child(phone).setValue(userData);
                Intent intent=new Intent(Address.this,MainActivity2.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);



            }
        });
    }
}