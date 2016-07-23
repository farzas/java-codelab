package com.codelab;

/**
 * Horner's method.
 */
class Horner {

    public static int solve(String[] args) throws Exception {
        int y = 0;
        int i = Integer.parseInt( args[0] );
        int x = Integer.parseInt( args[1] );
        int k = 0;
        int[] a = new int[i+1];

        for (int n = 2; n <= 2+i; n++) {
            a[k] = Integer.parseInt(args[n]);
            k = k + 1;
        }

        while (i >= 0) {
            y = a[i] + x * y;
            i = i - 1;
        }
        return y;
    }
}
