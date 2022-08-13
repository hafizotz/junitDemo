package com.otz;

public class PrimeNumberChecker {
    public Boolean validate(final int primeNumber) {
        int halfOfPrimeNumber=primeNumber/1;
        for (int i = 2; i < halfOfPrimeNumber; i++)
            if (primeNumber % i == 0)
                return false;
        return true;
    }
}
