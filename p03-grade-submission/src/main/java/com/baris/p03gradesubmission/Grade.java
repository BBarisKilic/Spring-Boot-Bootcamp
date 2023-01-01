package com.baris.p03gradesubmission;

public class Grade {
    private final String name;
    private final String subject;
    private final String score;

    public Grade(String name, String subject, String score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getScore() {
        return this.score;
    }

}
