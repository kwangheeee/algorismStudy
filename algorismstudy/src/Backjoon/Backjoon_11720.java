package Backjoon;

import java.util.Scanner;

public class Backjoon_11720 {
	// n의 범위가 1~100 이므로 int형과 long형과 같은 숫자형으로 담을수 없다.
	// 문자열 형태 -> 문자열 배열로 반환 -> 숫자형으로 변환
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// n값 입력받기
		int n = scan.nextInt();
		// 길이 n의 숫자를 입력받아 String형 변수 sNum에 저장하기
		String sNum = scan.next();
		// sNum을 다시 char[]형 변수 cNum에 변환하여 저장하기
		char[] cNum = sNum.toCharArray();
		// int형 변수 sum 선언하기
		int sum = 0;
		// for(cNUM 길이만큼 반복하기){ 각 배열의 자릿수 더하기} sum 출력
		for(int i=0; i<cNum.length; i++) {
			sum += cNum[i] - '0';
		}
		System.out.println(sum);
	}
}
