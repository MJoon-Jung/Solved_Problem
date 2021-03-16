package data_practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class practice {
	static String [] name = new String [1000];
	static String [] number = new String [1000];
	static int n = 0;
	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(new File("input.txt"));
			while(inFile.hasNext()) {
				name[n] = inFile.next();
				number[n] = inFile.next();
				n++;
			}
			
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No File");
			return;
		}
		bubleSort();
		for(int i = 0; i < n; i++) {
			System.out.println(name[i] + " : " + number[i]);
		}
		
	}	
	static void bubleSort() {
		for(int i = n-1; i >0; i--) {
			for(int j = 0; j < i; j++) {
				if(name[j].compareTo(name[j+1]) > 0) {
					String temp = name[j+1];
					name[j+1] = name[j];
					name[j] = temp;
				}
			}
		}
	}
}
