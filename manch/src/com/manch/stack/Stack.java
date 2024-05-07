package com.manch.stack;

public class Stack {
	private SingleLinkedList top;
	
	public Stack() {
		this.top = null;
	}
	
	public void push(int data) {
        SingleLinkedList newNode = new SingleLinkedList(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.nextNode = top;
            top = newNode;
        }
	}
	 public int pop() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty");
	        }
	        int data = top.data;
	        top = top.nextNode;;
	        return data;
	    }

	    public int peek() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty");
	        }
	        return top.data;
	    }
	    
	    public boolean isEmpty() {
	        return top == null;
	    }

}
