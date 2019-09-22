package pl.mmarczewski.pl.mmarczewski.Silnia;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class FactorialRecursiveTest {

    private Factorial factorial = new FactorialIterational();

    @Test
    public void shouldReturn24WhenIs4() {

//        given
        final int n = 4;
        final BigDecimal expectedValue = new BigDecimal(24);

//        when
        BigDecimal result = factorial.getN(n);

//        then
        assertEquals(expectedValue, result);
    }

}