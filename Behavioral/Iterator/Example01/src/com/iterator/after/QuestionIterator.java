package com.iterator.after;

import java.util.Iterator;

public class QuestionIterator implements Iterator<Question> {
    private Question[] questions;
    private int order=0;

    public QuestionIterator(Question[] questions) {
        this.questions = questions;
    }

    @Override
    public boolean hasNext() {
        return order < questions.length;
    }

    @Override
    public Question next() {
        Question question = questions[order];
        order++;
        return question;
    }
}
