package main.java;

import java.util.Stack;

public class TaleOfTwoStacks {

    Stack a;
    Stack b;

    TaleOfTwoStacks() {
        a = new Stack();
        b = new Stack();
    }

    protected void enqueue(int t) {
        a.push(t);
    }

    protected void dequeue() {
        if (b.isEmpty()) {
            while (!a.isEmpty()) {
                b.push(a.pop());
            }
        }
        b.pop();
    }

    protected String peek() {
        if (b.isEmpty()) {
            while (!a.isEmpty()) {
                b.push(a.pop());
            }
        }
        return b.peek().toString();

    }
}
