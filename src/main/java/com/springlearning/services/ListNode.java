package com.springlearning.services;

public class ListNode {
    private Node next;
    private Node tail;
    public  ListNode(){
        this.next=new Node("head");
        this.tail=next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "next=" + next +
                ", tail=" + tail +
                '}';
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void add(Node listNode) {
        this.next=listNode;
        this.tail=listNode;
    }
}
