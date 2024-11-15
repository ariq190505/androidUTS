package com.example.tajwid;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

import com.example.utsandr.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Durasi splash screen dalam milidetik (misalnya 3 detik)
        int splashDuration = 3000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Berpindah ke MainActivity setelah durasi splash
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Tutup SplashActivity agar tidak bisa kembali ke sini
            }
        }, splashDuration);
    }
}
