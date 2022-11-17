package com.nt;
//Using interface: by third user 
class TestInterface1{  
	public static void main(String args[]){  
		Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
		Drawable drawable=new Rectangle();
		d.draw();  
		drawable.draw();
		}}  
