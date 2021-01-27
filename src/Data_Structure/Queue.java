package Data_Structure;

import java.util.Scanner;

//BAEKJOON Problem 10845


public class Queue {
	static int [] data = new int [10000];
	static int begin = 0;
	static int end = 0;
	
	static void push(int x) {
		data[end++] = x;
	}
	static int pop() {
		if(empty() == 1) {
			return -1;
		}else {
			int temp = data[begin++];
			return temp;
		}
	}
	static int size() {
		return end - begin;
	}
	static int empty() {
		if(begin == end) {
			return 1;
		}else {
			return 0;
		}
	}
	static int front() {
		if(empty() == 1) {
			return -1;
		}else {
			return data[begin];
		}
	}
	static int back() {
		if(empty() == 1) {
			return -1;
		}else {
			return data[end - 1];
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int cnt = sc.nextInt();

		for(int i = 0; i < cnt; i++) {
			String str = sc.next();
			if(str.equals("push")) {
				push(sc.nextInt());
			}else if(str.equals("pop")) {
				sb.append(Integer.toString(pop())+"\n");
			}else if(str.equals("size")) {
				sb.append(Integer.toString(size())+"\n");
			}else if(str.equals("empty")) {
				sb.append(Integer.toString(empty())+"\n");
			}else if(str.equals("front")) {
				sb.append(Integer.toString(front())+"\n");
			}else if(str.equals("back")) {
				sb.append(Integer.toString(back())+"\n");
			}
		}
		System.out.println(sb);
	}
	
	
	
	
	
	
	
	
}
