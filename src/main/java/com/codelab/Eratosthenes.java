package com.codelab;

/**
 *  Sieve of Eratosthenes from Cyrene.
 */
class Eratosthenes {

    public int[] primes(int max) throws Exception {

        int[] a = new int[max-1];
        for(int i = 2; i <= max; i++)
            a[i-2] = i;
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++)
                if(a[j] > 0 && a[i] > 0 && a[j] % a[i] == 0) {
                    a[j] = 0;
                }
            // p^2 >= max
            if(a[i] * a[i] >= max) { break; }
        }
        return a;
    }
}

