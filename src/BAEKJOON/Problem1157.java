package BAEKJOON;

import java.util.Scanner;

public class Problem1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int [] ar = new int [s.length()];
		boolean [] check = new boolean [s.length()];
		
		for(int i = 0; i < s.length()-1; i++) {
			if(check[i]) continue;
			char c = Character.toLowerCase(s.charAt(i));
			for(int j = i+1; j < s.length(); j++) {
				if(check[j]) continue;
				char t = Character.toLowerCase(s.charAt(j));
				if(c == t) {
					ar[i]++;
					check[j] = true;
				}
			}
		}
		
		int Max = ar[0];
		int idx = 0;
		boolean isSame = false;
		
		for(int i = 1; i < ar.length; i++) {
			if(Max == ar[i]) isSame = true;
			else if(Max < ar[i]) {
				Max = ar[i];
				idx = i;
				isSame = false;
			}
		}		
		if(isSame) {
			System.out.println("?");
			return;
		}
		char answer = Character.toUpperCase(s.charAt(idx));
		System.out.println(answer);
		
		
	}
}
