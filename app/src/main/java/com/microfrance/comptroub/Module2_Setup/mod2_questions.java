package com.microfrance.comptroub.Module2_Setup;

public class mod2_questions {

    private String question, option1, option2, option3, answer, explanation;

    private String userAnswer;

    private int imagePath;



    public mod2_questions(String question, int imagePath, String option1, String option2, String option3, String answer, String userAnswer, String explanation) {
        this.question = question;
        this.imagePath = imagePath;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.answer = answer;
        this.userAnswer = userAnswer;
        this.explanation = explanation;

    }
    public int getImagePath() { return imagePath; }


    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getAnswer() {
        return answer;
    }

    public String getUserAnswer() {return userAnswer; }

    public String getExplanation() { return explanation; }
}
