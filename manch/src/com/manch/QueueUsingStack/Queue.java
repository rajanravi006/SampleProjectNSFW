package com.manch.QueueUsingStack;

import com.manch.stack.Stack;

public class Queue {
    private Stack s1;
    private Stack s2;

    public Queue() {
        this.s1 = new Stack();
        this.s2 = new Stack();
    }

    
    public void enqueue(int data) {
        s1.push(data);
    }

    public int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
