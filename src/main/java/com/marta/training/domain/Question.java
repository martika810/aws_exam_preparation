package com.marta.training.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Question {
    private String topic;
    private String question;
    private Answers answers;

    @JsonProperty("correctAnswers")
    private List<String> correctAnswer;
    private String explanation;

    public Question(String topic, String question, Answers answers, List<String> correctAnswer, String explanation) {
        this.topic = topic;
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
        this.explanation = explanation;
    }
    public Question(){}
    public Question(String topic, String question) {
        this.topic = topic;
        this.question = question;
    }
    public String getTopic() {
        return topic;
    }

    public String getQuestion() {
        return question;
    }

    public Answers getAnswers() {
        return answers;
    }

    public List<String> getCorrectAnswer() {
        return correctAnswer;
    }

    public String getExplanation() {
        return explanation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Question question1 = (Question) o;

        if (topic != null ? !topic.equals(question1.topic) : question1.topic != null) return false;
        if (question != null ? !question.equals(question1.question) : question1.question != null) return false;
        if (answers != null ? !answers.equals(question1.answers) : question1.answers != null) return false;
        if (correctAnswer != null ? !correctAnswer.equals(question1.correctAnswer) : question1.correctAnswer != null)
            return false;
        return explanation != null ? explanation.equals(question1.explanation) : question1.explanation == null;
    }

    @Override
    public int hashCode() {
        int result = topic != null ? topic.hashCode() : 0;
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (answers != null ? answers.hashCode() : 0);
        result = 31 * result + (correctAnswer != null ? correctAnswer.hashCode() : 0);
        result = 31 * result + (explanation != null ? explanation.hashCode() : 0);
        return result;
    }
}
