package chapterOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day1 {
	// 시간 복잡도 정의하기
	
	//시간복잡도 유형 
	/* 
	 * - 빅-오메가 : 최선일 때의 연산 횟수를 나타낸 표기법
	 * - 빅-세타 : 보통일 떄의 연산 횟수를 나타낸 표기법
	 * - 빅-오 : 최악일 떄의 연산 횟수를 나타낸 표기법
	 * */
	
//	제한시간 2초 -> 조건을 만족하려면 2억 번 이하의 연산 횟수로 문제를 해결
	
//	시간 복잡도 도출 기준
	/*
	 * 상수는 시간 복잡도 계산에서 제외한다.
	 * 가장 많이 중첩된 반복문의 수행 횟수가 시간 복잡도의 기준이 된다
	 * */
	
//	------------------------------------------------------------------------------------
	// 코드의 논리 오류 
	// 논리 오류를 찾을 수 있는 최선의 방법 -> 디버깅
	
	// 디버깅 = 프로그램에서 발생하는 문법 오류나 논리 오류를 찾아 바로잡는 과정
	
	// 코딩테스트를 진행하면서 실수하기 쉬운 4가지 오류
	/*
	 * 변수 초기화 오류 찾아보기
	 * 반복문에서 인덱스 범위 지정 오류 찾아보기
	 * 잘못된 변수 사용 오류 찾아보기
	 * 자료형 범위 오류 찾아보기 -> 가장 하기 쉬운 실수이므로 변수를 long으로 선언하는 방법도 좋다
	 * */
	
//	int형은 -2147483648 ~ 2147483647
//	long형은 -9223372036854775808 ~ 9223372036854775807
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int answer = 0;
		//
		int A[] = new int[100001];
		int S[] = new int[100001];
		// 반복문에서 인덱스 범위 지정 오류찾아보기
		// 배열의 인덱스 범위보다 한참 작은 값을 배열에 할당하고 있어 나머지는 값을 할당받지 못했다.
		for(int i=1; i<10000; i++) {
			// 자료형 범위 오류
			// int형으로 선언한 배열의 값의 크기가 초과되는 값을 할당받아 오류가 날 수 있다.
			A[i] = (int)(Math.random() * Integer.MAX_VALUE);
			S[i] = S[i-1] + A[i];
		}
		for(int t=1 ;t<testcase; t++) {
			// 변수 초기화 오류 찾아보기
			int query = sc.nextInt();
			for(int i=0; i<query; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				answer += S[end] - S[start-1];
				// 잘못된 변수 사용 오류
				// 조건에 맞지 않은 변수를 결과값에 설정하였다.
				System.out.println(testcase + " " + answer);
			}
		}
	}
}
