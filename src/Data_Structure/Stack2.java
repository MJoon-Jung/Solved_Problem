package Data_Structure;

import java.util.Scanner;

public class Stack2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] stack = new int [n];
		int idx = 0;
		
		for(int i = 0; i < n; i++) {
			String mode = sc.next();
			if(mode.equals("push")) {
				stack[idx++] = sc.nextInt();
			}
			else if(mode.equals("pop")) {
				if(idx == 0) {
					System.out.println(-1);
				}else {
					System.out.println(stack[--idx]);
					stack[idx] = 0;
				}
			}
			else if(mode.equals("top")) {
				if(idx == 0) {
					System.out.println(-1);
				}else {
					System.out.println(stack[idx - 1]);
				}
			}
			else if(mode.equals("size")) {
				System.out.println(idx);
			}
			else if(mode.equals("empty")) {
				if(idx == 0) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}
				
		}
	}
}
