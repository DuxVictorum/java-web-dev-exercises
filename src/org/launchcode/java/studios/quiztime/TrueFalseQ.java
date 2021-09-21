package org.launchcode.java.studios.quiztime;

public class TrueFalseQ extends Question {

    boolean questionAnswer;

    public TrueFalseQ (int questionNum, String questionText, boolean questionAnswer) {
        this.questionNum = questionNum;
        this.questionText = questionText;
        this.questionAnswer = questionAnswer;
    }
//    Getters & Setters
    public boolean getQuestionAnswer() { return this.questionAnswer; }
    private void setQuestionAnswer(boolean anAnswer) {
        this.questionAnswer = anAnswer;
    }


}
