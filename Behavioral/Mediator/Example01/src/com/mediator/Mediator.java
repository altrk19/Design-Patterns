package com.mediator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Mediator implements IMediator {
    private List<Producer> producers;
    private List<GreenGrocer> greenGrocers;

    public Mediator() {
        this.producers = new ArrayList<>();
        this.greenGrocers = new ArrayList<>();
    }


    @Override
    public void addProducer(Producer producer) {
        producers.add(producer);
    }

    @Override
    public void addGreenGrocer(GreenGrocer greenGrocer) {
        greenGrocers.add(greenGrocer);
    }

    @Override
    public void takeFromProducer(Producer producer) {
        GreenGrocer greenGrocer = findTheMostSuitableGreenGrocer(producer.getProductType());
        trade(producer, greenGrocer);
    }


    @Override
    public void sellToGreenGrocer(GreenGrocer greenGrocer) {
        Producer producer = findTheMostSuitableProducer(greenGrocer.getProductType());
        trade(producer, greenGrocer);

    }



    private Producer findTheMostSuitableProducer(ProductType productType) {
        Producer mostSuitableProducer = null;
        for (Producer producer : producers) {
            if (productType.equals(producer.getProductType())) {
                BigDecimal productPrice = producer.getProductPrice();
                if (mostSuitableProducer == null ||
                        mostSuitableProducer.getProductPrice().compareTo(productPrice) > 0) {
                    mostSuitableProducer = producer;
                }
            }
        }
        return mostSuitableProducer;
    }

    private GreenGrocer findTheMostSuitableGreenGrocer(ProductType productType) {
        GreenGrocer mostSuitableGreenGrocer = null;
        for (GreenGrocer greenGrocer : greenGrocers) {
            if (productType.equals(greenGrocer.getProductType())) {
                BigDecimal productPrice = greenGrocer.getPrice();
                if (mostSuitableGreenGrocer == null ||
                        mostSuitableGreenGrocer.getPrice().compareTo(productPrice) < 0) {
                    mostSuitableGreenGrocer = greenGrocer;
                }
            }
        }
        return mostSuitableGreenGrocer;
    }

    private void trade(Producer producer, GreenGrocer greenGrocer) {
        System.out.println(producer.getName() + " sold " + producer.getProductType().getProductName() + " to "+ greenGrocer.getName());
    }
}
