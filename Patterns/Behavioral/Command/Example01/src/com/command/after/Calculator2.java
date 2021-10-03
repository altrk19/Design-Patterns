package com.command.after;

import java.math.BigDecimal;

public class Calculator2 {
    public static BigDecimal operate(Operation operation, BigDecimal number1, BigDecimal number2) {
        return operation.operate(number1, number2);
    }
}
