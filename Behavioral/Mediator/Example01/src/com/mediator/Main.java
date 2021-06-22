package com.mediator;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	    Mediator mediator = new Mediator();

	    TomatoProducer producerTomato1 = new TomatoProducer("ali", BigDecimal.valueOf(4), mediator);
	    TomatoProducer producerTomato2 = new TomatoProducer("umut", BigDecimal.valueOf(3), mediator);

	    TomatoGreenGrocer greenGrocerTomato1 = new TomatoGreenGrocer("ahmet", BigDecimal.valueOf(7), mediator);
	    TomatoGreenGrocer greenGrocerTomato2 = new TomatoGreenGrocer("mehmet", BigDecimal.valueOf(6), mediator);

	    mediator.addProducer(producerTomato1);
	    mediator.addProducer(producerTomato2);
	    mediator.addGreenGrocer(greenGrocerTomato1);
	    mediator.addGreenGrocer(greenGrocerTomato2);

	    producerTomato1.sellProduct();
	    greenGrocerTomato1.takeProduct();
    }
}
