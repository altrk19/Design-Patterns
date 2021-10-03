package com.iterator.after;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Chemistry");
        print(book.getQuestionIterator());
        EBook eBook = new EBook("Biology");
        print(eBook.getQuestionIterator());



    }
    private static void print(Iterator<Question> questionIterator){
        while(questionIterator.hasNext()){
            Question question = questionIterator.next();
            System.out.println(question.getQuestionNo());
        }
    }
}
