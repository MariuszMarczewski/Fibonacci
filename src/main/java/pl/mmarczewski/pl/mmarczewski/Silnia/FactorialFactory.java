package pl.mmarczewski.pl.mmarczewski.Silnia;

import pl.mmarczewski.pl.mmarczewski.fibonacci.AlgorithmType;

public class FactorialFactory {
    public Factorial produce(AlgorithmType type){

        if(AlgorithmType.RECURSIVE.equals(type)){
            return new FactorialRecursive();
        }

        if(AlgorithmType.ITERATIONAL.equals(type)){
            return new FactorialIterational();
        }

        return null;
    }
}
