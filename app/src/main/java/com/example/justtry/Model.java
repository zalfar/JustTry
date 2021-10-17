package com.example.justtry;

public class Model {
    private String date, question, title, topic;

    public Model(){}

    public Model(String date, String question, String title, String topic) {
        this.date = date;
        this.question = question;
        this.title = title;
        this.topic = topic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
