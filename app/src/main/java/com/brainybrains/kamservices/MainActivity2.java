package com.brainybrains.kamservices;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private LinearLayout salonathomeman,disinfaction,aprepair,painting,plumber,carpenter,electrical,pastcontrol,yoga,renovation,startup;
    private CardView salonathome;
    private CardView offerCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        idCall();


        salonathome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Only Haircut for Men works in this demo app", Toast.LENGTH_SHORT).show();
            }
        });



        salonathomeman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Salonathome.class);
                String haircutforMen = "Haircut for Men";
                intent.putExtra("services", haircutforMen);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            }
        });


        disinfaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Only Haircut for Men works in this demo app", Toast.LENGTH_SHORT).show();
            }
        });


        aprepair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Only Haircut for Men works in this demo app", Toast.LENGTH_SHORT).show();
            }
        });

        painting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Only Haircut for Men works in this demo app", Toast.LENGTH_SHORT).show();
            }
        });

        plumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Only Haircut for Men works in this demo app", Toast.LENGTH_SHORT).show();
            }
        });

        carpenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Only Haircut for Men works in this demo app", Toast.LENGTH_SHORT).show();
            }
        });

        electrical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Only Haircut for Men works in this demo app", Toast.LENGTH_SHORT).show();
            }
        });

        pastcontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Only Haircut for Men works in this demo app", Toast.LENGTH_SHORT).show();
            }
        });

        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Only Haircut for Men works in this demo app", Toast.LENGTH_SHORT).show();
            }
        });

        renovation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Only Haircut for Men works in this demo app", Toast.LENGTH_SHORT).show();
            }
        });

        startup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Only Haircut for Men works in this demo app", Toast.LENGTH_SHORT).show();

            }
        });

        offerCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Only Haircut for Men works in this demo app", Toast.LENGTH_SHORT).show();
            }
        });




    }



    private void idCall() {
        salonathome=findViewById(R.id.salonathome);
        salonathomeman=findViewById(R.id.salonathomeman);
        disinfaction=findViewById(R.id.disinfaction);
        aprepair=findViewById(R.id.aprepair);
        painting=findViewById(R.id.painting);
        plumber=findViewById(R.id.plumber);
        carpenter=findViewById(R.id.carpenter);
        electrical=findViewById(R.id.electrical);
        pastcontrol=findViewById(R.id.pastcontrol);
        yoga=findViewById(R.id.yoga);
        renovation=findViewById(R.id.renovation);
        startup=findViewById(R.id.startup);
        offerCard=findViewById(R.id.offerCard);
    }


}