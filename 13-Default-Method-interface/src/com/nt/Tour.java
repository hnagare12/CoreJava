package com.nt;

public interface Tour {
	void tour();
	default void msg()
	{
		System.out.println("Default method");
	}
}
class Mum implements Tour{
	public void tour() {
		System.out.println("Osm Mum");
	}
}


class TestInterfaceDefault{
	public static void main(String args[]){  
		Tour t=new Mum();
		t.tour();
		t.msg();
	}}
	
