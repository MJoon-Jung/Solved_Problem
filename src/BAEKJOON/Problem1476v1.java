package BAEKJOON;

import java.util.Scanner;

public class Problem1476v1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = new int [3];
		for(int i = 0; i < 3; i++) {
			ar[i] = sc.nextInt();
		}
		int year = 1;
		int e, s, m;
		e =s = m = 1;
		
		while(true) {
			if(ar[0] == e && ar[1] == s && ar[2] == m) {
				break;
			}
			e++;s++;m++;year++;
			if(e > 15) {
				e = 1;
			}
			if(s > 28) {
				s = 1;
			}
			if(m > 19) {
				m = 1;
			}
		}
		System.out.println(year);
	}
}
