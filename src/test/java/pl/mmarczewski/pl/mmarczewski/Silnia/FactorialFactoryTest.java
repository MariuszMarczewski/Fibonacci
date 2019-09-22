package pl.mmarczewski.pl.mmarczewski.Silnia;

import org.junit.Test;
import pl.mmarczewski.pl.mmarczewski.fibonacci.AlgorithmType;
import pl.mmarczewski.pl.mmarczewski.fibonacci.Fibonacci;
import pl.mmarczewski.pl.mmarczewski.fibonacci.FibonacciFactory;

import static org.junit.Assert.*;

public class FactorialFactoryTest {

    private FactorialFactory factory = new FactorialFactory();

    @Test
    public void shouldProduceIerational(){


//        given
    final AlgorithmType type = AlgorithmType.ITERATIONAL;

//        when

    Factorial result = factory.produce(type);


    //        then
    assertTrue(result instanceof Factorial);
    assertTrue(result instanceof FactorialIterational);
    assertFalse(result instanceof FactorialRecursive);

}

    @Test
    public void shouldProduceRecursive() {


//        given
        final AlgorithmType type = AlgorithmType.RECURSIVE;

//        when

        Factorial result = factory.produce(type);


//        then
        assertTrue(result instanceof Factorial);
        assertTrue(result instanceof FactorialRecursive);
        assertFalse(result instanceof FactorialIterational);

    }

}