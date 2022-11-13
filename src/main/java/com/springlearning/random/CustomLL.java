package com.springlearning.random;

class Node{
    private String name;
     Node next;
    Node(String data){
        this.name = data;
    }
}
public class CustomLL {
    Node head;
    Node tail;
    int length;

    public CustomLL(String data) {
        Node node=new Node(data);
        this.head = node;
        this.tail = node;
        this.length = 1;
    }
    public void add(String data){
        Node node=new Node(data);

        if(length==0) {
            head = node;
            tail = node;
        }else{
        tail.next = node;
            tail = node;
        }length++;
    }

    public Node removeLast(){
        if(length==0) return  null;
        Node t=head;
        Node pre=head;
        while(t.next != null){
            pre = t;
            t = t.next;
        }
        t=pre;
        t.next=null;
        length--;
        if(length==0) {
            tail = null;
            head = null;
        }return t;
    }

}
