package com.brainybrains.kamservices;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;

import com.brainybrains.kamservices.adaptar.Adaptar;
import com.brainybrains.kamservices.pogs.comments;

import java.util.ArrayList;

public class Salonathome extends AppCompatActivity {

    private VideoView salonvideo;
    private MediaPlayer mMediaPlayer;
    int mCurrentVideoPosition;
    private RecyclerView coments;
    private comments comments;
    private ArrayList<comments> commentslist;
    private Adaptar adapter;
    private CardView forman,forkids,forsave,formassage,forcolor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salonathome);
        String haircutforMen = getIntent().getStringExtra("services");
        salonvideo=findViewById(R.id.salonvideo);
        forman=findViewById(R.id.forman);
        forkids=findViewById(R.id.forkidds);
        forsave=findViewById(R.id.forsave);
        formassage=findViewById(R.id.formassage);
        forcolor=findViewById(R.id.forcolor);

        oncliks();


        coments=findViewById(R.id.coments);
        videoplay(haircutforMen);






//------------------RecyclerView----------------//
        comments=new comments();
        commentslist=comments.allProduct();

        init();
    }

    private void oncliks() {
        forman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Salonathome.this, "Only Kids Hair cut  works in this demo app", Toast.LENGTH_SHORT).show();
            }
        });
        forkids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Salonathome.this, MainListRV.class);
               // String haircutforMen = "Haircut for Men";
               // intent.putExtra("services", haircutforMen);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            }
        });
        forsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Salonathome.this, "Only Kids Hair cut  works in this demo app", Toast.LENGTH_SHORT).show();
            }
        });
        formassage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Salonathome.this, "Only Kids Hair cut  works in this demo app", Toast.LENGTH_SHORT).show();
            }
        });
        forcolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Salonathome.this, "Only Kids Hair cut  works in this demo app", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void videoplay(String haircutforMen) {

        if (haircutforMen.equals("Haircut for Men")){
            String url="android.resource://com.brainybrains.kamservices/"+R.raw.salonathomevid;
            Uri uri=Uri.parse(url);
            salonvideo.setVideoURI(uri);
            salonvideo.start();

            salonvideo.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mMediaPlayer=mp;
                    mp.setLooping(true);
                    // We then seek to the current posistion if it has been set and play the video.
                    if (mCurrentVideoPosition != 0) {
                        mMediaPlayer.seekTo(mCurrentVideoPosition);
                        mMediaPlayer.start();
                    }
                }
            });
        }

    }

    private void init() {
        adapter = new Adaptar(this, commentslist);
        coments.setLayoutManager(new GridLayoutManager(this,1));
        coments .setAdapter(adapter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Capture the current video position and pause the video.
        mCurrentVideoPosition = mMediaPlayer.getCurrentPosition();
        salonvideo.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Restart the video when resuming the Activity
        salonvideo.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // When the Activity is destroyed, release our MediaPlayer and set it to null.
        mMediaPlayer.release();
        mMediaPlayer = null;
    }
}