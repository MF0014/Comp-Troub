package com.microfrance.comptroub.Module1_Setup;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.microfrance.comptroub.MainActivity;
import com.microfrance.comptroub.Module1_Setup.mod1_quiz_activity;
import com.microfrance.comptroub.R;

public class mod1_quiz_result extends AppCompatActivity {

    private TextView scoreTxt;
    private int mod1_score; // Declare mod1_score without initialization

    // Define SharedPreferences file name
    private static final String SHARED_PREFS_NAME = "user_progress";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mod1_quiz_result);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        scoreTxt = findViewById(R.id.resultTxt);

        AppCompatButton backButton = findViewById(R.id.btnDashboard);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finish this activity and return to MainActivity
                finish();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Load the saved score from SharedPreferences
        SharedPreferences prefs = getSharedPreferences(SHARED_PREFS_NAME, MODE_PRIVATE);
        mod1_score = prefs.getInt("module101Score", 0);
        // Update the scoreTxt with the loaded score
        scoreTxt.setText(mod1_quiz_activity.score + "/5");
    }

    @Override
    public void finish() {
        // Set mod1_score to the current score before finishing
        mod1_score = mod1_quiz_activity.score;
        // Save completion status and score in SharedPreferences
        SharedPreferences.Editor editor = getSharedPreferences(SHARED_PREFS_NAME, MODE_PRIVATE).edit();
        editor.putBoolean("module101Completed", true);
        editor.putInt("module101Score", mod1_score);
        editor.apply();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("SCORE", mod1_score);
        startActivity(intent);
        super.finish();
    }

    @Override
    public void onBackPressed() {
        // Do nothing to disable the back button
        super.onBackPressed();
    }
}
