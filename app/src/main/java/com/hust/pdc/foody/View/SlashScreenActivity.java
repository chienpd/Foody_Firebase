package com.hust.pdc.foody.View;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.hust.pdc.foody.BuildConfig;
import com.hust.pdc.foody.R;

public class SlashScreenActivity extends AppCompatActivity {

    TextView txtversion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_flashscreen);

        txtversion = findViewById(R.id.txtversion);
        txtversion.setText(String.format("%s %s", getString(R.string.version), BuildConfig.VERSION_NAME));

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent iDangNhap = new Intent(SlashScreenActivity.this, DangNhapActivity.class);
                startActivity(iDangNhap);
            }
        }, 2000);
    }
}
