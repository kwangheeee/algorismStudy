package Backjoon;

import java.util.Scanner;

public class Backjoon_2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int tmp = 0;
		int[] arr = new int[input];
		for (int i = 0; i < input; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (arr[i] < arr[j]) {
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		for (int a : arr)
			System.out.println(a);
	}
}
