package com.app.kesturi;

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

public class HivActivity extends AppCompatActivity {

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

        setContentView(R.layout.activity_hiv);

        initQuestions();

        buttonBack = findViewById(R.id.bback);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HivActivity.this, MainActivity.class));
                finish();
            }
        });

    }

    private void initQuestions(){
        mQuestionText.add("Orang dengan HIV, apakah lebih berisiko terkena COVID-19? ");
        mQuestionText.add("Apakah gejala COVID-19 lebih parah pada orang dengan HIV?");
        mQuestionText.add("Apakah orang dengan HIV memiliki pencegahan khusus terhadap COVID-19?");
        mQuestionText.add("Orang dengan HIV, apa yang dapat dilakukan saat merasa tidak sehat atau memiliki gejala COVID-19?");
        mQuestionText.add("Bagaimana orang dengan HIV melindungi diri dari COVID-19?");

        mAnswerText.add("Umumnya, orang dengan HIV memiliki daya tahan tubuh yang rendah sehingga harus lebih berhati-hati. Untuk itu sangat penting melakukan pengobatan rutin. Hingga saat ini belum ada bukti bahwa orang dengan HIV yang menjalani pengobatan dengan baik beresiko lebih tinggi terkena COVID-19.");
        mAnswerText.add("Hingga saat ini belum ada bukti bahwa orang dengan HIV yang menjalani pengobatan dengan baik memiliki gejala COVID-19yang lebih parah.");
        mAnswerText.add("Secara umum pencegahan COVID-19 pada orang dengan HIV sama dengan orang lainnya, yaitu: Sering mencuci tangan dengan sabun dan air mengalir selama 40 detik atau menggunakan hand sanitizer dengan kandungan alkohol 70% jika air dan sabun tidak tersedia. Hindari menyentuh wajah, terutama mata, hidung dan mulut. Tutupi hidung dan mulut dengan bagian dalam siku atau tisu saat bersin dan buang tisu di tempat sampah. Hindari kontak fisik dengan orang lain. Sebisa mungkin hindari keluar rumah dan tetap di dalam rumah. Gunakan masker jika terpaksa keluar rumah.");
        mAnswerText.add("Jika merasa tidak sehat misalnya mengalami batuk dan peningkatan suhu tubuh, tetap dirumah dan hubungi petugas kesehatan. Upayakan untuk tidak kontak dekat dengan orang lain. ");
        mAnswerText.add("Lakukan tindakan pencegahan dengan benar. Sediakan obat ARV yang cukup di rumah untuk persediaan 1-3 bulan. Pastikan telah melakukan vaksinasi misalnya pneumokokus dan influenza. Konsumsi makanan bergizi seimbang dan olahraga rutin di rumah. Usahakan untuk tetap bahagia dan hindari stress. Diskusikan dengan petugas kesehatan cara mendapatkan layanan kesehatan jika diperlukan.");

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
