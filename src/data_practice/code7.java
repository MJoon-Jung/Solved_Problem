package data_practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class code7 {
	static String [] names = new String[1000];
	static String [] numbers = new String[1000];
	static int n = 0;
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("input.txt"));
			while(sc.hasNext()) {
				names[n] = sc.next();
				numbers[n] = sc.next();
				n++;
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("No File");
			System.exit(1);
		}
		bubleSort();
		for(int i = 0; i < n; i++) {
			System.out.println(names[i] + "  "+ numbers[i]);
		}
//		int k = sc.nextInt();
//		for(int i = 0; i < n; i++) {
//			names[i] = sc.next();
//			numbers[i] = sc.next();
//		}
//		sc.close();
//		
//		for(int i = 0; i < k; i++) {
//			System.out.println("Name : " + names[i]);
//			System.out.println(i + " Number : " + numbers[i]);
//			
//		}
	}
	public static void bubleSort() {
		for(int i = n-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(names[j].compareTo(names[j+1]) > 0) {
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
					
					String ntemp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
			
		}
	}

}
