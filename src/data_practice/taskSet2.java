package data_practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class taskSet2 {
	static String [] names = new String [1000];
	static int [] numbers = new int [1000];
	static int n = 0;
	
	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(new File("input.txt"));
			while(inFile.hasNext()) {
				names[n] = inFile.next();
				numbers[n] = inFile.nextInt();
				n++;
			}
			inFile.close();
			for(int i = n-1; i > 0; i--) {
				for(int j =0; j < i; j++) {
					if(numbers[j] > numbers[j+1]) {
						int temp = numbers[j+1];
						numbers[j+1] = numbers[j];
						numbers[j] = temp;
						
						String tep = names[j+1];
						names[j+1] = names[j];
						names[j] = tep;
					}
				}
			}
			repeat();
		} catch (FileNotFoundException e) {	
			System.out.println("No File");
			return;
		}
	}
	static void repeat() {
		for(int i = 0; i < n; i++) {
			System.out.println(names[i] + "  " + numbers[i]);
		}
	}
}
