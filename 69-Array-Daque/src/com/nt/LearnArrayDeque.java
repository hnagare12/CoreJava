package com.nt;

import java.util.ArrayDeque;

public class LearnArrayDeque {
	public static void main(String []array) {
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.offer(23);
		ad.offer(12);
		ad.offer(45);
		ad.offer(26);
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		
		System.out.println(ad.poll());
		System.out.println("poll()"+ad);
		
		System.out.println(ad.pollFirst());
		System.out.println("pollFirst"+ad);
		
		System.out.println(ad.pollLast());
		System.out.println("pollLast"+ad);
	}

}
