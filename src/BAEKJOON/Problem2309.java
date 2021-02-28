package BAEKJOON;

import java.util.Scanner;

public class Problem2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = new int [9];
		int sum = 0;
		for(int i = 0; i < 9; i++) {
			ar[i] = sc.nextInt();
			sum += ar[i];
		}
		Sort(ar);
		
		for(int i = 0; i < ar.length-1; i++) {
			for(int j = i+1; j < ar.length; j++) {
				if(sum - ar[i] - ar[j] == 100) {
					for(int k = 0; k < ar.length; k++) {
						if(k == i || k== j) continue;
						System.out.println(ar[k]);
					}
					return;
				}
			}
		}
	}
	static void Sort(int [] ar) {
		for(int i = 0; i < ar.length - 1; i++) {
			int min = ar[i];
			int idx = i;
			for(int j = i+1; j < ar.length; j++) {
				if(ar[j] < min) {
					min = ar[j];
					idx = j;
				}
			}
			if(idx != i) {
				int temp = ar[i];
				ar[i] = min;
				ar[idx] = temp;
			}
		}
	}
}
