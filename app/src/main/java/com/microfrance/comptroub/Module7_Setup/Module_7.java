package com.microfrance.comptroub.Module7_Setup;

import android.content.Intent;
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
import com.microfrance.comptroub.Module4_Setup.Module_4;
import com.microfrance.comptroub.Module5_Setup.Module_5;
import com.microfrance.comptroub.R;

public class Module_7 extends AppCompatActivity {

    private ScrollView scrollView;
    private Button sol1, sol2, sol3, sol4, synp, quiz;

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
        setContentView(R.layout.activity_module7);
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
                Intent intent = new Intent(Module_7.this, mod7_quiz_activity.class);
                startActivity(intent);
            }
        });

        Button tutorFourLink = findViewById(R.id.tutorFourLink);
        tutorFourLink.setBackgroundColor(getResources().getColor(R.color.your_color));
        tutorFourLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent with the URL
                Uri webpage = Uri.parse("https://youtu.be/-BJT-pUTN3s?si=3TNjXCssbKcqMr98");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                Uri fallbackWebpage = Uri.parse("https://youtu.be/-BJT-pUTN3s?si=3TNjXCssbKcqMr98");
                Intent fallbackIntent = new Intent(Intent.ACTION_VIEW, fallbackWebpage);
                startActivity(fallbackIntent);
            }
        });

        Button mod7Link = findViewById(R.id.mod7Link);
        mod7Link.setBackgroundColor(getResources().getColor(R.color.your_color));
        mod7Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent with the URL
                Uri webpage = Uri.parse("https://rb.gy/7zhhhk");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                Uri fallbackWebpage = Uri.parse("https://rb.gy/7zhhhk");
                Intent fallbackIntent = new Intent(Intent.ACTION_VIEW, fallbackWebpage);
                startActivity(fallbackIntent);
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

        ImageView mod7Intro = findViewById(R.id.mod7Intro);
        ImageView firstSolPic = findViewById(R.id.firstSolPic);
        ImageView scndSolPic = findViewById(R.id.scndSolPic);
        ImageView thrdSolPic = findViewById(R.id.thrdSolPic);
        ImageView frthSolPic = findViewById(R.id.frthSolPic);
        Glide.with(this).asGif().load(R.drawable.dino_game).into(mod7Intro);
        Glide.with(this).asGif().load(R.drawable.router_restart).into(firstSolPic);
        Glide.with(this).asGif().load(R.drawable.router_lan).into(scndSolPic);

        firstSolPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_7.this);
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
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_7.this);
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
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_7.this);
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
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_7.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(frthSolPic.getDrawable());
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