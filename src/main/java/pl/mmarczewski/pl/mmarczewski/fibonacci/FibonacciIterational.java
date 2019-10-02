package pl.mmarczewski.pl.mmarczewski.fibonacci;

import java.math.BigDecimal;

public class FibonacciIterational implements Fibonacci {

    @Override
    public BigDecimal getN(int n) {

        validateArgument(n);

        BigDecimal result1 = new BigDecimal(0);

        BigDecimal prev = new BigDecimal(1);
        for(int i = 1; i <= n; i++){
            BigDecimal temp = result1;
            result1 = result1.add(prev);
            prev = temp;
        }

        return result1;
    }
}
