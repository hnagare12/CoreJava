package com.nt;

import java.io.IOException;

public class TestThrow {
	void m() throws IOException {
		throw new IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		TestThrow obj = new TestThrow();
		obj.p();
		System.out.println("normal flow...");
	}
}
