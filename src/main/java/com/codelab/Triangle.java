package com.codelab;

/**
 * Simple triangle class.
 */
class Triangle {

    private int[] d = new int[3];

    public Triangle(int a, int b, int c)
    {
        d[0] = a; d[1] = b; d[2] = c;
    }

    public int classify() {
        if ( d[0] <= 0 || d[1] <= 0 || d[2] <= 0) {
            return -1;
        }

        if (!isTriangle()) {
            return -1;
        }

        if (d[0] == d[1] && d[1] == d[2]) {
            return 1;
        }
        if (d[0] == d[1] || d[1] == d[2] || d[0] == d[2]) {
            return 2;
        }
        if (d[0] != d[1] && d[1] != d[2] && d[0] != d[2]) {
            return 3;
        }
        if (d[0] == 0 || d[1] == 0 || d[2] == 0
                || (d[0] + d[1] == d[2])
                || (d[0] + d[2] == d[1])
                || (d[1] + d[2] == d[0])) {
            return 4;
        }

        return 0;
    }

    private boolean isTriangle() {
        sort();
        if ((d[0] + d[1]) < d[2]) {
            return false;
        }
        return true;
    }

    private void sort() {
        int j = 1;
        int key,i;
        while (j <= d.length-1) {
            key = d[j];
            i = j-1;
            while (i >= 0 && d[i] > key) {
                d[i+1] = d[i];
                i = i-1;
            }
            d[i+1] = key;
            j = j+1;
        }
    }
}
