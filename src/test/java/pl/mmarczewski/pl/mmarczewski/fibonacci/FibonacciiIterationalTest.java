package pl.mmarczewski.pl.mmarczewski.fibonacci;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class FibonacciiIterationalTest {

    private Fibonacci fibonacci = new FibonacciIterational();

    @Test
    public void shouldReturn8WhenNIs6() {

//        given
        final int n = 6;
        final BigDecimal expectedVal = new BigDecimal(8);

//     when
        BigDecimal result = fibonacci.getN(n);

//     then
        assertEquals(expectedVal, result);
    }

    @Test
    public void shouldReturn0WhenNIs0() {

//        given
        final int n = 0;
        final BigDecimal expectedVal = new BigDecimal(0);

//     when
        BigDecimal result = fibonacci.getN(n);

//     then
        assertEquals(expectedVal, result);

    }

    @Test
    public void shouldReturn1WhenNIs1() {

//        given
        final int n = 0;
        final BigDecimal expectedVal = new BigDecimal(0);

//     when
        BigDecimal result = fibonacci.getN(n);

//     then
        assertEquals(expectedVal, result);
    }

    @Test(expected = FibonacciArgumentException.class)
    public void shouldReturnException1WhenNIsNegative() {

//        given
        final int n = -10;

//     when
        BigDecimal result = fibonacci.getN(n);
    }

    @Test
    public void shouldReturnException1WhenNIsNegativeAlt(){
//        given
        final int n = -6;

//        when
       try {
           BigDecimal result = fibonacci.getN(n);
           fail("wyjątek nie został rzucony");
       } catch (FibonacciArgumentException e) {
//           wyrzucono wyjątek
       }
    }
}

