package BAEKJOON;

import java.util.Scanner;

//BEAKJOON Problem 9095
//테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.
//예제 3 4 7 10
//답 7 44 274
public class PlusOneTwoThree {
	static int [] ar = new int [11];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		ar[0] = 1;
		ar[1] = 1;
		ar[2] = 2;
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			sb.append(count(n) + "\n");
		}
		System.out.println(sb);
	}
	public static int count(int n) {
		if(ar[n] > 0) {
			return ar[n];
		}
		ar[n] = count(n-1) + count(n-2) + count(n-3);
		return ar[n];
	}
}
