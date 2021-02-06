package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 1463
public class MakeOne {
	static int [] ar;
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		ar = new int [n+1];
		
		System.out.println(Mone(n));
	}
	public static int Mone(int n) {
		if(n == 1) return 0;
		if(ar[n] > 0) return ar[n];
		ar[n] = Mone(n-1) + 1;
		if(n % 2 == 0) {
			int temp = Mone(n/2) + 1;
			if(ar[n] > temp) ar[n] = temp;
		}
		if(n% 3 == 0) {
			int temp = Mone(n/3) + 1;
			if(ar[n] > temp) ar[n] = temp;
		}
		return ar[n];
		
	}
}
