package data_practice;

import java.util.Scanner;

public class pcode1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] ar = new int [n];
		for(int i =0; i < n; i++)
			ar[i] = sc.nextInt();
		
		
		
	}
	static void boonhal(int n, int [] ar) {
		int pivot = n /2;
		int rivot = n - pivot;
		int [] x = new int [pivot];
		int [] y = new int [rivot];
		
		for(int i = 0; i < pivot; i++) {
			x[i] = ar[i];
		}
		for(int i = pivot; i < n; i++) {
			y[i] = ar[i];
		}
		
	}
}
