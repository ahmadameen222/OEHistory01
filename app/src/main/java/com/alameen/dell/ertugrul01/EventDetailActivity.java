package com.alameen.dell.ertugrul01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.alameen.dell.ertugrul01.R;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;

import java.util.ArrayList;

import static com.alameen.dell.ertugrul01.MainActivity.mPublisherInterstitialAd;

public class EventDetailActivity extends AppCompatActivity {

    private ImageView img_main, img_main1;
    private TextView text_main, head_text_main;
    private Bundle extras;
    private String title;

    public AdView myAdView;

    //    public InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);

        //MobileAds.initialize(this, "ca-app-pub-6081186777692750~2380503603");

        myAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        myAdView.loadAd(adRequest);


        mPublisherInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
            }

        });

//        mInterstitialAd = new InterstitialAd(this);
//        mInterstitialAd.setAdUnitId("ca-app-pub-6081186777692750/2857718581");
//        mInterstitialAd.loadAd(new AdRequest.Builder().build());



 /*       mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                AdRequest adRequest = new AdRequest.Builder().build();
                mInterstitialAd.loadAd(adRequest);
            }
        });
*/

        img_main = (ImageView) findViewById(R.id.img_main);
        img_main1 = (ImageView) findViewById(R.id.img_main1);
        text_main = (TextView) findViewById(R.id.text_main);
        head_text_main = (TextView) findViewById(R.id.head_text_main);


        extras = getIntent().getExtras();
        title = extras.getString("topic");


        if (title.equals("Early Life:")) {


/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

            }
*/

            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.ertugrul1);
            img_main1.setImageResource(R.drawable.ertugrul2);
            text_main.setText(R.string.life_intro);

        } else if (title.equals("Family:")) {

/*

            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/

            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.ertugrul3);
            img_main1.setImageResource(R.drawable.t1);
            text_main.setText(R.string.family);
        } else if (title.equals("Who Were Ogouz Turks?")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.oghuz);
            img_main1.setImageResource(R.drawable.t8);
            text_main.setText(R.string.Oghuz_turks);
        } else if (title.equals("Who Were Kayis?")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.kayi);
            img_main1.setImageResource(R.drawable.t5);
            text_main.setText(R.string.Kayi_tribe);
        } else if (title.equals("Death:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.tomb2);
            img_main1.setImageResource(R.drawable.tomb);
            text_main.setText(R.string.life_death);
        } else if (title.equals("Legacy:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.ottomans1);
            img_main1.setImageResource(R.drawable.tomb1);
            text_main.setText(R.string.Legacy);
        }

        //wars

        else if (title.equals("Mongol Wars:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.mongol1);
            img_main1.setImageResource(R.drawable.t21);
            text_main.setText(R.string.mongol_wars);
        } else if (title.equals("Suljuks-Mongol Wars:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.mongol);
            img_main1.setImageResource(R.drawable.t14);
            text_main.setText(R.string.sulj_mongol_wars);
        } else if (title.equals("Turk Wars with Mongols:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.t14);
            img_main1.setImageResource(R.drawable.t27);
            text_main.setText(R.string.turk_wars);
        } else if (title.equals("The Final Battle:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.mongol2);
            img_main1.setImageResource(R.drawable.mamluk);
            text_main.setText(R.string.final_battle);
        } else if (title.equals("The Fall of Suljuks:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.empire);
            img_main1.setImageResource(R.drawable.mongol);
            text_main.setText(R.string.selj_fall);
        } else if (title.equals("War & Defeat of Mongols:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.mamluk);
            img_main1.setImageResource(R.drawable.empire);
            text_main.setText(R.string.defeat_mongol);
        } else if (title.equals("Fall of Byzantine Empire:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.fall2);
            img_main1.setImageResource(R.drawable.fall);
            text_main.setText(R.string.fall_byzentine);
        }

        //Empire

        else if (title.equals("The Oguz Turks State:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.oghuz1);
            img_main1.setImageResource(R.drawable.t6);
            text_main.setText(R.string.Oghuz_turks);
        } else if (title.equals("The Great Seljuk Sultanate of Rum:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.suljukempire);
            img_main1.setImageResource(R.drawable.s);
            text_main.setText(R.string.sulj_emp);
        } else if (title.equals("Sogut:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.t5);
            img_main1.setImageResource(R.drawable.t25);
            text_main.setText(R.string.Legacy);
        } else if (title.equals("Rise of Osmanlis:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.osman);
            img_main1.setImageResource(R.drawable.ottomans2);
            text_main.setText(R.string.osmanis);
        } else if (title.equals("Rise of Ottomans:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.ottoman);
            img_main1.setImageResource(R.drawable.ottomans3);
            text_main.setText(R.string.ottoman);
        } else if (title.equals("Fall of Byzantine Empire:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.fall1);
            img_main1.setImageResource(R.drawable.fall3);
            text_main.setText(R.string.fall_byzentine);
        }

        //Chars

        else if (title.equals("Suliman Shah:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.t27);
            text_main.setText(R.string.life_intro);
        } else if (title.equals("Osman-I:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.osman);
            text_main.setText(R.string.osman);
        } else if (title.equals("Halime Sultan:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.mosque8);
            text_main.setText(R.string.halime);
        } else if (title.equals("Hayme Mother:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.mosque8);
            text_main.setText(R.string.hyme);
        } else if (title.equals("Turgut Bay:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.mosque8);
            text_main.setText(R.string.turgut);
        } else if (title.equals("Bsmsi Alp:")) {

/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
*/
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.mosque8);
            text_main.setText(R.string.bamsi);
        } else if (title.equals("Ibn-ul-Arabi:")) {

            /*if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
            */
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.mosque8);
            text_main.setText(R.string.ibn_arabi);
        } else if (title.equals("Artuk Bay:")) {

          /*  if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
          */
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.mosque8);
            text_main.setText(R.string.artuk);
        } else if (title.equals("Sultan Alā ad–Dīn Kayqubād bin Kaykāvūs:")) {

        /*    if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        */
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.sultanaladin);
            text_main.setText(R.string.sultan);
        } else if (title.equals("Ayyubids:")) {

      /*      if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
      */
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.mosque8);
            text_main.setText(R.string.aziz);
        } else if (title.equals("Emir Al-Aziz of Aleppo:")) {

    /*        if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
    */
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.mosque8);
            text_main.setText(R.string.aziz);
        } else if (title.equals("Saddetin Kopek:")) {

  /*          if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
  */
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.mosque8);
            text_main.setText(R.string.kopek);
        } else if (title.equals("Gundogdu & Sungurtekin - Brothers:")) {
/*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
  */
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.mosque8);
            text_main.setText(R.string.ert_brothers);
        } else if (title.equals("Dundar Bey:")) {

            MainActivity.ShowAd();

            /*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
          */

            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.mosque8);
            text_main.setText(R.string.dundar);
        } else if (title.equals("Baycu Noyan:")) {

            /*
            if (counter <= 3) {
                counter++;
            } else {
                counter = 0;
                // show add here
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        */
            head_text_main.setText(extras.getString("topic"));
            img_main.setImageResource(R.drawable.mosque8);
            text_main.setText(R.string.noyan);
        }


    }


    //@Override
/*
    public void onBackPressed() {
        //your code when back button pressed
        if (mPublisherInterstitialAd.isLoaded()) {
            mPublisherInterstitialAd.show();
            mPublisherInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    super.onAdClosed();
                    finish();
                }
            });
        }else{
            super.onBackPressed();
        }
    }
*/
}
