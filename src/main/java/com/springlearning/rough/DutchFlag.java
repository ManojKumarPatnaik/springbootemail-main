package com.springlearning.rough;

import java.util.*;

public class DutchFlag {


    public static void main(String[] args) {

        int A[] = {0, 1, 2, 0, 2, 1, 1, 1, 0, 0, 0, 0, 2, 1, 2, 2, 2, 2, 1, 0};
        int i = 0, j = 0, k = A.length - 1, p = 1;

        while (j <= k) {
            if (A[j] < p) {
                swap(A, i, j);
                i++;
                j++;
            } else if (A[j] > p) {
                swap(A, j, k);
                k--;
            } else j++;
        }
        System.out.println(Arrays.toString(A));
    }

    public static void swap(int A[], int i, int j) {
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }
}
