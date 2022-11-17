package com.nt;

public class Shape{
	void draw()
	{
		System.out.println("Drawing");
	}
}
class Trangle extends Shape{
	void draw() {
		System.out.println("Trangle drawing...");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Circle Drawing...");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Rectangle drawing");
	}
}
class Test{
	public static void main(String args[]){  
		Shape shape;
		
		shape=new Trangle();
		shape.draw();
		
		shape=new Circle();
		shape.draw();
		
		shape=new Rectangle();
		shape.draw();
	}
	
}