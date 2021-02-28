package BAEKJOON;

import java.util.Scanner;

public class Problem3085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char [][] ar = new char [n][n];
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			for(int j = 0; j < n; j++) {
				ar[i][j] = s.charAt(j);
			}
		}
		int answer = -1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j+1 < n) {
					swap(ar,i,j,i,j+1);
					int temp = check(ar);
					answer = Math.max(temp, answer);
					swap(ar,i,j,i,j+1);
				}
				if(i+1 < n) {
					swap(ar,i,j,i+1,j);
					int temp = check(ar);
					answer = Math.max(temp, answer);
					swap(ar,i,j,i+1,j);
				}
			}
		}
		System.out.println(answer);
		
	}
	static void swap(char [][] ar , int x, int y,int vx,int vy) {
		char temp = ar[x][y];
		ar[x][y] = ar[vx][vy];
		ar[vx][vy] = temp;
		
	}
	static int check(char [][] ar) {
		int answer = -1;
		for(int i = 0; i < ar.length; i++) {
			int cnt = 1;
			for(int j = 0; j < ar.length-1; j++) {
				if(ar[i][j] == ar[i][j+1]) {
					cnt++;
				}else {
					cnt = 1;
				}
				answer = Math.max(answer, cnt);
			}
			cnt = 1;
			for(int j = 0; j < ar.length-1; j++) {
				if(ar[j][i] == ar[j+1][i]) {
					cnt++;
				}else {
					cnt = 1;
				}
				answer = Math.max(answer, cnt);
			}
		}
		return answer;
	}
}
