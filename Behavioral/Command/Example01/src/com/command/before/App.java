package com.command.before;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        BigDecimal total = Calculator.operate(OperationType.ADD, BigDecimal.TEN, BigDecimal.ONE);
        System.out.println("Total : "+ total);

        BigDecimal difference = Calculator.operate(OperationType.SUBTRACTION, BigDecimal.TEN, BigDecimal.ONE);
        System.out.println("Difference : "+ difference);

        BigDecimal pow = Calculator.operate(OperationType.POW, BigDecimal.TEN, BigDecimal.valueOf(2));
        System.out.println("Pow : "+ pow);

        BigDecimal mod = Calculator.operate(OperationType.MOD, BigDecimal.TEN, BigDecimal.valueOf(3));
        System.out.println("Mod : "+ mod);
    }
}
