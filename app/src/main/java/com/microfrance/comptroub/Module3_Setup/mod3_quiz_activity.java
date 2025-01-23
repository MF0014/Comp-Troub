package com.microfrance.comptroub.Module3_Setup;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.microfrance.comptroub.Module2_Setup.mod2_questions;
import com.microfrance.comptroub.Module2_Setup.mod2_quiz_activity;
import com.microfrance.comptroub.Module2_Setup.mod2_quiz_result;
import com.microfrance.comptroub.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mod3_quiz_activity extends AppCompatActivity {

    private TextView question;
    private TextView questions;

    private ImageView quizImage;

    private AppCompatButton option1, option2, option3;

    private AppCompatButton enter;

    Dialog dialog;

    Button btnCancel, btnNext;

    private TextView explainTxt, isCorrectTxt, correctAns;

    private boolean isOptionSelected = false;




    private final List<mod3_questions> questionsList = new ArrayList<>();

    private void questionListEraser() {

        // Reset the question tracker
        questionTracker = 0;

        // Clear the list of questions
        questionsList.clear();

    }

    private void imageDisabler() {
        quizImage.setVisibility(View.GONE);
        quizImage.setMaxHeight(0);
    }

    private void imageEnabler() {
        quizImage.setVisibility(View.VISIBLE);
        quizImage.setMaxHeight(100);
    }





    private int questionTracker = 0;

    public static int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mod3_quiz);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        questionListEraser();
        score = 0;

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the NewActivity
                questionListEraser();
                finish();
            }
        });


        Collections.shuffle(questionsList);

        //questions = findViewById(R.id.questions);
        question = findViewById(R.id.question);
        quizImage = findViewById(R.id.quizImage);

        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);

        enter = findViewById(R.id.enter);


        dialog = new Dialog(mod3_quiz_activity.this);

        dialog.setContentView(R.layout.quiz_dialog_box);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.white_bg_custom));
        dialog.setCancelable(false);

        // Move these lines after inflating the dialog layout
        btnNext = dialog.findViewById(R.id.btnNext);
        btnCancel = dialog.findViewById(R.id.btnCancel);
        explainTxt = dialog.findViewById(R.id.explainTxt);
        isCorrectTxt = dialog.findViewById(R.id.isCorrectTxt);
        correctAns = dialog.findViewById(R.id.correctAns);

        enter = findViewById(R.id.enter);
        // Set enter button initially disabled
        enter.setEnabled(false); // Disable the button initially


        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectOption(option1);
                // Enable submit button when an option is selected
                enter.setEnabled(true);
                // Highlight enter button if an option is selected
                enterBackground(enter);

            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectOption(option2);
                // Enable submit button when an option is selected
                enter.setEnabled(true);
                // Highlight enter button if an option is selected
                enterBackground(enter);
            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectOption(option3);
                // Enable submit button when an option is selected
                enter.setEnabled(true);
                // Highlight enter button if an option is selected
                enterBackground(enter);
            }
        });




        // Set click listener for "Enter" button
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitOption();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                questionListEraser();
                finish();
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextQuestion();
                dialog.dismiss();
            }
        });

        // Populate questionsList by calling the method from questionList class
        questionsList.addAll(mod3_questionLists.getQuestionsList());


        // Shuffle questionsList
        Collections.shuffle(questionsList);

        // Display the first question
        nextQuestion();
    }

    // Define the nextQuestion method outside of onCreate
    // Define the nextQuestion method outside of onCreate
    public void nextQuestion() {
        if (questionTracker < questionsList.size() && questionTracker < 5) {
            mod3_questions currentQuestion = questionsList.get(questionTracker);
            question.setText(currentQuestion.getQuestion());

            // Check if the image resource was set successfully
            if (currentQuestion.getImagePath() == 0) {
                // Image resource was not set successfully
                // Handle this case if necessary
                imageDisabler();
            } else {

                // Image resource was set successfully
                // You can add further logic here if needed

                quizImage.setImageResource(currentQuestion.getImagePath());
                Glide.with(this).load(currentQuestion.getImagePath()).into(quizImage);
                imageEnabler();

            }
            // Set the text of each button
            option1.setText(currentQuestion.getOption1());
            option2.setText(currentQuestion.getOption2());
            option3.setText(currentQuestion.getOption3());

            option1.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
            option2.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
            option3.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));



            questionTracker++;
        } else {
            // Clear the questions list before populating it
            questionListEraser();
            finish();
            Intent intent = new Intent(mod3_quiz_activity.this, mod3_quiz_result.class);
            startActivity(intent);
        }
    }


    // Method to highlight selected option
    private void selectOption(AppCompatButton selectedOption) {
        // Reset the background color of all options
        option1.setBackgroundColor(Color.GRAY);
        option2.setBackgroundColor(Color.GRAY);
        option3.setBackgroundColor(Color.GRAY);
        // Highlight the selected option
        selectedOption.setBackgroundColor(Color.YELLOW);
        enter.setVisibility(View.VISIBLE);

        // Update isOptionSelected flag
        isOptionSelected = true;

    }

    private void enterBackground(AppCompatButton enter) {
        if (isOptionSelected) {
            enter.setBackgroundColor(Color.GREEN); // Highlight enter button if an option is selected
        } else {
            enter.setBackgroundColor(Color.GRAY); // Reset enter button background if no option is selected
        }
    }


    private void resetOptionBackground() {
        option1.setBackgroundColor(Color.GRAY);
        option2.setBackgroundColor(Color.GRAY);
        option3.setBackgroundColor(Color.GRAY);
        enter.setVisibility(View.GONE);
    }

    // Method to submit selected option
    // Method to submit selected option
    private void submitOption() {
        // Get the selected option text
        String selectedOption = getSelectedOptionText();

        // Get the current question
        mod3_questions currentQuestion = questionsList.get(questionTracker - 1); // Subtract 1 because questionTracker was incremented after displaying the question

        // Determine if the selected option is correct
        boolean isCorrect = checkIfCorrect(selectedOption);

        isOptionSelected = false;
        enterBackground(enter);

        // If the selected option is correct, proceed to the next question
        if (isCorrect) {
            // Display a message indicating the answer is correct (you can also add visual feedback here)
            score += 1;
            explainTxt.setText(currentQuestion.getExplanation());
            isCorrectTxt.setText("Correct");
            correctAns.setText(currentQuestion.getAnswer());
            dialog.show();
            resetOptionBackground();
        } else {
            // Display a message indicating the answer is incorrect (you can also add visual feedback here)
            explainTxt.setText(currentQuestion.getExplanation());
            isCorrectTxt.setText("Incorrect");
            correctAns.setText(currentQuestion.getAnswer());
            dialog.show();
            // Optionally, you can allow the user to try again or provide feedback before moving to the next question
            resetOptionBackground();
        }
    }

    private String getSelectedOptionText() {
        // Implement logic to retrieve the text of the selected option
        // You can use the background color or any other indicator you set
        // For demonstration purposes, let's assume option1 is selected
        Drawable option1Background = option1.getBackground();
        Drawable option2Background = option2.getBackground();
        Drawable option3Background = option3.getBackground();

        if (option1Background instanceof ColorDrawable && ((ColorDrawable) option1Background).getColor() == Color.YELLOW) {
            return option1.getText().toString();
        } else if (option2Background instanceof ColorDrawable && ((ColorDrawable) option2Background).getColor() == Color.YELLOW) {
            return option2.getText().toString();
        } else if (option3Background instanceof ColorDrawable && ((ColorDrawable) option3Background).getColor() == Color.YELLOW) {
            return option3.getText().toString();
        }
        return "";
    }

    private boolean checkIfCorrect(String selectedOption) {
        // Get the current question
        mod3_questions currentQuestion = questionsList.get(questionTracker - 1); // Subtract 1 because questionTracker was incremented after displaying the question

        // Retrieve the correct answer for the current question
        String correctAnswer = currentQuestion.getAnswer();

        // Check if the selected option matches the correct answer
        return selectedOption.equals(correctAnswer);
    }

}
