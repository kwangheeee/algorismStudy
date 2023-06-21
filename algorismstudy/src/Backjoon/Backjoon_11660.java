package Backjoon;

import java.util.Scanner;

public class Backjoon_11660 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		// (2,2) (3,4) -> 3 + 4 + 5 // 4 + 5 + 6
		for(int i=0; i<m; i++) {
			
		}
	}
}
