package com.command.after;

import java.math.BigDecimal;

public class App2 {
    public static void main(String[] args) {
        BigDecimal total = Calculator2.operate(new AddCommand(), BigDecimal.TEN, BigDecimal.ONE);
        System.out.println("Total : " + total);

        BigDecimal difference = Calculator2.operate(new SubtractionCommand(), BigDecimal.TEN, BigDecimal.ONE);
        System.out.println("Difference : " + difference);

        BigDecimal pow = Calculator2.operate(new PowCommand(), BigDecimal.TEN, BigDecimal.ONE);
        System.out.println("Pow : " + pow);

        BigDecimal mod = Calculator2.operate(new ModCommand(), BigDecimal.TEN, BigDecimal.ONE);
        System.out.println("Mod : " + mod);
    }
}
