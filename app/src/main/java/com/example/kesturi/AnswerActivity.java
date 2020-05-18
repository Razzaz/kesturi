package com.example.kesturi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Objects;

public class AnswerActivity extends AppCompatActivity {

    private TextView buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTransparentStatusBarOnly(this);

        try
        {
            Objects.requireNonNull(this.getSupportActionBar()).hide();
        }
        catch (NullPointerException ignored){}
        setContentView(R.layout.activity_answer);

        buttonBack = findViewById(R.id.bback);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AnswerActivity.this, MainActivity.class));
                finish();
            }
        });

        String question = getIntent().getStringExtra("question");
        String answer = getIntent().getStringExtra("answer");

        TextView mQuestion = findViewById(R.id.question);
        TextView mAnswer = findViewById(R.id.answer);

        mQuestion.setText(question);
        mAnswer.setText(answer);

    }

    public void setTransparentStatusBarOnly(Activity activity) {
        activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        activity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        activity.getWindow().setStatusBarColor(Color.TRANSPARENT);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }
}
