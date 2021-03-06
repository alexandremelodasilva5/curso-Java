package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] matrix = new int[m][n];
		
		
		
		for(int i = 0; i < m ;i++) {
			for(int j = 0; j < n;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		
		int num = sc.nextInt();
		
		for(int i = 0; i < m ;i++) {
			for(int j = 0; j < n;j++) {
				if(num == matrix[i][j]) {
				System.out.printf("Position %d, %d:%n", i, j);
				comparePositions(i,j,matrix);
				}
			}
		}
		
		sc.close();

	}
	
	public static void comparePositions(int i, int j, int[][] matrix) {
		if (j > 0) {
			System.out.println("Left: " + matrix[i][j-1]);
		}
		if (i > 0) {
			System.out.println("Up: " + matrix[i-1][j]);
		}
		if (j < matrix[i].length-1) {
			System.out.println("Right: " + matrix[i][j+1]);
		}
		if (i < matrix.length-1) {
			System.out.println("Down: " + matrix[i+1][j]);
		}
	}

}
