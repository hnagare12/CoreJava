package com.nt;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

	public static void main(String[] args) {
		//small element first print automatically
		Queue<Integer> pq = new PriorityQueue<>();
		pq.offer(40);
		pq.offer(60);
		pq.offer(34);
		pq.offer(24);
		System.out.println(pq);
		
		//delete element 
		pq.poll();
		System.out.println(pq);
		
		//which element is next delete show
		System.out.println(pq.peek());

	}

}
