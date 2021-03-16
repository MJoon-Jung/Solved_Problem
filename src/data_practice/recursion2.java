package data_practice;

import java.util.Arrays;
import java.util.Scanner;

public class recursion2 {
	public static void main(String[] args) {
//		printCharsReverse("String Reverse");
		printBinary(83);
//		int [] data;
//		Scanner sc= new Scanner(System.in);
//		System.out.println(sum(3,data = new int[] {1,2,3}));
//		int n = 5;
//		int [] data = new int [n];
//		readFrom(n,data,sc);
//		System.out.println(Arrays.toString(data));
	}
	static void readFrom(int n, int [] data, Scanner in) {
		if(n == 0)
			return;
		else {
			readFrom(n-1,data,in);
			data[n-1] = in.nextInt();
		}
	}
	static int sum(int n, int [] data) {
		if(n<= 0) {
			return 0;
		}
		else {
			return data[n-1] + sum(n-1,data);
		}
	}
	static void printBinary(int k) {		
		if(k/2 == 0) {
			System.out.print(1);
			return;
		}
		else {
			printBinary(k/2);
			System.out.print(k%2);
		}
		
	}
	static void printCharsReverse(String str) {
		if(str.length() == 0) {
			return;
		}
		else {
			printCharsReverse(str.substring(1));
			System.out.println(str.charAt(0));
		}
	}
}
