package BAEKJOON;

import java.util.Scanner;

//BAEKJOON Problem 1676
public class Factorial_Zero_Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		
		int two = 0;
		int five = 0;
		
		for(int i = 2; i <= n; i++) {
			if(i%2 == 0) {
				int j = i / 2;
				two++;
				while(j % 2 == 0) {
					two++;
					j = j / 2;
				}
			}
			if(i%5 == 0) {
				int j = i / 5;
				five++;
				while(j % 5 == 0) {
					five++;
					j = j / 5;
				}
			}
		}
		System.out.println(Math.min(two, five));
	}
}
