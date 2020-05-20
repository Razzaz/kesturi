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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Objects;

public class QnaActivity extends AppCompatActivity {

    private TextView buttonBack;
    private static final String TAG = "QnaActivity";

    private ArrayList<String> mQuestionText = new ArrayList<>();
    private ArrayList<String> mAnswerText = new ArrayList<>();
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

        initQuestions();

        buttonBack = findViewById(R.id.bback);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QnaActivity.this, MainActivity.class));
                finish();
            }
        });

//        findViewById(R.id.qna1).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(QnaActivity.this, AnswerActivity.class);
//                intent.putExtra("question","Bagaimana perawatan ibu setelah melahirkan (postpartum) di saat pandemic COVID-19?");
//                intent.putExtra("answer", "Perawatan ibu postpartum di saat pandemic COVID-19 tidak berbeda dengan perawatan postpartum pada umumnya dan disesuaikan dengan wilayah atau daerah terdampak COVID-19.");
//                startActivity(intent);
//            }
//        });
//
//        findViewById(R.id.qna2).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(QnaActivity.this, AnswerActivity.class);
//                intent.putExtra("question","Bagaimana perawatan ibu postpartum positif COVID-19 atau PDP?");
//                intent.putExtra("answer", "Perawatan harus dilakukan di ruangan khusus/isolasi, dimana ibu postpartum dirawat terpisah dengan bayinya.");
//                startActivity(intent);
//            }
//        });
//
//        findViewById(R.id.qna3).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(QnaActivity.this, AnswerActivity.class);
//                intent.putExtra("question","Apakah memungkinkan jika ibu postpartum positif COVID-19 ingin merawat bayinya?");
//                intent.putExtra("answer", "Bila ibu memutuskan merawat bayinya sendiri, maka perlu dipastikan ibu telah menerima informasi lengkap dan memahami potensi risiko terhadap bayi. Ibu dan bayi harus diisolasi dalam satu kamar dengan fasilitas sesuai standar.");
//                startActivity(intent);
//            }
//        });
//
//        findViewById(R.id.qna4).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(QnaActivity.this, AnswerActivity.class);
//                intent.putExtra("question","Apa yang dapat dilakukan ibu postpartum positif COVID-19 untuk menghindari risiko penularan terhadap bayi?");
//                intent.putExtra("answer", "Selama melakukan perawatan bayi, ibu harus menggunakan masker dan melakukan cuci tangan yang benar saat sebelum dan setelah menyusui serta sebelum dan setelah kontak dengan bayi.");
//                startActivity(intent);
//            }
//        });
//
//        findViewById(R.id.qna5).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(QnaActivity.this, AnswerActivity.class);
//                intent.putExtra("question","Bagaimana pelaksanaan kunjungan nifas di saat pandemic COVID-19?");
//                intent.putExtra("answer", "Kunjungan nifas dapat dilakukan dengan metode kunjungan rumah oleh tenaga kesehatan atau pemantauan menggunakan media online, dengan melakukan upaya-upaya pencegahan penularan COVID-19 baik dari petugas, ibu dan keluarga.");
//                startActivity(intent);
//            }
//        });

    }

    private void initQuestions(){
        mQuestionText.add("Bagaimana cara penyebaran atau penularan COVID-19?");
        mAnswerText.add("COVID-19 dapat menyebar melalui droplet cairan dari batuk dan bersin orang yang positif COVID-19 atau setelah menyentuh permukaan/barang yang terkontaminasi virus.");

        mQuestionText.add("Apakah COVID-19 dapat ditularkan dari ibu ke janin selama kehamilan?");
        mAnswerText.add("Belum ada bukti yang jelas tentang penularan COVID-19 dari ibu ke janin melalui plasenta maupun penularan vertikal (penularan dari ibu ke bayi sebelum lahir)");

        mQuestionText.add("Apakah COVID-19 dapat ditularkan melalui cairan vagina?");
        mAnswerText.add("Hingga saat ini tidak ada kasus cairan vagina yang teruji positif COVID-19. ");

        mQuestionText.add("Seberapa besar ibu hamil berisiko tertular COVID-19?");
        mAnswerText.add("Risiko penularan pada ibu hamil lebih kecil dibandingkan populasi umum. Ibu hamil dengan penyakit jantung beresiko lebih tinggi terpapar COVID-19.");

        mQuestionText.add("Apa gejala yang ditemukan pada ibu hamil dengan COVID-19?");
        mAnswerText.add("Gejala COVID-19 yang muncul selama ini pada ibu hamil dari ringan hingga berat, yaitu: demam, batuk, kesulitan bernapas, nyeri otot, kecapekan, sakit kepala dan gejala relevan lainnya");

        mQuestionText.add("Apakah kehamilan dapat memperburuk keadaan ibu dengan COVID-19?");
        mAnswerText.add("Gejala COVID-19 dapat menjadi lebih parah pada ibu hamil, karena proses kehamilan dapat mengubah sistem kekebalan tubuh dan responsnya terhadap infeksi virus secara umum.");

        mQuestionText.add("Seberapa bahayakah COVID-19 terhadap kehamilan dan janin?");
        mAnswerText.add("Terdapat laporan dari Iran tentang ibu yang mengalami infeksi COVID-19 menunjukkan gejala yang berat saat bersalin hingga membutuhkan ventilator dan mengakibatkan kematian bagi janin. Namun, hingga saat ini tidak ada data pasti tentang dampak COVID-19 terhadap peningkatan risiko keguguran, kejadian IUFD atau kelahiran premature. ");

        mQuestionText.add("Ibu dengan gejala COVID-19, apakah dapat memberikan ASI?");
        mAnswerText.add("Iya, hingga saat ini tidak ada kasus tercatat ASI yang dinyatakan positif COVID-19, sehingga ibu tetap dianjurkan memberikan ASI kepada bayinya.");

        mQuestionText.add("Perlukah pemeriksaan kehamilan dilakukan selama masa pandemic COVID-19?");
        mAnswerText.add("Pemeriksaan kehamilan tetap dilakukan selama masa pandemic COVID-19 pada usia kehamilan 12, ");

        mQuestionText.add("Apa yang dapat dilakukan ibu hamil, jika memiliki kendala untuk melakukan kontrol ke layanan kesehatan saat pandemic COVID-19?");
        mAnswerText.add("Jika tidak bisa ke layanan kesehatan, ibu hamil dapat berkonsultasi melalui telepon dengan petugas kesehatan tentang cara untuk tetap melakukan perawatan antenal selama masa pandemic. ");

        mQuestionText.add("Apa metode bersalin yang dapat digunakan selama pandemic COVID-19?");
        mAnswerText.add("Bagi ibu hamil dengan gejala COVID-19 maupun tidak, metode persalinan ditentukan berdasarkan indikasi obstetric. Hindari persalinan water birth jika ibu memiliki gejala COVID-19.");

        mQuestionText.add("Bagaimana proses pemantauan intranatal pada ibu dengan gejala COVID-19?");
        mAnswerText.add("Pemeriksaan runtin tetap dilakukan meliputi pemantauan secara berkala terhadap tanda-tanda vital ibu, pemeriksaan ultrasonografi janin dan pemantauan denyut jantung janin. Pemberian oksigen dapat dilakukan sesuai indikasi.");

        mQuestionText.add("Bagaimana pelayanan intranatal bagi ibu dengan gejala COVID-19?");
        mAnswerText.add("Bagi ibu hamil dengan gejala COVID-19 ringan, masa persalinan awal dapat dilakukan di rumah. Proses persalinan selanjutnya harus dilanjutkan di ruang isolasi rumah sakit sesuai standar. ");

        mQuestionText.add("Apa yang akan dilakukan jika kasus COVID-19 membahayakan kondisi ibu dan janin?");
        mAnswerText.add("Jika ibu memiliki gejala yang lebih parah serta kehamilan dapat membahayakan ibu dan janin, maka pengentian kehamilan harus dipertimbangkan untuk menyelamatkan ibu.");

        mQuestionText.add("Apakah keluarga dapat mendampingi ibu dengan gejala COVID-19 saat persalinan?");
        mAnswerText.add("Keluarga dapat mendampingi pasien namun hanya berjumlah satu orang, dan sebelumnya telah diinformasikan tentang risiko penularan serta diwajibkan memakai APD yang sesuai.");

        mQuestionText.add("Apakah induksi persalinan dapat dilakukan pada ibu hamil dengan gejala COVID-19?");
        mAnswerText.add("Ya, jika terdapat indikasi dengan evaluasi urgensi yang tepat. Sebaiknya induksi dilakukan setelah keadaan infeksi teratasi. Namun jika terpaksa, induksi persalinan harus dilakukan di ruang isolasi.");

        mQuestionText.add("Ibu dengan gejala COVID-19, apakah jenis anestesi yang dapat diberikan?");
        mAnswerText.add("Anestesi epidural atau spinal dapat diberikan sesuai indikasi dan sedapat mungkin menghindari anestesi umum kecuali jika benar-benar diperlukan.");

        mQuestionText.add("Bagaimana jika dalam proses persalinan ibu mengalami perburukan gejala?");
        mAnswerText.add("Apabila terjadi perburukan gejala selama proses persalinan, dapat dipertimbangkan seksio sesaria darurat. Jika ibu mengalami kelelahan saat persalinan kala II, perlu dipertimbangkan tindakan operatif pervaginam. ");

        mQuestionText.add("Apakah penundaan penjepitan tali pusat pada bayi dengan ibu yang memiliki gejala COVID-19 dapat dilakukan?");
        mAnswerText.add("Penundaan penjepitan tali pusat beberapa saat setelah persalinan masih bisa dilakukan, apabila tidak\n" +
                "ada kontraindikasi lainnya. Bayi dapat dibersihkan dan dikeringkan seperti biasa, sementara tali\n" +
                "pusat masih belum dipotong.\n");

        mQuestionText.add("Apakah ASI aman diberikan oleh ibu dengan positif COVID-19?");
        mQuestionText.add("Jika tidak melalui ASI, bagaimana risiko penularan COVID-19 dapat terjadi dari ibu ke bayi?");
        mQuestionText.add("Apa yang perlu diperhatikan jika ibu positif COVID-19 ingin memberikan ASI secara langsung pada bayi?");
        mQuestionText.add("Bagaimana jika di rumah, ibu positif COVID-19 tidak dapat memberikan ASI secara langsung pada bayinya?");
        mQuestionText.add("Apakah pelayanan kontrasepsi dan keluarga berencana tetap berjalan saat pandemi COVID-19?");
        mQuestionText.add("Apa metode kontrasepsi atau alat KB yang aman digunakan saat pandemi COVID-19?");
        mQuestionText.add("Bagaimana jika ibu tidak dapat memenuhi jadwal melakukan suntik atau cek alat KB lainnya ke pelayanan kesehatan?");
        mQuestionText.add("Bagaimana jika di masa pandemic COVID-19, ibu memiliki keluhan tentang alat KB yang digunakan dan ingin menggantinya?");
        mQuestionText.add("Apakah layanan kasus kekerasan perempuan tetap berjalan di masa pandemic COVID-19?");
        mQuestionText.add("Apa yang dapat dilakukan perempuan untuk mewaspadai jika terjadi kekerasan pada dirinya di masa pandemic?");
        mQuestionText.add("Bagaimana perawatan bayi baru lahir di saat pandemic COVID-19?");
        mQuestionText.add("Apakah perawatan bayi baru lahir dari ibu dengan COVID-19 sama dengan perawatan bayi baru lahir pada umumnya?");
        mQuestionText.add("Apa yang harus dilakukan ibu untuk mencegah risiko penularan COVID-19 ke bayinya?");
        mQuestionText.add("Apakah bayi baru lahir dari ibu dengan COVID-19 perlu dilakukan tes?");
        mQuestionText.add("Bagaimana perawatan ibu setelah melahirkan (postpartum) di saat pandemic COVID-19?");
        mQuestionText.add("Bagaimana perawatan ibu postpartum positif COVID-19 atau PDP?");
        mQuestionText.add("Apakah memungkinkan jika ibu postpartum positif COVID-19 ingin merawat bayinya?");
        mQuestionText.add("Apa yang dapat dilakukan ibu postpartum positif COVID-19 untuk menghindari risiko penularan terhadap bayi?");
        mQuestionText.add("Apakah jumlah kunjungan nifas berbeda di masa pandemic COVID-19? ");
        mQuestionText.add("Bagaimana pelaksanaan kunjungan nifas di saat pandemic COVID-19?");

        mAnswerText.add("ASI dari ibu positif COVID-19 aman diberikan kepada bayi karena COVID-19 tidak ditularkan melalui ASI. Selain itu, ASI penting untuk meningkatkan imunitas bayi dari penularan virus.");
        mAnswerText.add("Bayi berisiko tertular COVID-19 dari ibu saat menyusui karena dapat terpapar droplet yang terinfeksi. Sehingga perlu didiskusikan tentang cara pemberian ASI secara langsung atau tidak dan juga dipertimbangkan untuk pemberian susu formula.");
        mAnswerText.add("Ibu perlu memperhatikan langkah-langkah berikut saat akan menyusui bayi: Cuci tangan, gunakan masker, hindari batuk bersin saat menyusui, setelah selesai menyusui bayi dirawat oleh pengasuh yang sehat");
        mAnswerText.add("ASI diberikan dengan sendok/botol oleh pengasuh yang sehat dengan tetap mengikuti prosedur pencegahan penularan COVID-19 ");
        mAnswerText.add("Pelayanan kontrasepsi dan keluarga berencana tetap dilaksanakan saat pendemi COVID-19, karena aktivitas seksual tetap dilakukan di masa pandemi, sehingga penting untuk mengatur kehamilan.");
        mAnswerText.add("Semua metode kontrasepsi atau alat KB aman digunakan, namun perlu berkonsultasi dengan petugas kesehatan jika memiliki bayi kurang dari 6 bulan, menderita penyakit diabetes, kanker, atau masalah kesehatan lain.");
        mAnswerText.add("Apabila ibu tidak bisa ke pelayanan kesehatan untuk melakukan suntik atau cek alat KB lainnya karena pembatasan aktivitas di luar rumah, untuk sementara dapat menggunakan kondom.");
        mAnswerText.add("Jika ibu memiliki keluhan tentang alat KB yang digunakan dapat berkonsultasi melalui layanan online yang tersedia. Sebaiknya ibu menunda keinginan untuk mengganti alat KB di masa pandemi ini.");
        mAnswerText.add("Ya, terdapat inovasi dan strategi layanan kasus kekerasan perempuan di masa pandemic, sehingga pengaduan dan dukungan dapat dilakukan melalui telepon atau media online.");
        mAnswerText.add("a.	Mengetahui layanan pengaduan misalnya hotline, tempat penampungan dan konseling yang mudah dijangkau. Memiliki kontak yang dapat dihubungi dan mengetahui alur rujukan Mengetahui tetangga, teman atau kerabat yang dapat dijadikan tempat berlindung. Merencanakan cara keluar rumah dengan aman ke tempat tujuan. Menyediakan barang penting seperti dokumen, uang, obat-obatan, pakaian dan daftar nomor telepon jika terjadi keadaan darurat. Jika memungkinkan, bekerjasama dengan tetangga untuk menolong dalam kondisi darurat dengan kode-kode yang disepakati.");
        mAnswerText.add("Semua bayi baru lahir di saat pandemic COVID-19 dilayani sesuai standar perawatan bayi pada umumnya, termasuk kunjungan neonatal dan imunisasi");
        mAnswerText.add("Untuk bayi baru lahir dari ibu positif COVID-19 atau pasien dalam pengawasan (PDP), perawatan dilakukan secara terpisah di ruangan khusus/isolasi dengan bayi ditempatkan di inkubator.");
        mAnswerText.add("Ibu harus mengenakan APD yang sesuai standar saat akan menyusui, memandikan, merawat, memeluk atau berada dalam jarak 1 meter dari bayi dan melakukan etiket batuk yang benar.");
        mAnswerText.add("Ya, semua bayi yang lahir dari ibu dengan status PDP atau positif COVID-19 perlu dilakukan tes COVID-19.");
        mAnswerText.add("Perawatan ibu postpartum di saat pandemic COVID-19 tidak berbeda dengan perawatan postpartum pada umumnya dan disesuaikan dengan wilayah atau daerah terdampak COVID-19.");
        mAnswerText.add("Perawatan harus dilakukan di ruangan khusus/isolasi, dimana ibu postpartum dirawat terpisah dengan bayinya. ");
        mAnswerText.add("Bila ibu memutuskan merawat bayinya sendiri, maka perlu dipastikan ibu telah menerima informasi lengkap dan memahami potensi risiko terhadap bayi. Ibu dan bayi harus diisolasi dalam satu kamar dengan fasilitas sesuai standar.");
        mAnswerText.add("Selama melakukan perawatan bayi, ibu harus menggunakan masker dan melakukan cuci tangan yang benar saat sebelum dan setelah menyusui serta sebelum dan setelah kontak dengan bayi.");
        mAnswerText.add("Kunjungan nifas (KF) pada prinsipnya dilakukan 4 kali kunjungan, yaitu: a. KF 1 : pada periode 6 jam sampai dengan 2 hari pasca persalinan b. KF 2 : pada periode 3 hari sampai dengan 7 hari pasca persalinan c.	KF 3 : pada periode 8 hari sampai dengan 28 hari pasca persalinan d.	KF 4 : pada periode 29 hari sampai dengan 42 hari pasca persalinan");
        mAnswerText.add("Kunjungan nifas dapat dilakukan dengan metode kunjungan rumah oleh tenaga kesehatan atau pemantauan menggunakan media online, dengan melakukan upaya-upaya pencegahan penularan COVID-19 baik dari petugas, ibu dan keluarga.");

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
