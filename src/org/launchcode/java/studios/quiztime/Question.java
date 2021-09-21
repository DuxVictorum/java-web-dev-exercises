package org.launchcode.java.studios.quiztime;

public abstract class Question {
    int questionNum;
    String questionText;

//  Getters & Setters
    public int getQuestionNum() {
        return questionNum;
    }
    public String getQuestionText() {
        return questionText;
    }
    public void setQuestionText(String newQuestion) {
        questionText = newQuestion;
    }
}


// T/F - Kris has two cats. (T)