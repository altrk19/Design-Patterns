package com.iterator.before;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Math");
        List<Question> questionList = book.getQuestionList();

        print(questionList);

        EBook eBook = new EBook("Physic");
        Question[] questions = eBook.getQuestions();

        //print(questions); //COMPILE ERROR
    }

    private static void print(List<Question> questionList) {
        for (Question question : questionList) {
            Long questionNo = question.getQuestionNo();
            System.out.println("Question No : " + questionNo);
        }
    }
}
