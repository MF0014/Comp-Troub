package com.microfrance.comptroub.Module8_Setup;

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
import com.microfrance.comptroub.Module3_Setup.mod3_quiz_activity;
import com.microfrance.comptroub.Module8_Setup.mod8_quiz_activity;
import com.microfrance.comptroub.Module8_Setup.mod8_quiz_result;
import com.microfrance.comptroub.R;

public class mod8_quiz_result extends AppCompatActivity {

    private TextView scoreTxt;
    private int mod8_score; // Declare mod8_score without initialization

    // Define SharedPreferences file name
    private static final String SHARED_PREFS_NAME = "user_progress";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mod8_quiz_result);
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
        mod8_score = prefs.getInt("module8Score", 0);
        // Update the scoreTxt with the loaded score
        scoreTxt.setText(mod8_quiz_activity.score + "/5");
    }

    @Override
    public void finish() {
        // Set mod8_score to the current score before finishing
        mod8_score = mod8_quiz_activity.score;
        // Save completion status and score in SharedPreferences
        SharedPreferences.Editor editor = getSharedPreferences(SHARED_PREFS_NAME, MODE_PRIVATE).edit();
        editor.putBoolean("module8Completed", true);
        editor.putInt("module8Score", mod8_score);
        editor.apply();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("SCORE", mod8_score);
        startActivity(intent);
        super.finish();
    }

    @Override
    public void onBackPressed() {
        // Do nothing to disable the back button
        super.onBackPressed();
    }

}