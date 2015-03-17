package com.anmol.backtracking;

import java.util.Scanner;

public class NBitStrings {
	static int[] A;

	public static void Binary(int n) {
		if (n < 1) {
			System.out.println();
			for (int k = 0; k < A.length; k++) {
				System.out.print(A[k]);
			}
		} else {
			A[n - 1] = 0;
			Binary(n - 1);
			A[n - 1] = 1;
			Binary(n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number of bits");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		A = new int[n];
		Binary(n);
	}
}
