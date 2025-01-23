package com.microfrance.comptroub.Module4_Setup;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.github.chrisbanes.photoview.PhotoView;
import com.microfrance.comptroub.MainActivity;
import com.microfrance.comptroub.Module2_Setup.Module_2;
import com.microfrance.comptroub.Module2_Setup.mod2_quiz_activity;
import com.microfrance.comptroub.Module3_Setup.Module_3;
import com.microfrance.comptroub.R;

public class Module_4 extends AppCompatActivity {

    private ScrollView scrollView;
    private Button sol1, sol2, sol3, tutor1, tutor2, synp, quiz;

    private void scrollToView(int viewId) {
        View view = findViewById(viewId);
        if (view != null) {
            view.getParent().requestChildFocus(view, view);
        }
    }

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_module4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        AppCompatButton backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finish the current activity and return to the previous one
                finish();
            }
        });

        AppCompatButton quizStart = findViewById(R.id.modQuiz);
        quizStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the NewActivity
                Intent intent = new Intent(Module_4.this, mod4_quiz_activity.class);
                startActivity(intent);
            }
        });

        Button tutorOneLink = findViewById(R.id.tutorOneLink);
        tutorOneLink.setBackgroundColor(getResources().getColor(R.color.your_color));
        tutorOneLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent with the URL
                Uri webpage = Uri.parse("https://youtu.be/1RkR0RvXEKU?si=V_DjAVFasSmQ8DPo");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                Uri fallbackWebpage = Uri.parse("https://youtu.be/1RkR0RvXEKU?si=V_DjAVFasSmQ8DPo");
                Intent fallbackIntent = new Intent(Intent.ACTION_VIEW, fallbackWebpage);
                startActivity(fallbackIntent);
            }
        });

        Button tutorTwoLink = findViewById(R.id.tutorTwoLink);
        tutorTwoLink.setBackgroundColor(getResources().getColor(R.color.your_color));
        tutorTwoLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent with the URL
                Uri webpage = Uri.parse("https://youtu.be/eY_Yww2-Kyw?si=c4OwnA6VRTz0I4-b");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                Uri fallbackWebpage = Uri.parse("https://youtu.be/eY_Yww2-Kyw?si=c4OwnA6VRTz0I4-b");
                Intent fallbackIntent = new Intent(Intent.ACTION_VIEW, fallbackWebpage);
                startActivity(fallbackIntent);
            }
        });

        Button tutorThreeLink = findViewById(R.id.tutorThreeLink);
        tutorThreeLink.setBackgroundColor(getResources().getColor(R.color.your_color));
        tutorThreeLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent with the URL
                Uri webpage = Uri.parse("https://youtu.be/s7jbyKHCkRE?si=tIDXrVaQcKcO0TY_");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                Uri fallbackWebpage = Uri.parse("https://youtu.be/s7jbyKHCkRE?si=tIDXrVaQcKcO0TY_");
                Intent fallbackIntent = new Intent(Intent.ACTION_VIEW, fallbackWebpage);
                startActivity(fallbackIntent);
            }
        });

        Button mod4Link = findViewById(R.id.mod4Link);
        mod4Link.setBackgroundColor(getResources().getColor(R.color.your_color));
        mod4Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent with the URL
                Uri webpage = Uri.parse("https://rb.gy/rmxcfd");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                Uri fallbackWebpage = Uri.parse("https://rb.gy/rmxcfd");
                Intent fallbackIntent = new Intent(Intent.ACTION_VIEW, fallbackWebpage);
                startActivity(fallbackIntent);
            }
        });

        ImageView power_supply_1 = findViewById(R.id.power_supply_1);
        power_supply_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    // If mediaPlayer is already playing, pause it and seek to the beginning
                    mediaPlayer.pause();
                    mediaPlayer.seekTo(0);
                    mediaPlayer.start();
                } else {
                    // If mediaPlayer is null or not playing, create and start it
                    mediaPlayer = MediaPlayer.create(Module_4.this, R.raw.power_supply_noise);
                    mediaPlayer.start();
                }
            }
        });


        ImageView mod4Intro = findViewById(R.id.mod4Intro);
        ImageView firstSolPic = findViewById(R.id.firstSolPic);
        ImageView scndSolPic = findViewById(R.id.scndSolPic);
        ImageView thirdSolPic = findViewById(R.id.thrdSolPic);

        Glide.with(this).asGif().load(R.drawable.screen_turned_off).into(mod4Intro);
        Glide.with(this).asGif().load(R.drawable.clean_pc).into(firstSolPic);
        Glide.with(this).asGif().load(R.drawable.windows_update).into(scndSolPic);

        firstSolPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_4.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(firstSolPic.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
        scndSolPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_4.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(scndSolPic.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
        thirdSolPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_4.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(thirdSolPic.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        ImageView windows_update_1 = findViewById(R.id.windows_update_1);
        ImageView windows_update_2 = findViewById(R.id.windows_update_2);
        ImageView windows_update_3 = findViewById(R.id.windows_update_3);
        ImageView windows_update_4 = findViewById(R.id.windows_update_4);
        ImageView windows_update_5 = findViewById(R.id.windows_update_5);
        Glide.with(this).asGif().load(R.drawable.window_update_1).into(windows_update_1);
        Glide.with(this).asGif().load(R.drawable.window_update_2).into(windows_update_2);
        Glide.with(this).asGif().load(R.drawable.window_update_3).into(windows_update_3);
        Glide.with(this).asGif().load(R.drawable.window_update_4).into(windows_update_4);
        Glide.with(this).asGif().load(R.drawable.windows_update).into(windows_update_5);

        windows_update_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_4.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(windows_update_1.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
        windows_update_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_4.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(windows_update_2.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
        windows_update_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_4.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(windows_update_3.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
        windows_update_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_4.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(windows_update_4.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
        windows_update_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_4.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(windows_update_5.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });


        ImageView power_supply_2 = findViewById(R.id.power_supply_2);
        ImageView power_supply_3 = findViewById(R.id.power_supply_3);
        Glide.with(this).asGif().load(R.drawable.burn_power_supply).into(power_supply_2);
        Glide.with(this).asGif().load(R.drawable.power_supply_fan).into(power_supply_3);
        power_supply_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_4.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(power_supply_2.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
        power_supply_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_4.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(power_supply_3.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });


        LinearLayout navigationPanel = findViewById(R.id.navigationPanel);
        AppCompatButton navigationToggleButton = findViewById(R.id.navigationToggleButton);

        // Initialize isNavigationPanelVisible to false initially
        final boolean[] isNavigationPanelVisible = {false};

        // Set OnClickListener for the toggle button
        navigationToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the visibility of the navigation panel
                if (isNavigationPanelVisible[0]) {
                    navigationPanel.setVisibility(View.GONE);
                    isNavigationPanelVisible[0] = false;
                } else {
                    navigationPanel.setVisibility(View.VISIBLE);
                    isNavigationPanelVisible[0] = true;
                }
            }
        });

        scrollView = findViewById(R.id.scrollView);
        sol1 = findViewById(R.id.frstSol);
        sol2 = findViewById(R.id.scndSol);
        sol3 = findViewById(R.id.thrdSol);
        tutor1 = findViewById(R.id.tutorOne);
        tutor2 = findViewById(R.id.tutorTwo);
        synp = findViewById(R.id.synp);
        quiz = findViewById(R.id.challMe);


        sol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the NewActivity
                scrollToView(R.id.modFrstSol);
            }
        });

        sol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the NewActivity
                scrollToView(R.id.modScndSol);
            }
        });

        sol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the NewActivity
                scrollToView(R.id.modThrdSol);
            }
        });

        tutor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the NewActivity
                scrollToView(R.id.modTutorOne);
            }
        });

        tutor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the NewActivity
                scrollToView(R.id.modTutorTwo);
            }
        });

        synp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the NewActivity
                scrollToView(R.id.modSynp);
            }
        });

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the NewActivity
                scrollToView(R.id.modQuiz);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}