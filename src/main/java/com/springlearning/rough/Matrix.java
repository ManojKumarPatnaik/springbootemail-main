package com.springlearning.rough;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int A[][] = {{1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9}};
        int n = A.length;
        for (int l = 0; l < n / 2; l++) {
            int f = l;
            int last = n - 1 - l;
            for (int i = f; i < last; i++) {
                int offset = i - f;
                int top = A[f][i];
                A[f][i] = A[last - offset][f];
                A[last - offset][f] = A[last][last - offset];
                A[last][last - offset] = A[i][last];
                A[i][last] = top;

            }

        }
        System.out.println(Arrays.deepToString(A));
    }
}
