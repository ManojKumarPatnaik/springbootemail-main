package com.springlearning.rough;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {




    public static void main(String[] args) {
        var var = new ArrayList<>(List.of(new Student("name", 1), new Student("Manoj", 2),
                new Student("mame", 1)));
        var v4=new HashSet<>(List.of(new Student("name", 1), new Student("Manoj", 2),
                new Student("name", 1)));
        var.sort(new MyComparartor());
        System.out.println(var);
        System.out.println(v4);

        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i <= (A.length - 2) / 2; i++) {
            if (A[i] > A[2 * i + 1] || A[i] > A[2 * i + 2]) System.out.println(false);
        }
        System.out.println(true);
        LinkedList linkedList = new LinkedList();
        for (var v : A) {
            linkedList.insert(v);
        }
        linkedList.show();
        Node node = null;
        for (var v : A) {
            node = BST.insert(node, v);
        }
        int k = 9;
//        System.out.println(BST.printKthSmallest(node, k).data);
//        System.out.println(BST.sumOfNodes(node));

    }
}
