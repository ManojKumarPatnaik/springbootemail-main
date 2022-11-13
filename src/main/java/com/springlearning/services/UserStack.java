package com.springlearning.services;

import java.io.Serializable;

public class UserStack<T  extends Object & Serializable> {
    T[] stack;

    {
        stack = (T[]) new Object[5];
    }

    int top=-1;
    public void push(T data){
        top++;
        stack[top]=data;

    }
    public T pop(){
        T val=stack[top];
        stack[top]=null;
        top--;
        return val;
    }



    public T peek(){
        return stack[top];
    }
    public void show(){
        for (var v :stack) {
            System.out.print(v+" ");
        }
        System.out.println();
    }
}
