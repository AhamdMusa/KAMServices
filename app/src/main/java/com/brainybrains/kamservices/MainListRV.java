package com.brainybrains.kamservices;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.brainybrains.kamservices.adaptar.mainlistAdaptor;
import com.brainybrains.kamservices.pogs.MenuList;

import java.util.ArrayList;

public class MainListRV extends AppCompatActivity {

    private CardView forman,forkids,forsave,formassage,forcolor;
    private RecyclerView menuListrv;
    private MenuList menuList;
    private ArrayList<MenuList> menuLists;
    private mainlistAdaptor mainlistAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_r_v);

        menuListrv=findViewById(R.id.menuList);
        forman=findViewById(R.id.forman);
        forkids=findViewById(R.id.forkidds);
        forsave=findViewById(R.id.forsave);
        formassage=findViewById(R.id.formassage);
        forcolor=findViewById(R.id.forcolor);

        menuList=new MenuList();
        menuLists=menuList.getItems();
        oncliks();
        init();
    }

    private void init() {
        mainlistAdaptor=new mainlistAdaptor(this,menuLists);
        menuListrv.setLayoutManager(new LinearLayoutManager(this));
        menuListrv.setAdapter(mainlistAdaptor);
    }

    private void oncliks() {
        forman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuListrv.setVisibility(View.INVISIBLE);
                forman.setCardBackgroundColor(Color.parseColor("#c7ecee"));
                forkids.setCardBackgroundColor(Color.parseColor("#ffffff"));
                forsave.setCardBackgroundColor(Color.parseColor("#ffffff"));
                formassage.setCardBackgroundColor(Color.parseColor("#ffffff"));
                forcolor.setCardBackgroundColor(Color.parseColor("#ffffff"));
                Toast.makeText(MainListRV.this, "Only Kids Hair cut  works in this demo app", Toast.LENGTH_SHORT).show();
            }
        });
        forkids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuListrv.setVisibility(View.VISIBLE);
                forkids.setCardBackgroundColor(Color.parseColor("#c7ecee"));
                forman.setCardBackgroundColor(Color.parseColor("#ffffff"));
                forsave.setCardBackgroundColor(Color.parseColor("#ffffff"));
                formassage.setCardBackgroundColor(Color.parseColor("#ffffff"));
                forcolor.setCardBackgroundColor(Color.parseColor("#ffffff"));
                init();

            }
        });
        forsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuListrv.setVisibility(View.INVISIBLE);
                forsave.setCardBackgroundColor(Color.parseColor("#c7ecee"));
                forkids.setCardBackgroundColor(Color.parseColor("#ffffff"));
                forman.setCardBackgroundColor(Color.parseColor("#ffffff"));
                formassage.setCardBackgroundColor(Color.parseColor("#ffffff"));
                forcolor.setCardBackgroundColor(Color.parseColor("#ffffff"));
                Toast.makeText(MainListRV.this, "Only Kids Hair cut  works in this demo app", Toast.LENGTH_SHORT).show();
            }
        });
        formassage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuListrv.setVisibility(View.INVISIBLE);
                formassage.setCardBackgroundColor(Color.parseColor("#c7ecee"));
                forkids.setCardBackgroundColor(Color.parseColor("#ffffff"));
                forsave.setCardBackgroundColor(Color.parseColor("#ffffff"));
                forman.setCardBackgroundColor(Color.parseColor("#ffffff"));
                forcolor.setCardBackgroundColor(Color.parseColor("#ffffff"));
                Toast.makeText(MainListRV.this, "Only Kids Hair cut  works in this demo app", Toast.LENGTH_SHORT).show();
            }
        });
        forcolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuListrv.setVisibility(View.INVISIBLE);
                forcolor.setCardBackgroundColor(Color.parseColor("#c7ecee"));
                forkids.setCardBackgroundColor(Color.parseColor("#ffffff"));
                forsave.setCardBackgroundColor(Color.parseColor("#ffffff"));
                formassage.setCardBackgroundColor(Color.parseColor("#ffffff"));
                forman.setCardBackgroundColor(Color.parseColor("#ffffff"));
                Toast.makeText(MainListRV.this, "Only Kids Hair cut  works in this demo app", Toast.LENGTH_SHORT).show();
            }
        });
    }


}