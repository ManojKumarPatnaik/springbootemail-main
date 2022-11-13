package com.springlearning.services;

public class Node <T>{
    private T data;
    private Node next;

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "" + data ;

    }

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
