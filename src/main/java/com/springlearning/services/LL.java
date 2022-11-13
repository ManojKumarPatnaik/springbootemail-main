package com.springlearning.services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.stream.Collectors;

public class LL {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public int[] findErrorNums(int[] nums) {
        var st = new HashSet<Integer>();
        int dup = Arrays.stream(nums).boxed().filter(i -> !st.add(i)).toList().get(0), n = nums.length, s = (n * (n + 1)) / 2, ts = Arrays.stream(nums).sum();
        return new int[]{dup, s - (ts - dup)};
    }

    public static void reverse() {
        Node next;


    }

    public static void main(String[] args) {
        LL ll = new LL();
        ll.addFirst("1");
        ll.addFirst("2");
        ll.addFirst("3");
//        System.out.println(ll.serach("2"));
//        System.out.println(climbing(5));
        System.out.println(primeNumbers(25));
    }

    private void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static boolean primeNumbers(int n) {

        if (n % 2 == 0 || n == 1) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int climbing(int n) {
        if (n <= 2) return n;
        int[] memo = new int[n + 1];
        memo[1] = 1;
        memo[2] = 2;
        for (int i = 3; i <= n; i++) {
            memo[i] = memo[i - 2] + memo[i - 1];
        }
        return memo[n];
    }

    public boolean serach(String t) {
        Node current = head;
        while (current != null) {
            if (Objects.equals(current.data, t)) return true;
            current = current.next;
        }
        return false;
    }
}
