package com.anmol.towersofhanoi;

import java.util.Scanner;

/***
 * @see http://www.vogella.com/tutorials/JavaAlgorithmsTowersOfHanoi/article.html
 * @see http://www.javawithus.com/programs/towers-of-hanoi
 * 
 * @author Anmol More
 */
public class SolveTowersOfHanoi {
	static int noOfMoves = 0;
	
	public void move(int n, String start, String auxillary, String end) {
		noOfMoves +=1;
		if(n == 1) {
			System.out.println("Move " + start + " to " + end);
		}
		else {
			move(n-1, start, end, auxillary);
			System.out.println("Move " + start + " to " + end);
			move(n-1, auxillary, start, end);
		}
	}
	
	public static void main(String args[]) {
		System.out.println("Enter the number of disks");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		SolveTowersOfHanoi towersofHanoi = new SolveTowersOfHanoi();
		towersofHanoi.move(n,"A","B","C");
		
		System.out.println("Total Number of Moves for " + n + " discs is : " + noOfMoves );
	}
}
