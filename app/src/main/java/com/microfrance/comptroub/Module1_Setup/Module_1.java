package com.microfrance.comptroub.Module1_Setup;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.graphics.Matrix;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.bumptech.glide.Glide;
import com.github.chrisbanes.photoview.PhotoView;
import com.microfrance.comptroub.R;
import com.microfrance.comptroub.imgviewer;

public class Module_1 extends AppCompatActivity {

    public static String selectedImageUri;
    private ScrollView scrollView;
    private Button sol1, sol2, sol3, synp, quiz;
    private Matrix matrix = new Matrix();
    private float scale = 1.0f;
    private ScaleGestureDetector scaleGestureDetector;

    ImageView mod1sol1, mod1sol2, mod1sol3;


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
        setContentView(R.layout.activity_module1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mod1sol1 = findViewById(R.id.mod1sol1);
        mod1sol2 = findViewById(R.id.mod1sol2);
        mod1sol3 = findViewById(R.id.mod1sol3);

        //Picasso.get().load(R.drawable.mod1_replug).into(mod1sol1);
        Glide.with(this).asGif().load(R.drawable.mod1_replug).into(mod1sol1);

        mod1sol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_1.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(mod1sol1.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        mod1sol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_1.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(mod1sol2.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
        mod1sol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Module_1.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_imgviewer, null);
                PhotoView photoView = mView.findViewById(R.id.photo_view);
                photoView.setImageDrawable(mod1sol3.getDrawable());
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });


        scrollView = findViewById(R.id.scrollView);
        sol1 = findViewById(R.id.frstSol);
        sol2 = findViewById(R.id.scndSol);
        sol3 = findViewById(R.id.thrdSol);
        synp = findViewById(R.id.synp);
        quiz = findViewById(R.id.challMe);



        AppCompatButton backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finish the current activity and return to the previous one
                finish();
            }
        });
        Button mod1Link = findViewById(R.id.mod1Link);
        mod1Link.setBackgroundColor(getResources().getColor(R.color.your_color));
        mod1Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent with the URL
                Uri webpage = Uri.parse("https://rb.gy/rmctpi");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                Uri fallbackWebpage = Uri.parse("https://rb.gy/rmctpi");
                Intent fallbackIntent = new Intent(Intent.ACTION_VIEW, fallbackWebpage);
                startActivity(fallbackIntent);
            }
        });
        AppCompatButton quizStart = findViewById(R.id.quizStart);
        quizStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the NewActivity
                Intent intent = new Intent(Module_1.this, mod1_quiz_activity.class);
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

