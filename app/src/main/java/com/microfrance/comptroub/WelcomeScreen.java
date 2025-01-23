package com.microfrance.comptroub;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.os.Handler;

public class WelcomeScreen extends AppCompatActivity {

    // Duration in milliseconds for which the welcome screen will be displayed
    private static final long SPLASH_DURATION = 3000; // 3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        // Use a Handler to delay the transition to the next activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the next activity after the splash duration
                startActivity(new Intent(WelcomeScreen.this, MainActivity.class));
                finish(); // Finish the welcome screen activity to prevent going back to it
            }
        }, SPLASH_DURATION);
    }
}