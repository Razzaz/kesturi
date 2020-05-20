package com.example.kesturi;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Objects;

public class CancerActivity extends AppCompatActivity {

    private TextView buttonBack;
    private static final String TAG = "QnaActivity";

    private ArrayList<String> mQuestionText = new ArrayList<>();
    private ArrayList<String> mAnswerText = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTransparentStatusBarOnly(this);

        try
        {
            Objects.requireNonNull(this.getSupportActionBar()).hide();
        }
        catch (NullPointerException ignored){}

        setContentView(R.layout.activity_cancer);

        initQuestions();

        buttonBack = findViewById(R.id.bback);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CancerActivity.this, MainActivity.class));
                finish();
            }
        });

    }

    private void initQuestions(){
        mQuestionText.add("Apa itu kemoterapi?");
        mQuestionText.add("Apa yang harus dipersiapkan pasien sebelum menjalani kemoterapi?");
        mQuestionText.add("Bagaimana efek samping kemoterapi pada pasien yang menjalaninya?");

        mAnswerText.add("Kemoterapi merupakan salah satu pengobatan dengan menggunakan obat-obatan untuk menghancurkan atau memperlambat sel-sel kanker.");
        mAnswerText.add("Beberapa hal yang harus dipersiapkan pasien sebelum menjalani kemoterapi, yaitu: Melakukan pemeriksaan darah, fungsi hati, ginjal dan EKG. Melakukan pemeriksaan gigi. Memastikan keadaan umum baik, termasuk telah beristirahat yang cukup. Mengetahui tujuan pengobatan dan efek samping pengobatan. Memastikan kesiapan mental, tetap tenang dan tidak cemas.");
        mAnswerText.add("Efek samping kemoterapi yang sering terjadi, yaitu mual, muntah, lelah, gangguan tidur, sariawan, kesemutan, gangguan pada mata, diare, kemerahan pada kulit, mudah terkena infeksi, kerontokan rambut dan penurunan berat badan.");

        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recycler);
        RecycleViewQna adapter = new RecycleViewQna(this, mQuestionText, mAnswerText);
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
