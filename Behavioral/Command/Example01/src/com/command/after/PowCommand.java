package com.command.after;

import java.math.BigDecimal;

public class PowCommand implements Operation {
    @Override
    public BigDecimal operate(BigDecimal number1, BigDecimal number2) {
        return number1.pow(number2.intValue());
    }
}
