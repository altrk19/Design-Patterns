package com.command.after;

import java.math.BigDecimal;

public class AddCommand implements Operation {
    @Override
    public BigDecimal operate(BigDecimal number1, BigDecimal number2) {
        return number1.add(number2);
    }
}
