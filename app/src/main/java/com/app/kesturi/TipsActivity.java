package com.app.kesturi;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Objects;

public class TipsActivity extends AppCompatActivity {

    private TextView buttonBack;
    private Button buttonNews;
    private ArrayList<String> mImageUrls = new ArrayList<>();

    private static final String TAG = "TipsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTransparentStatusBarOnly(this);

        try {
            Objects.requireNonNull(this.getSupportActionBar()).hide();
        } catch (NullPointerException ignored) {
        }

        setContentView(R.layout.activity_tips);

        buttonBack = findViewById(R.id.bback);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TipsActivity.this, MainActivity.class));
                finish();
            }
        });

        initBitmaps();
    }

//        buttonNews = findViewById(R.id.buttonNews);
//        buttonNews.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(TipsActivity.this, NewsActivity.class));
//                finish();
//            }
//        });

    private void initBitmaps(){
        mImageUrls.add("https://live.staticflickr.com/65535/49915993117_bc200378d2_z.jpg");
        mImageUrls.add("https://live.staticflickr.com/65535/49916163932_e2dbc0f1db_c.jpg");
        mImageUrls.add("https://live.staticflickr.com/65535/49916168307_dd891fffd0_c.jpg");
        mImageUrls.add("https://live.staticflickr.com/65535/49915350863_84e90fc1a7_c.jpg");
        mImageUrls.add("https://live.staticflickr.com/65535/49915861941_4aa928ffce_c.jpg");

        mImageUrls.add("https://live.staticflickr.com/65535/50060565721_4b26f2fd4a_c.jpg");
        mImageUrls.add("https://live.staticflickr.com/65535/50060554321_964f7aa431_k.jpg");
        mImageUrls.add("https://live.staticflickr.com/65535/50059991268_eebe21f2db_k.jpg");
        mImageUrls.add("https://live.staticflickr.com/65535/50060554561_6667448eba_c.jpg");
        mImageUrls.add("https://live.staticflickr.com/65535/50059991783_8b1bb6f2b3_k.jpg");
        mImageUrls.add("https://live.staticflickr.com/65535/50060555216_5844ad1fbb_k.jpg");
        mImageUrls.add("https://live.staticflickr.com/65535/50060555416_4c499f866c_c.jpg");
        mImageUrls.add("https://live.staticflickr.com/65535/50060802137_6f5c783345_b.jpg");

        initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler);
        RecycleViewTips adapter = new RecycleViewTips(this, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void setTransparentStatusBarOnly(Activity activity) {
        activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        activity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        activity.getWindow().setStatusBarColor(Color.TRANSPARENT);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }
}
