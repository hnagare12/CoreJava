package com.nt;

import java.util.PriorityQueue;

public class demo {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.offer(10);//insertion order is not maintaind & always 1st element is smallest
		pq.add(20);//add method present in collection
		pq.offer(30);//default capacity is 11
		pq.offer(50);//available from 1.5v
	//	pq.offer("Java");//it will not heterogenous element
		pq.offer(20);//it is  not syncronized 
		//pq.offer(null);// it will not allow null 
		pq.offer(18);
		System.out.println(pq);
		
	}

}
