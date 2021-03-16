package data_practice;

import java.util.Scanner;

public class practicecode1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] ar = new int [n];
		for(int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			int j = i -1;
			while(j >= 0 && ar[j] > temp) {
				ar[j+1] = ar[j];
				j--;
			}
			ar[j+1] = temp;
			for(int k = 0; k <= i; k++) {
				System.out.print(ar[k] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
