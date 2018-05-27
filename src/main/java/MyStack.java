package main.java;

import java.util.List;

public class MyStack<E> {


    private List<E> stack;

    public MyStack() {
        stack = new java.util.Stack<>();
    }

    public void pushAll(Iterable<? extends E> src) {
        for (E e : src) {
            stack.add(e);
        }
    }
}



