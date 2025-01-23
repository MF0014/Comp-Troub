package com.microfrance.comptroub;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.github.chrisbanes.photoview.PhotoView;

public class imgviewer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Enable edge-to-edge content (if needed)
        EdgeToEdge.enable(this);

        // Set the layout
        setContentView(R.layout.activity_imgviewer);

        // Apply window insets listener for padding adjustments
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Load image into PhotoView using Glide
       // PhotoView photoView = findViewById(R.id.photo_view);
        //Glide.with(this).load(R.drawable.mod1_replug).into(photoView);
    }
}
