package comjosim74.github.childeducation;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class BanglaActivity extends AppCompatActivity {

Button sorborno, benjonborno, bwmaking, bsbfind, likhi, kheli, cora;
    MediaPlayer mp;
    Typeface adorsolipi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla);

        Toast.makeText(this, "Work In progress also sounds will be added very soon for all content", Toast.LENGTH_LONG).show();

        final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.translate_anim);

// Sorborno button start ................
        sorborno = (Button) findViewById(R.id.sorborno);
        adorsolipi = Typeface.createFromAsset(getAssets(),"font/alipi.ttf");
        sorborno.setText("স্বরবর্ণ ");
        sorborno.setTypeface(adorsolipi);

        sorborno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(BanglaActivity.this, R.raw.soundbanglabutton1);
                mp.start();
                sorborno.startAnimation(animTranslate);
                Intent i = new Intent(BanglaActivity.this, SorbornoActivity.class);
                startActivity(i);
            }
        });
// Sorborno button end ................

// benjonborno button start ................
        benjonborno = (Button) findViewById(R.id.benjonborno);
        adorsolipi = Typeface.createFromAsset(getAssets(),"font/alipi.ttf");
        benjonborno.setText("ব্যঞ্জনবর্ণ ");
        benjonborno.setTypeface(adorsolipi);

        benjonborno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(BanglaActivity.this, R.raw.soundbanglabutton2);
                mp.start();
                benjonborno.startAnimation(animTranslate);
                Intent i = new Intent(BanglaActivity.this, BenjonbornoActivity.class);
                startActivity(i);
            }
        });
// benjonborno button end ................

// bwmaking button start ................
        bwmaking = (Button) findViewById(R.id.bwmaking);
        adorsolipi = Typeface.createFromAsset(getAssets(),"font/alipi.ttf");
        bwmaking.setText("বর্ণ দিয়ে শব্দ তৈরী");
        bwmaking.setTypeface(adorsolipi);

        bwmaking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(BanglaActivity.this, R.raw.soundbanglabutton3);
                mp.start();
                bwmaking.startAnimation(animTranslate);
                Intent i = new Intent(BanglaActivity.this, SBsliderActivity.class);
                startActivity(i);
            }
        });
// bwmaking button end ................

// bsbfind button start ................
        bsbfind = (Button) findViewById(R.id.bsbfind);
        adorsolipi = Typeface.createFromAsset(getAssets(),"font/alipi.ttf");
        bsbfind.setText("শুনে শুনে বর্ণ বাছাই");
        bsbfind.setTypeface(adorsolipi);

        bsbfind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mp = MediaPlayer.create(BanglaActivity.this, R.raw.beep);
                //mp.start();
                bsbfind.startAnimation(animTranslate);
                Toast.makeText(BanglaActivity.this, "Work in progress", Toast.LENGTH_SHORT).show();
                //Intent i = new Intent(BanglaActivity.this, BanglaActivity.class);
                //startActivity(i);
            }
        });
// bsbfind button end ................


// likhi button start ................
        likhi = (Button) findViewById(R.id.likhi);
        adorsolipi = Typeface.createFromAsset(getAssets(),"font/alipi.ttf");
        likhi.setText("সংখ্যা পরিচিতি");
        likhi.setTypeface(adorsolipi);

        likhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(BanglaActivity.this, R.raw.soundbanglabutton5);
                mp.start();
                likhi.startAnimation(animTranslate);
                Intent i = new Intent(BanglaActivity.this, SongkhaActivity.class);
                startActivity(i);
            }
        });
// likhi button end ................


// kheli button start ................
        kheli = (Button) findViewById(R.id.kheli);
        adorsolipi = Typeface.createFromAsset(getAssets(),"font/alipi.ttf");
        kheli.setText("চলো লিখি");
        kheli.setTypeface(adorsolipi);

        kheli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(BanglaActivity.this, R.raw.soundbanglabutton6);
                mp.start();
                kheli.startAnimation(animTranslate);
                Toast.makeText(BanglaActivity.this, "Work in progress", Toast.LENGTH_SHORT).show();
                //Intent i = new Intent(BanglaActivity.this, BanglaActivity.class);
                //startActivity(i);
            }
        });
// kheli button end ................


// cora button start ................
        cora = (Button) findViewById(R.id.cora);
        adorsolipi = Typeface.createFromAsset(getAssets(),"font/alipi.ttf");
        cora.setText("ছড়া");
        cora.setTypeface(adorsolipi);

        cora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(BanglaActivity.this, R.raw.soundbanglabutton7);
                mp.start();
                cora.startAnimation(animTranslate);
                Intent i = new Intent(BanglaActivity.this, KobitaActivity.class);
                startActivity(i);
            }
        });
// cora button end ................

    }




    //Full immersing..........
    @Override
    public void onWindowFocusChanged(boolean hasFocal){
        super.onWindowFocusChanged(hasFocal);
        View decorView = getWindow().getDecorView();
        if(hasFocal){
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        }
    }

}
