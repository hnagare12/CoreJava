package com.nt;

public interface Interf {
	public void m1() ;

}
class Test{
	 public static void main(String[] args) {  
		 Interf i=() ->
		 System.out.println("m1 lambda impletation");
		 i.m1();
	 }
}
