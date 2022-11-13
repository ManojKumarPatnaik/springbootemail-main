package com.springlearning.rough;

public class BST {
    static int count = 0;
    static int leftSum = 0;
    static int rightSum = 0;
    static int sum = 0;


    public static Node insert(Node node, int val) {
        if (node == null) return new Node(val);
        if (val < node.data)
            node.left = insert(node.left, val);
        else if (val > node.data)
            node.right = insert(node.right, val);
        return node;
    }

    public static Node printKthSmallest(Node node, int k) {
        if (node == null) return null;
        Node left = printKthSmallest(node.left, k);
        if (left != null) return left;
        count++;
        if (count == k) return node;
        return printKthSmallest(node.right, k);

    }

    public static int sumOfNodes(Node node) {
        if (node == null) return 0;
        leftSum = sumOfNodes(node.left);
        rightSum = sumOfNodes(node.right);
        sum = node.data + leftSum + rightSum;
        return sum;
    }
}
