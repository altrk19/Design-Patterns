package com.strategy;

public class App {

    public static void main(String[] args) {
	    Context context = new Context();
	    context.setCommunicate(new Email());
	    context.sendMessage();

	    context.setCommunicate(new Sms());
	    context.sendMessage();
    }
}
