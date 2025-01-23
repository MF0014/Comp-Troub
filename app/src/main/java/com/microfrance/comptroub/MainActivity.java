package com.microfrance.comptroub;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


import com.bumptech.glide.Glide;
import com.microfrance.comptroub.MainActivity;
import com.microfrance.comptroub.Module1_Setup.Module_1;
import com.microfrance.comptroub.Module2_Setup.Module_2;
import com.microfrance.comptroub.Module3_Setup.Module_3;
import com.microfrance.comptroub.Module4_Setup.Module_4;
import com.microfrance.comptroub.Module5_Setup.Module_5;
import com.microfrance.comptroub.Module6_Setup.Module_6;
import com.microfrance.comptroub.Module7_Setup.Module_7;
import com.microfrance.comptroub.Module8_Setup.Module_8;
import com.microfrance.comptroub.R;

public class MainActivity extends AppCompatActivity {

    // Define SharedPreferences file name
    private static final String SHARED_PREFS_NAME = "user_progress";
    private static final String MOD1_INFO = "mod1_info";

    LinearLayout moduleOneButton, moduleTwoButton, moduleThreeButton, moduleFourButton, moduleFiveButton, moduleSixButton, moduleSevenButton, moduleEightButton;
    ImageButton module1Button, module2Button, module3Button, module4Button, module5Button, module6Button, module7Button, module8Button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        moduleOneButton = findViewById(R.id.moduleOneButton);
        module1Button = findViewById(R.id.module1Button);
        moduleTwoButton = findViewById(R.id.moduleTwoButton); // Add this line
        module2Button = findViewById(R.id.module2Button); // Add this line
        moduleThreeButton = findViewById(R.id.moduleThreeButton);
        module3Button = findViewById(R.id.module3Button);
        moduleFourButton = findViewById(R.id.moduleFourButton); // Add this line
        module4Button = findViewById(R.id.module4Button); // Add this line
        moduleFiveButton = findViewById(R.id.moduleFiveButton);
        module5Button = findViewById(R.id.module5Button);
        moduleSixButton = findViewById(R.id.moduleSixButton); // Add this line
        module6Button = findViewById(R.id.module6Button); // Add this line
        moduleSevenButton = findViewById(R.id.moduleSevenButton);
        module7Button = findViewById(R.id.module7Button);
        module8Button = findViewById(R.id.module8Button);
        moduleEightButton = findViewById(R.id.moduleEightButton);


    }

    @Override
    protected void onResume() {
        // Update the UI when the activity is resumed

        setupModule1Button(moduleOneButton, module1Button);
        setupModule2Button(moduleTwoButton, module2Button);
        setupModule3Button(moduleThreeButton, module3Button);
        setupModule4Button(moduleFourButton, module4Button);
        setupModule5Button(moduleFiveButton, module5Button);
        setupModule6Button(moduleSixButton, module6Button);
        setupModule7Button(moduleSevenButton, module7Button);
        setupModule8Button(moduleEightButton, module8Button);
        super.onResume();
    }

    private void setupModule1Button(LinearLayout moduleOneButton, ImageButton module1Button) {
        SharedPreferences module1_progress = getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE);
        boolean module1Completed = module1_progress.getBoolean("module101Completed", false);
        int module1Score = module1_progress.getInt("module101Score", 0);

        if (!module1Completed) {
            // Set button background color to default
                moduleOneButton.setBackgroundColor(Color.TRANSPARENT);
                module1Button.setBackgroundColor(Color.TRANSPARENT);
        } else {
            if (module1Score == 5) {
                moduleOneButton.setBackgroundColor(Color.GREEN);
                module1Button.setBackgroundColor(Color.GREEN);
            } else {
                moduleOneButton.setBackgroundColor(Color.YELLOW);
                module1Button.setBackgroundColor(Color.YELLOW);
            }
        }

        moduleOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to Module 1 activity
                Intent intent = new Intent(MainActivity.this, Module_1.class);
                // Pass the module1Score to Module 1 activity
                intent.putExtra("module1Score", module1Score);
                startActivity(intent);
            }
        });
        module1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to Module 1 activity
                Intent intent = new Intent(MainActivity.this, Module_1.class);
                // Pass the module1Score to Module 1 activity
                intent.putExtra("module1Score", module1Score);
                startActivity(intent);
            }
        });
    }




// Module 2 Button


    private void setupModule2Button(LinearLayout moduleTwoButton, ImageButton module2Button) {
        SharedPreferences module2_progress = getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE);
        boolean module2Completed = module2_progress.getBoolean("module2Completed", false); // Use specific key for Module 2 completion
        int module2Score = module2_progress.getInt("module2Score", 0); // Use specific key for Module 2 score

        if (module2Completed) {
            // Set button background color to indicate completion
            if (module2Score == 5) {
                moduleTwoButton.setBackgroundColor(Color.GREEN);
                module2Button.setBackgroundColor(Color.GREEN);
            } else {
                moduleTwoButton.setBackgroundColor(Color.YELLOW);
                module2Button.setBackgroundColor(Color.YELLOW);
            }
        } else {
            // Set button background color to default
            moduleTwoButton.setBackgroundColor(Color.TRANSPARENT);
            module2Button.setBackgroundColor(Color.TRANSPARENT);
        }

        moduleTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to Module 2 activity
                Intent intent = new Intent(MainActivity.this, Module_2.class);
                // Pass the module2Score to Module 2 activity
                intent.putExtra("module2Score", module2Score);
                startActivity(intent);
            }
        });
        module2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to Module 2 activity
                Intent intent = new Intent(MainActivity.this, Module_2.class);
                // Pass the module2Score to Module 2 activity
                intent.putExtra("module2Score", module2Score);
                startActivity(intent);
            }
        });
    }

    // Module 3 Button
    private void setupModule3Button(LinearLayout moduleThreeButton, ImageButton module3Button) {
        SharedPreferences module3_progress = getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE);
        boolean module3Completed = module3_progress.getBoolean("module3Completed", false); // Use specific key for Module 2 completion
        int module3Score = module3_progress.getInt("module3Score", 0); // Use specific key for Module 2 score

        if (module3Completed) {
            // Set button background color to indicate completion
            if (module3Score == 5) {
                moduleThreeButton.setBackgroundColor(Color.GREEN);
                module3Button.setBackgroundColor(Color.GREEN);
            } else {
                moduleThreeButton.setBackgroundColor(Color.YELLOW);
                module3Button.setBackgroundColor(Color.YELLOW);
            }
        } else {
            // Set button background color to default
            moduleThreeButton.setBackgroundColor(Color.TRANSPARENT);
            module3Button.setBackgroundColor(Color.TRANSPARENT);
        }

        moduleThreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to Module 2 activity
                Intent intent = new Intent(MainActivity.this, Module_3.class);
                // Pass the module2Score to Module 2 activity
                intent.putExtra("module3Score", module3Score);
                startActivity(intent);
            }
        });
        module3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to Module 2 activity
                Intent intent = new Intent(MainActivity.this, Module_3.class);
                // Pass the module2Score to Module 2 activity
                intent.putExtra("module3Score", module3Score);
                startActivity(intent);
            }
        });
    }


    // Module 4 Button
    private void setupModule4Button(LinearLayout moduleFourButton, ImageButton module4Button) {
        SharedPreferences module4_progress = getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE);
        boolean module4Completed = module4_progress.getBoolean("module4Completed", false); // Use specific key for Module 4 completion
        int module4Score = module4_progress.getInt("module4Score", 0); // Use specific key for Module 4 score

        if (module4Completed) {
            // Set button background color to indicate completion
            if (module4Score == 5) {
                moduleFourButton.setBackgroundColor(Color.GREEN);
                module4Button.setBackgroundColor(Color.GREEN);
            } else {
                moduleFourButton.setBackgroundColor(Color.YELLOW);
                module4Button.setBackgroundColor(Color.YELLOW);
            }
        } else {
            // Set button background color to default
            moduleFourButton.setBackgroundColor(Color.TRANSPARENT);
            module4Button.setBackgroundColor(Color.TRANSPARENT);
        }

        moduleFourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to Module 4 activity
                Intent intent = new Intent(MainActivity.this, Module_4.class);
                // Pass the module4Score to Module 4 activity
                intent.putExtra("module4Score", module4Score);
                startActivity(intent);
            }
        });
        module4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to Module 4 activity
                Intent intent = new Intent(MainActivity.this, Module_4.class);
                // Pass the module4Score to Module 4 activity
                intent.putExtra("module4Score", module4Score);
                startActivity(intent);
            }
        });
    }
            // Module 5 Button
    private void setupModule5Button(LinearLayout moduleFiveButton, ImageButton module5Button) {
        Glide.with(this).load(R.drawable.module5_logo2).into(module5Button);
        SharedPreferences module5_progress = getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE);
        boolean module5Completed = module5_progress.getBoolean("module5Completed", false); // Use specific key for Module 5 completion
        int module5Score = module5_progress.getInt("module5Score", 0); // Use specific key for Module 5 score

        if (module5Completed) {
            // Set button background color to indicate completion
            if (module5Score == 5) {
                moduleFiveButton.setBackgroundColor(Color.GREEN);
                module5Button.setBackgroundColor(Color.GREEN);
            } else {
                moduleFiveButton.setBackgroundColor(Color.YELLOW);
                module5Button.setBackgroundColor(Color.YELLOW);
            }
        } else {
            // Set button background color to default
            moduleFiveButton.setBackgroundColor(Color.TRANSPARENT);
            module5Button.setBackgroundColor(Color.TRANSPARENT);
        }

        moduleFiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to Module 5 activity
                Intent intent = new Intent(MainActivity.this, Module_5.class);
                // Pass the module5Score to Module 5 activity
                intent.putExtra("module5Score", module5Score);
                startActivity(intent);
            }
        });
        module5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to Module 5 activity
                Intent intent = new Intent(MainActivity.this, Module_5.class);
                // Pass the module5Score to Module 5 activity
                intent.putExtra("module5Score", module5Score);
                startActivity(intent);
            }
        });
    }



            // Module 6 Button
    private void setupModule6Button(LinearLayout moduleSixButton, ImageButton module6Button) {
        SharedPreferences module6_progress = getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE);
        boolean module6Completed = module6_progress.getBoolean("module6Completed", false); // Use specific key for Module 6 completion
        int module6Score = module6_progress.getInt("module6Score", 0); // Use specific key for Module 6 score

        if (module6Completed) {
            // Set button background color to indicate completion
            if (module6Score == 5) {
                moduleSixButton.setBackgroundColor(Color.GREEN);
                module6Button.setBackgroundColor(Color.GREEN);
            } else {
                moduleSixButton.setBackgroundColor(Color.YELLOW);
                module6Button.setBackgroundColor(Color.YELLOW);
            }
        } else {
            // Set button background color to default
            moduleSixButton.setBackgroundColor(Color.TRANSPARENT);
            module6Button.setBackgroundColor(Color.TRANSPARENT);
        }

        moduleSixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to Module 6 activity
                Intent intent = new Intent(MainActivity.this, Module_6.class);
                // Pass the module6Score to Module 6 activity
                intent.putExtra("module6Score", module6Score);
                startActivity(intent);
            }
        });
        module6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to Module 6 activity
                Intent intent = new Intent(MainActivity.this, Module_6.class);
                // Pass the module6Score to Module 6 activity
                intent.putExtra("module6Score", module6Score);
                startActivity(intent);
            }
        });
    }



            // Module 7 Button
    private void setupModule7Button(LinearLayout moduleSevenButton, ImageButton module7Button) {
        SharedPreferences module7_progress = getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE);
        boolean module7Completed = module7_progress.getBoolean("module7Completed", false); // Use specific key for Module 7 completion
        int module7Score = module7_progress.getInt("module7Score", 0); // Use specific key for Module 7 score

        if (module7Completed) {
            // Set button background color to indicate completion
            if (module7Score == 5) {
                moduleSevenButton.setBackgroundColor(Color.GREEN);
                module7Button.setBackgroundColor(Color.GREEN);
            } else {
                moduleSevenButton.setBackgroundColor(Color.YELLOW);
                module7Button.setBackgroundColor(Color.YELLOW);
            }
        } else {
            // Set button background color to default
            moduleSevenButton.setBackgroundColor(Color.TRANSPARENT);
            module7Button.setBackgroundColor(Color.TRANSPARENT);
        }

        moduleSevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to Module 7 activity
                Intent intent = new Intent(MainActivity.this, Module_7.class);
                // Pass the module7Score to Module 7 activity
                intent.putExtra("module7Score", module7Score);
                startActivity(intent);
            }
        });
        module7Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to Module 7 activity
                Intent intent = new Intent(MainActivity.this, Module_7.class);
                // Pass the module7Score to Module 7 activity
                intent.putExtra("module7Score", module7Score);
                startActivity(intent);
            }
        });
    }


            // Module 8 Button
    private void setupModule8Button(LinearLayout moduleEightButton, ImageButton module8Button){
        SharedPreferences module8_progress = getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE);
        boolean module8Completed = module8_progress.getBoolean("module8Completed", false); // Use specific key for Module 8 completion
        int module8Score = module8_progress.getInt("module8Score", 0); // Use specific key for Module 8 score

        if (module8Completed) {
            // Set button background color to indicate completion
            if (module8Score == 5) {
                moduleEightButton.setBackgroundColor(Color.GREEN);
                module8Button.setBackgroundColor(Color.GREEN);
            } else {
                moduleEightButton.setBackgroundColor(Color.YELLOW);
                module8Button.setBackgroundColor(Color.YELLOW);
            }
        } else {
            // Set button background color to default
            moduleEightButton.setBackgroundColor(Color.TRANSPARENT);
            module8Button.setBackgroundColor(Color.TRANSPARENT);
        }

        moduleEightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to Module 8 activity
                Intent intent = new Intent(MainActivity.this, Module_8.class);
                // Pass the module8Score to Module 8 activity
                intent.putExtra("module8Score", module8Score);
                startActivity(intent);
            }
        });
        module8Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to Module 8 activity
                Intent intent = new Intent(MainActivity.this, Module_8.class);
                // Pass the module8Score to Module 8 activity
                intent.putExtra("module8Score", module8Score);
                startActivity(intent);
            }
        });


    }
}
