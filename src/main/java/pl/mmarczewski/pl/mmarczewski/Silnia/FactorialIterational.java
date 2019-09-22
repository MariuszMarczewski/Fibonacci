package pl.mmarczewski.pl.mmarczewski.Silnia;

import java.math.BigDecimal;
import java.util.Scanner;

public class FactorialIterational implements Factorial {

    @Override
    public BigDecimal getN(int n){

        int i = 1;
        int result = 1;

        while(i <= n){
            result = result * i;
            i++;
        }

        return BigDecimal.valueOf(result);
    }
}
