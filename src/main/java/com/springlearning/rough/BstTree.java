package com.springlearning.rough;

public class BstTree {

    class Node {
        int val;
        Node left;
        Node right;

        public Node(int val, Node left, Node right) {
            this.right = right;
            this.left = left;
            this.val = val;
        }
    }

    public static void towerOfHonie(int n,String from,String to,String mid){
        if(n==1){
            System.out.print(from);
            System.out.print(mid);
            System.out.print(to);
            return;
        }
        towerOfHonie(n-1,from,mid,to);
        towerOfHonie(n-1,mid,to,from);
    }

    public static void main(String[] args) {
towerOfHonie(3,"A","C","B");
    }
    public static  Node bstTree(Node node, int val) {
        if(node.val == val)return node;
        else{
            if(node.val<val) return bstTree(node.right, val);
            else return bstTree(node.right, val);
        }

    }


}
