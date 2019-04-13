package com.alameen.dell.ertugrul01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;

/*
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
*/

public class MainActivity extends AppCompatActivity {

    TextView life_tv, wars_tv, empire_tv, companions_tv;
    public static int counter = 0;
    public static PublisherInterstitialAd mPublisherInterstitialAd;
    String tvText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MobileAds.initialize(this, "ca-app-pub-6081186777692750~2380503603");


//        mInterstitialAd = new InterstitialAd(this);
//        mInterstitialAd.setAdUnitId("ca-app-pub-6081186777692750/2857718581");
//        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        mPublisherInterstitialAd = new PublisherInterstitialAd(this);
        mPublisherInterstitialAd.setAdUnitId("/6499/example/interstitial");
        mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());

        mPublisherInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
            }

        });


        life_tv = (TextView) findViewById(R.id.life_tv);
        wars_tv = (TextView) findViewById(R.id.wars_tv);
        empire_tv = (TextView) findViewById(R.id.empire_tv);
        companions_tv = (TextView) findViewById(R.id.companions_tv);

        life_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter >= 3) {
                    MainActivity.ShowAd();
                    counter = 0;
                } else {
                    counter++;
                    Intent i = new Intent(MainActivity.this, EventsListActivity.class);
                    i.putExtra("name", "life_tv");
                    startActivity(i);
                    overridePendingTransition(R.anim.fade_in_animation, R.anim.fade_out_animation);
                }


                mPublisherInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdLoaded() {
                        // Code to be executed when an ad finishes loading.

                    }

                    @Override
                    public void onAdFailedToLoad(int errorCode) {
                        // Code to be executed when an ad request fails.
                    }

                    @Override
                    public void onAdOpened() {
                        // Code to be executed when the ad is displayed.
                    }

                    @Override
                    public void onAdClicked() {
                        // Code to be executed when the user clicks on an ad.
                    }

                    @Override
                    public void onAdLeftApplication() {
                        // Code to be executed when the user has left the app.
                    }

                    @Override
                    public void onAdClosed() {
                        // Code to be executed when the interstitial ad is closed.
                        counter++;
                        Intent i = new Intent(MainActivity.this, EventsListActivity.class);
                        i.putExtra("name", "life_tv");
                        startActivity(i);
                        overridePendingTransition(R.anim.fade_in_animation, R.anim.fade_out_animation);
                    }
                });


            }
        });

        wars_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter >= 3) {
                    MainActivity.ShowAd();
                    counter = 0;
                } else {
                    counter++;
                    Intent i = new Intent(MainActivity.this, EventsListActivity.class);
                    i.putExtra("name", "wars_tv");
                    startActivity(i);
                    overridePendingTransition(R.anim.fade_in_animation, R.anim.fade_out_animation);
                }


                mPublisherInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdLoaded() {
                        // Code to be executed when an ad finishes loading.

                    }

                    @Override
                    public void onAdFailedToLoad(int errorCode) {
                        // Code to be executed when an ad request fails.
                    }

                    @Override
                    public void onAdOpened() {
                        // Code to be executed when the ad is displayed.
                    }

                    @Override
                    public void onAdClicked() {
                        // Code to be executed when the user clicks on an ad.
                    }

                    @Override
                    public void onAdLeftApplication() {
                        // Code to be executed when the user has left the app.
                    }

                    @Override
                    public void onAdClosed() {
                        // Code to be executed when the interstitial ad is closed.
                        counter++;
                        Intent i = new Intent(MainActivity.this, EventsListActivity.class);
                        i.putExtra("name", "wars_tv");
                        startActivity(i);
                        overridePendingTransition(R.anim.fade_in_animation, R.anim.fade_out_animation);
                    }
                });

            }
        });


        empire_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter >= 3) {
                    MainActivity.ShowAd();
                    counter = 0;
                } else {
                    counter++;
                    Intent i = new Intent(MainActivity.this, EventsListActivity.class);
                    i.putExtra("name", "empire_tv");
                    startActivity(i);
                    overridePendingTransition(R.anim.fade_in_animation, R.anim.fade_out_animation);
                }


                mPublisherInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdLoaded() {
                        // Code to be executed when an ad finishes loading.

                    }

                    @Override
                    public void onAdFailedToLoad(int errorCode) {
                        // Code to be executed when an ad request fails.
                    }

                    @Override
                    public void onAdOpened() {
                        // Code to be executed when the ad is displayed.
                    }

                    @Override
                    public void onAdClicked() {
                        // Code to be executed when the user clicks on an ad.
                    }

                    @Override
                    public void onAdLeftApplication() {
                        // Code to be executed when the user has left the app.
                    }

                    @Override
                    public void onAdClosed() {
                        // Code to be executed when the interstitial ad is closed.
                        counter++;
                        Intent i = new Intent(MainActivity.this, EventsListActivity.class);
                        i.putExtra("name", "empire_tv");
                        startActivity(i);
                        overridePendingTransition(R.anim.fade_in_animation, R.anim.fade_out_animation);
                    }
                });


            }
        });

        companions_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter >= 3) {
                    MainActivity.ShowAd();
                    counter = 0;
                } else {
                    counter++;
                    Intent i = new Intent(MainActivity.this, EventsListActivity.class);
                    i.putExtra("name", "companions_tv");
                    startActivity(i);
                    overridePendingTransition(R.anim.fade_in_animation, R.anim.fade_out_animation);
                }


                mPublisherInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdLoaded() {
                        // Code to be executed when an ad finishes loading.

                    }

                    @Override
                    public void onAdFailedToLoad(int errorCode) {
                        // Code to be executed when an ad request fails.
                    }

                    @Override
                    public void onAdOpened() {
                        // Code to be executed when the ad is displayed.
                    }

                    @Override
                    public void onAdClicked() {
                        // Code to be executed when the user clicks on an ad.
                    }

                    @Override
                    public void onAdLeftApplication() {
                        // Code to be executed when the user has left the app.
                    }

                    @Override
                    public void onAdClosed() {
                        counter++;
                        // Code to be executed when the interstitial ad is closed.
                        Intent i = new Intent(MainActivity.this, EventsListActivity.class);
                        i.putExtra("name", "companions_tv");
                        startActivity(i);
                        overridePendingTransition(R.anim.fade_in_animation, R.anim.fade_out_animation);
                    }
                });

            }
        });

    }


    public static void ShowAd() {
        if (mPublisherInterstitialAd.isLoaded() && counter >= 3) {
            mPublisherInterstitialAd.show();
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
    }

}