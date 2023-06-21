package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Backjoon_1546 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
//		int sum = 0;
//		int max = 0;
//		for(int i=0; i<n; i++) {
//			if(arr[i] > max) max = arr[i];
//			sum += arr[i];
//		}
//		System.out.println(sum*100.0 / max / n);

		Arrays.sort(arr);
		int max = arr[n-1];
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += (arr[i]/max * 100);
		}
		System.out.println(sum/n);
	}
}
