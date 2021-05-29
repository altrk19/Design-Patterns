package com.command.after;

import java.math.BigDecimal;

public interface Operation {
    BigDecimal operate(BigDecimal number1, BigDecimal number2);
}
