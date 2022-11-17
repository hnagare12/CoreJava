package com.nt;


public class Man {
	 void walk()
	{
		System.out.println("walking");
	}
}
	
	class Wife extends Man{
		void marri() {
			System.out.println("marri");
		}
	}
	
	class Baby extends Wife{
		 void cring() {
			System.out.println("craing");
		}
	}
	

class TestInterface{
	public static void main(String args[]){
		Baby baby=new Baby();
		baby.cring();
		baby.marri();
		baby.walk();
	}
}
