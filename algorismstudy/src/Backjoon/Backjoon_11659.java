package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Backjoon_11659 {
	/*
	 * 구간합 -> 합 배열을 이용하여 시간 복잡도를 더 줄이기 위해 사용하는 특수한 목적의 알고리즘
	 * 		합배열 : 기존의 배열을 전처리한 배열
	 * 			 ->합 배열을 미리 구해 놓으면 기존 배열의 일정 범위가 합을 구하는 시간 복잡도가 O(N)에서 O(1)로 감소
	 * 
	 * 합 배열 S를 만드는 공식 S[i] = S[i-1] + A[i] 
	 * 구간 합을 구하는 공식 S[j] - S[i-1] // i에서 j까지 구간합
	 * 
	 * 
	 * 
	 */
	
	
	// 첫번째 풀이
	public static void first() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = scan.nextInt();
		}

		int[] list1 = new int[m];
		int sum1 = 0;
		int a = 0;
		int b = 0;
		for (int i = 0; i < m; i++) {
			a = scan.nextInt() - 1;
			b = scan.nextInt() - 1;
			for (int j = a; j <= b; j++) {
				sum1 += list[j];
			}
			System.out.println(sum1);
			sum1 = 0;
		}
		/*
		 * for (int aa : list1) { System.out.println(aa); }
		 */
	}

	
	// 두번쨰 풀이
	public static void scan() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] s = new long[n + 1];
		s[0] = 0;
		for (int i = 1; i <= n; i++) {
			s[i] = s[i - 1] + sc.nextInt();
		}
		for (int j = 0; j < m; j++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(s[b] - s[a - 1]);
		}
	}

	
	// 책 보고
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		long[] s = new long[n + 1];
		st = new StringTokenizer(bf.readLine());
		for (int i = 1; i <= n; i++) {
			s[i] = s[i - 1] + Integer.parseInt(st.nextToken());
		}
		for (int k = 0; k < m; k++) {
			st = new StringTokenizer(bf.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			System.out.println(s[j] - s[i - 1]);
		}
	}
}
