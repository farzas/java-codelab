package com.codelab;

/**
 * Algorithm from Euclid.
 */
class Euclid {

    public int gcd(int a, int b) throws Exception {
        int r;
        while (b > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

}
