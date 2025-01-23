package com.microfrance.comptroub.Module1_Setup;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class mod1_questions {
    private String question;
    private String option1Text;
    private String option2Text;
    private String option3Text;
    private String answer;

    private String userAnswer;
    private int option1ResourceId;
    private int option2ResourceId;
    private int option3ResourceId;

    private int userImageId;


    private int correctImageId;
    private String explanation;

    private int imagePath;

    // Constructor for questions with options as strings
    public mod1_questions(String question, int imagePath, String option1Text, String option2Text, String option3Text, String userAnswer, String answer, String explanation) {
        this.question = question;
        this.imagePath = imagePath;
        this.option1Text = option1Text;
        this.option2Text = option2Text;
        this.option3Text = option3Text;
        this.userAnswer = userAnswer;
        this.answer = answer;
        this.explanation = explanation;

    }


    // Constructor for questions with options as resource IDs

    // Getter methods for question, options, and explanation
    public String getQuestion() {
        return question;
    }

    public int getImagePath() { return imagePath; }

    public String getOption1Text() {
        return option1Text;
    }

    public String getOption2Text() {
        return option2Text;
    }

    public String getOption3Text() {
        return option3Text;
    }



    public String getAnswer() {
        return answer;
    }


    public String getExplanation() { return explanation; }
//    public Drawable loadImage(Context context) {
//        Resources resources = context.getResources();
//        int resID = resources.getIdentifier(imagePath, "drawable", context.getPackageName());
//        return resources.getDrawable(resID, null);
//    }

}
