package com.alameen.dell.ertugrul01;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
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

import static com.alameen.dell.ertugrul01.MainActivity.InternetConnection.DIALOG_ERROR_CONNECTION;

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


/*
        if (!isConnected(MainActivity.this)) {
            buildDialog(MainActivity.this).show();
            return;
        } else {
//            Toast.makeText(MainActivity.this,"Welcome", Toast.LENGTH_SHORT).show();
        }
*/



        if (!isOnline(this)) {
            showDialog(DIALOG_ERROR_CONNECTION); //displaying the created dialog.
        } else {
            //Internet available. Do what's required when internet is available.
        }


        MobileAds.initialize(this, "ca-app-pub-6081186777692750~2380503603");


//        mInterstitialAd = new InterstitialAd(this);
//        mInterstitialAd.setAdUnitId("ca-app-pub-6081186777692750/2857718581");
//        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        mPublisherInterstitialAd = new PublisherInterstitialAd(this);
        mPublisherInterstitialAd.setAdUnitId("ca-app-pub-6081186777692750/2857718581");
        mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());

        /*mPublisherInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
            }

        });
*/

        life_tv = (TextView) findViewById(R.id.life_tv);
        wars_tv = (TextView) findViewById(R.id.wars_tv);
        empire_tv = (TextView) findViewById(R.id.empire_tv);
        companions_tv = (TextView) findViewById(R.id.companions_tv);

        life_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter >= 4) {
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
                        mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
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

                if (counter >= 4) {
                    MainActivity.ShowAd();
                    counter = 0;
                } else {
                    mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
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
                        mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
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

                if (counter >= 4) {
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
                        mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
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

                if (counter >= 4) {
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
                        mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
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


/*
    public boolean isConnected(Context c) {

        ConnectivityManager connectivityManager
                = (ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public AlertDialog.Builder buildDialog(Context c) {

        final AlertDialog.Builder builder = new AlertDialog.Builder(c);
        builder.setTitle("Please Connect Internet:");
        builder.setMessage("It Will Help us Keep Supporting This App For Free, Thanks");
        builder.setIcon(R.drawable.internet);

        builder.setPositiveButton("Sure", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                // finish();
//               dialog.dismiss();
            }
        });

        return builder;
    }
*/

    public class InternetConnection extends Activity {
        static final int DIALOG_ERROR_CONNECTION = 1;

    }

    @Override
    protected Dialog onCreateDialog(int id) {
        Dialog dialog = null;
        switch (id) {
            case DIALOG_ERROR_CONNECTION:
                AlertDialog.Builder errorDialog = new AlertDialog.Builder(this);
                errorDialog.setTitle("We Have a Request:");
                errorDialog.setIcon(R.drawable.internet);
                errorDialog.setMessage("Please Connect to Internet, It Will Help us Keep Supporting This App For Free, For All!");
                errorDialog.setNeutralButton("Sure",
                        new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();
                            }
                        });

                AlertDialog errorAlert = errorDialog.create();
                return errorAlert;

            default:
                break;
        }
        return dialog;
    }

    public boolean isOnline(Context c) {
        ConnectivityManager cm = (ConnectivityManager) c
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo ni = cm.getActiveNetworkInfo();

        if (ni != null && ni.isConnected())
            return true;
        else
            return false;
    }

}