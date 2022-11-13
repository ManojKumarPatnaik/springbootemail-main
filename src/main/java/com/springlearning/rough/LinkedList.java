package com.springlearning.rough;

public class LinkedList {
    Node head;

    public void insert(int val) {
        Node node = new Node();
        node.data = val;
        if (head == null) head = node;
        else {
            Node te = head;
            while (te.right != null) {
                te = te.right;
            }
            te.right = node;
        }
    }

    public void show() {
        Node node = head;
        while (node.right != null) {
            System.out.println(node.data);
            node = node.right;
        }
        System.out.println(node.data);
    }


}
