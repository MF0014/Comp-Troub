package com.microfrance.comptroub.Module8_Setup;

import android.content.Intent;
import android.media.Image;
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
import com.microfrance.comptroub.Module5_Setup.Module_5;
import com.microfrance.comptroub.Module6_Setup.Module_6;
import com.microfrance.comptroub.R;

public class Module_8 extends AppCompatActivity {

    private ScrollView scrollView;
    private Button sol1, sol2, sol3, sol4,tutor1, tutor2, synp, quiz;

    private void scrollToView(int viewId) {
        View view = findViewById(viewId);
        if (view != null) {
            view.getParent().requestChildFocus(view, view);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_module8);
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
                Intent intent = new Intent(Module_8.this, mod8_quiz_activity.class);
                startActivity(intent);
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
                Uri webpage = Uri.parse("https://youtu.be/btRnfFsa_Lg?si=C2DQAl8c3ekPTy_H");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                Uri fallbackWebpage = Uri.parse("https://youtu.be/btRnfFsa_Lg?si=C2DQAl8c3ekPTy_H");
                Intent fallbackIntent = new Intent(Intent.ACTION_VIEW, fallbackWebpage);
                startActivity(fallbackIntent);
            }
        });

        Button mod8Link = findViewById(R.id.mod8Link);
        mod8Link.setBackgroundColor(getResources().getColor(R.color.your_color));
        mod8Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent with the URL
                Uri webpage = Uri.parse("https://rb.gy/3m9dp2");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                Uri fallbackWebpage = Uri.parse("https://rb.gy/3m9dp2");
                Intent fallbackIntent = new Intent(Intent.ACTION_VIEW, fallbackWebpage);
                startActivity(fallbackIntent);
            }
        });

        ImageView frstSolPic = findViewById(R.id.firstSolPic);
        ImageView scndSolPic = findViewById(R.id.scndSolPic);
        ImageView thrdSolPic = findViewById(R.id.thrdSolPic);
        ImageView frthSolPic = findViewById(R.id.frthSolPic);

        Glide.with(this).asGif().load(R.drawable.restart_pc).into(frstSolPic);
        Glide.with(this).asGif().load(R.drawable.windows_update).into(scndSolPic);
        Glide.with(this).asGif().load(R.drawable.check_malware).into(thrdSolPic);

        frstSolPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_8.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(frstSolPic.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
        scndSolPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_8.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(scndSolPic.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
        thrdSolPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_8.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(thrdSolPic.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
        frthSolPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_8.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(frthSolPic.getDrawable());
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
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_8.this);
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
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_8.this);
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
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_8.this);
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
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_8.this);
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
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_8.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(windows_update_5.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        ImageView malware_check_1 = findViewById(R.id.malware_check_1);
        ImageView malware_check_2 = findViewById(R.id.malware_check_2);
        ImageView malware_check_3 = findViewById(R.id.malware_check_3);
        Glide.with(this).asGif().load(R.drawable.malware_check_1).into(malware_check_1);
        Glide.with(this).asGif().load(R.drawable.malware_check_2).into(malware_check_2);
        Glide.with(this).asGif().load(R.drawable.malware_check_3).into(malware_check_3);
        malware_check_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_8.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(malware_check_1.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
        malware_check_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_8.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(malware_check_2.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
        malware_check_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_8.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(malware_check_3.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });



        scrollView = findViewById(R.id.scrollView);
        sol1 = findViewById(R.id.frstSol);
        sol2 = findViewById(R.id.scndSol);
        sol3 = findViewById(R.id.thrdSol);
        sol4 = findViewById(R.id.frthSol);
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

        sol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the NewActivity
                scrollToView(R.id.modFrthSol);
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
}