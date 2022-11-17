package com.nt;

public interface Drawable {

	public void draw();
}

class Test {
	public static void main(String[] args) {
		int width = 10;

		// with lambda
		Drawable d = () -> {
			System.out.println("Drawing" + "  " + width);
		};
		d.draw();
	}
}
