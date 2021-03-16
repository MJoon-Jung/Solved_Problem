package data_practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class practice6 {
	static int[][] grid;
	static int n;
	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(new File("data.txt"));
			n = inFile.nextInt();
			grid = new int[n][n];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					grid[i][j] = inFile.nextInt();
				}
			}
			inFile.close();
			
			for(int x = 0; x < n; x++) {
				for(int y = 0; y < n; y++) {
					for(int dir = 0; dir < 8; dir++) {
						for(int len = 1; len <= n; len++) {
							int val = compute(x,y,dir,len);
							if(val != -1 && isprime(val))
								System.out.println(val);
						}
					}
				}
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	static int compute(int x, int y, int dir, int len) {
		int value = 0;
		for(int i = 0; i <len; i++) {
			int digit = getdigit(x,y,dir,i);
			if(digit == -1) return -1;
			value = value * 10 + digit;
			
		}
		return value;
	}
	static int[] offX = {0 ,1,1,1,0,-1,-1,-1};
	static int[] offY = {-1,-1,0,1,1,1,0,-1};
	static int getdigit(int x, int y,int dir, int k) {
		
		int newX =  x + k * offX[dir];
		int newY = y + k * offY[dir];
		if(newX < 0 || newX >= grid.length || newY < 0 || newY >= grid.length) 
			return -1;
		else
			return grid[newX][newY];
		
	}
	static boolean isprime(int k) {
		for(int i = 2; i*i <= k; i++) {
			if(k % i ==0) return false;
		}
		return true;
	}
}
