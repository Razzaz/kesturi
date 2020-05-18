package com.example.kesturi;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class QnaActivity extends AppCompatActivity {

    private TextView buttonBack;
//    private Button qna1;
//    private Button qna2;
//    private Button qna3;
//    private Button qna4;
//    private Button qna5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTransparentStatusBarOnly(this);

        try
        {
            Objects.requireNonNull(this.getSupportActionBar()).hide();
        }
        catch (NullPointerException ignored){}

        setContentView(R.layout.activity_qna);

        buttonBack = findViewById(R.id.bback);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QnaActivity.this, MainActivity.class));
                finish();
            }
        });

        findViewById(R.id.qna1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QnaActivity.this, AnswerActivity.class);
                intent.putExtra("question","Bagaimana perawatan ibu setelah melahirkan (postpartum) di saat pandemic COVID-19?");
                intent.putExtra("answer", "Perawatan ibu postpartum di saat pandemic COVID-19 tidak berbeda dengan perawatan postpartum pada umumnya dan disesuaikan dengan wilayah atau daerah terdampak COVID-19.");
                startActivity(intent);
            }
        });

        findViewById(R.id.qna2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QnaActivity.this, AnswerActivity.class);
                intent.putExtra("question","Bagaimana perawatan ibu postpartum positif COVID-19 atau PDP?");
                intent.putExtra("answer", "Perawatan harus dilakukan di ruangan khusus/isolasi, dimana ibu postpartum dirawat terpisah dengan bayinya.");
                startActivity(intent);
            }
        });

        findViewById(R.id.qna3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QnaActivity.this, AnswerActivity.class);
                intent.putExtra("question","Apakah memungkinkan jika ibu postpartum positif COVID-19 ingin merawat bayinya?");
                intent.putExtra("answer", "Bila ibu memutuskan merawat bayinya sendiri, maka perlu dipastikan ibu telah menerima informasi lengkap dan memahami potensi risiko terhadap bayi. Ibu dan bayi harus diisolasi dalam satu kamar dengan fasilitas sesuai standar.");
                startActivity(intent);
            }
        });

        findViewById(R.id.qna4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QnaActivity.this, AnswerActivity.class);
                intent.putExtra("question","Apa yang dapat dilakukan ibu postpartum positif COVID-19 untuk menghindari risiko penularan terhadap bayi?");
                intent.putExtra("answer", "Selama melakukan perawatan bayi, ibu harus menggunakan masker dan melakukan cuci tangan yang benar saat sebelum dan setelah menyusui serta sebelum dan setelah kontak dengan bayi.");
                startActivity(intent);
            }
        });

        findViewById(R.id.qna5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QnaActivity.this, AnswerActivity.class);
                intent.putExtra("question","Bagaimana pelaksanaan kunjungan nifas di saat pandemic COVID-19?");
                intent.putExtra("answer", "Kunjungan nifas dapat dilakukan dengan metode kunjungan rumah oleh tenaga kesehatan atau pemantauan menggunakan media online, dengan melakukan upaya-upaya pencegahan penularan COVID-19 baik dari petugas, ibu dan keluarga.");
                startActivity(intent);
            }
        });

    }

    public void setTransparentStatusBarOnly(Activity activity) {
        activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        activity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        activity.getWindow().setStatusBarColor(Color.TRANSPARENT);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }
}
