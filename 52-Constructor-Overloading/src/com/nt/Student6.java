package com.nt;

public class Student6 {
	int id;
	int age;
	String name;
	//create two arg constructor constructor
 Student6 ( int i,int a,String n) 
	{
		id =i;
		age =a;
		name =n;
	}
 //create three arg constructor
  Student6(int i,String n) 
  {
	  id= i;
	  name =n;
}
  void display()
  {
	  System.out.println(id+"  "+age+" "+name);
  }
  public static void main(String []args) {
	  Student6 s1 = new Student6(222,25,"Aryan"); 
	  Student6 s2 = new Student6(223,"Ram"); 
	  s1.display();
	  s2.display();
	  
  }
}
