package com.springlearning.learning;

import java.util.Arrays;
import java.util.List;

public class AlgoDemo {
    public static void main(String[] args) {
        args = List.of("Manoj", "kumar", "df", "jbdh", "djbdh", "jbdh", "djbdh").toArray(new String[50]);
        args[0] = "changesanges";
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 4, 4, 6, 77, 9};
        System.out.println(args[0].subSequence(0, 3));

        System.out.println(A.length);
        long count = Arrays.stream(A).distinct().boxed().filter(i -> i % 2 == 0).count();
        System.out.println(count);
    }
}
