package com.alameen.dell.ertugrul01;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    TextView life_tv, wars_tv, empire_tv, about_us_tv;
    private AdView myAdView;
    private InterstitialAd mInterstitialAd;
    public static int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-6081186777692750~2380503603");

        myAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        myAdView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-6081186777692750/2857718581");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                AdRequest adRequest = new AdRequest.Builder().build();
                mInterstitialAd.loadAd(adRequest);
            }
        });

        life_tv = (TextView)findViewById(R.id.life_tv);
        wars_tv = (TextView)findViewById(R.id.wars_tv);
        empire_tv = (TextView)findViewById(R.id.empire_tv);
        about_us_tv = (TextView)findViewById(R.id.about_us_tv);

        life_fragment newFragment = new life_fragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack so the user can navigate back
        transaction.replace(R.id.main_fragment_area, newFragment);
        transaction.addToBackStack(null);
        // Commit the transaction
        transaction.commit();


        life_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.main_fragment_area, new life_fragment());
                fragmentTransaction.commit();
                */
                if(counter<=5){
                    counter++;
                }else{
                    counter=0;
                    // show add here
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
                }


                life_fragment newFragment = new life_fragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack so the user can navigate back
                transaction.replace(R.id.main_fragment_area, newFragment);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();


            }
        });

        wars_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            /*
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.main_fragment_area, new wars_fragment());
                fragmentTransaction.commit();
            */
                if(counter<=5){
                    counter++;
                }else{
                    counter=0;
                    // show add here
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
                }


                wars_fragment newFragment = new wars_fragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack so the user can navigate back
                transaction.replace(R.id.main_fragment_area, newFragment);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();


            }
        });

        empire_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.main_fragment_area, new empire_fragment());
                fragmentTransaction.commit();
                */
                if(counter<=5){
                    counter++;
                }else{
                    counter=0;
                    // show add here
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
                }


                empire_fragment newFragment = new empire_fragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack so the user can navigate back
                transaction.replace(R.id.main_fragment_area, newFragment);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();


            }
        });

        about_us_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.main_fragment_area, new empire_fragment());
                fragmentTransaction.commit();
                */

                if(counter<=5){
                    counter++;
                }else{
                    counter=0;
                    // show add here
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
                }

                AboutUsFragment newFragment = new AboutUsFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack so the user can navigate back
                transaction.replace(R.id.main_fragment_area, newFragment);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });
    }
}


