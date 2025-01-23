package com.microfrance.comptroub.sample;

public class questions {
    private String question;
    private String option1Text;
    private String option2Text;
    private String option3Text;
    private int option1ResourceId;
    private int option2ResourceId;
    private int option3ResourceId;
    private String correctOption;
    private String explanation;

    // Constructor for questions with options as strings
    public questions(String question, String option1Text, String option2Text, String option3Text, String correctOption, String explanation) {
        this.question = question;
        this.option1Text = option1Text;
        this.option2Text = option2Text;
        this.option3Text = option3Text;
        this.correctOption = correctOption;
        this.explanation = explanation;
    }

    // Constructor for questions with options as resource IDs
    public questions(String question, int option1ResourceId, int option2ResourceId, int option3ResourceId,  String correctOption, String explanation) {
        this.question = question;
        this.option1ResourceId = option1ResourceId;
        this.option2ResourceId = option2ResourceId;
        this.option3ResourceId = option3ResourceId;
        this.correctOption = correctOption;
        this.explanation = explanation;
    }

    // Getter methods for question, options, and explanation
    public String getQuestion() {
        return question;
    }

    public String getOption1Text() {
        return option1Text;
    }

    public String getOption2Text() {
        return option2Text;
    }

    public String getOption3Text() {
        return option3Text;
    }

    public int getOption1ResourceId() {
        return option1ResourceId;
    }

    public int getOption2ResourceId() {
        return option2ResourceId;
    }

    public int getOption3ResourceId() {
        return option3ResourceId;
    }

    public String getCorrectOption() {
        return correctOption;
    }

    public String getExplanation() {
        return explanation;
    }
}
