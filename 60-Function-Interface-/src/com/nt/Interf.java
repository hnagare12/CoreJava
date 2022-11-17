package com.nt;

public interface Interf {
	public int square(int n);
}
class Test{
	public static void main(String []args) {
		
		Interf i=n ->n*n;
		//or {retun n*n;};
		System.out.println("The squre is:"+i.square(40));
		System.out.println("The squre is:"+i.square(50));
	}
}
