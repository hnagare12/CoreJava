package com.nt;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedLinstqueue {
	public static void main(String []args) {
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(12);
		queue.offer(13);
		queue.offer(14);
		queue.offer(15);
		System.out.println(queue);
		
		//delete in element and print
		System.out.println(queue.poll());
		 
		System.out.println(queue);
		
		//check to next delet number
		System.out.println(queue.peek());
		
		
	}

}
