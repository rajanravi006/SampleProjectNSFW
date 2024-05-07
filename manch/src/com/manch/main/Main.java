package com.manch.main;

import com.manch.QueueUsingStack.Queue;

public class Main {
	
	public static void main(String[] args) {
		
		    Queue queue = new Queue();
		    
		    // Enqueue elements
	        queue.enqueue(1);
	        queue.enqueue(2);
	        queue.enqueue(3);

	        // Dequeue and print elements
	        System.out.println(queue.dequeue()); // Output: 1
	        System.out.println(queue.dequeue()); // Output: 2

	        // Enqueue more elements
	        queue.enqueue(4);

	        // Peek and print elements
	        System.out.println(queue.peek()); // Output: 3
	        System.out.println(queue.dequeue()); // Output: 3
	        System.out.println(queue.dequeue()); // Output: 4

	        // Check if queue is empty
	        System.out.println(queue.isEmpty()); 
		
	}

}
