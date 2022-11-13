package com.springlearning.rough.algo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PostFix {
    public static void main(String[] args) {
        String st = "100 200 + 2 / 5 * 7 +";
        var stack = new Stack<Integer>();
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            if (c == ' ') continue;
            else if (Character.isDigit(c)) {
                int n = 0;
                while (Character.isDigit(c)) {
                    n = n * 10 + (c - '0');
                    i++;
                    c = st.charAt(i);
                }
                i--;
                stack.push(n);
            } else {
                var v1 = stack.pop();
                var v2 = stack.pop();
                switch (c) {
                    case '+' -> stack.push(v2 + v1);
                    case '-' -> stack.push(v2 - v1);
                    case '*' -> stack.push(v2 * v1);
                    case '/' -> stack.push(v2 / v1);
                }
            }
        }
        System.out.println(stack.pop());
    }

    public boolean isUnique(String st) {
        if (st.length() > 26) return false;
        var set = new HashSet<String>();
//        for (var v : st.toCharArray()) {
//            if (set.contains(v)) return false;
//            else set.add(v);
//        }
//        System.out.println(Stream.of(st.toCharArray()).filter(i-> Collections.frequency(st.codePoints(),Ini)>1).count());
        return true;
    }

    public int maxLength(List<String> arr) {
        var A = new ArrayList<String>();
        A.add("");
        for (var s : arr) {
            if (!isUnique(s)) continue;
            var t = new ArrayList<String>();
            for (var c : A) {
                String temp = c + s;
                if (isUnique(temp)) t.add(temp);
            }
            A.addAll(t);
        }
        return A.stream().max(Comparator.comparingInt(String::length)).get().length();
    }
}
