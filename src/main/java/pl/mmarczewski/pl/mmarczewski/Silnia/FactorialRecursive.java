package pl.mmarczewski.pl.mmarczewski.Silnia;

import java.math.BigDecimal;

public class FactorialRecursive implements Factorial {

    @Override
    public BigDecimal getN(int n) {

        if (n == 0)
            return BigDecimal.valueOf(1);
        else
            return getN(n).multiply(getN(n - 2));
    }
}
