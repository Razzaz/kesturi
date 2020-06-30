package com.app.kesturi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class PhoneNumberActivity extends AppCompatActivity {

    private Button mPhoneNumber;
    private Button mOTP;
    EditText etPhoneNumber;
    EditText etOTP;

    FirebaseAuth mAuth;
    String codeSent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTransparentStatusBarOnly(this);

        try
        {
            Objects.requireNonNull(this.getSupportActionBar()).hide();
        }
        catch (NullPointerException ignored){}

        setContentView(R.layout.activity_phone_number);

        mAuth = FirebaseAuth.getInstance();
        etPhoneNumber = findViewById(R.id.ePhoneNumber);
        etOTP = findViewById(R.id.eOTP);

        mPhoneNumber = findViewById(R.id.bPhoneNumber);
        mPhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //sendVerificationCode();
                startActivity(new Intent(PhoneNumberActivity.this, MainActivity.class));
                finish();
            }
        });

        mOTP = findViewById(R.id.bOTP);
        mOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //verifySignInCode();
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
