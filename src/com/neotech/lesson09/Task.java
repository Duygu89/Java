package com.neotech.lesson09;

public class Task {

	public static void main(String[] args) {

		for (int a = 1; a <= 100; a++) {
			System.out.print(a + " ");
		}
		System.out.println("");
		for (int b = 100; b >= 1; b--) {
			System.out.print(b + " ");
		}
		System.out.println("");
		for (int c = 20; c >= 1; c--) {
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}

		}
		System.out.println("");

		for (int c = 20; c >= 1; c -= 2) {
			System.out.print(c + " ");
		}
		System.out.println();

		for (int d = 20; d <= 50; d++) {
			if (d % 2 == 1) {
				System.out.print(d + " ");
			}
		}
		for (int d = 21; d <= 50; d += 2) {
			System.out.print(d + " ");
		}

		// BREAK make loop stop

	}

}
