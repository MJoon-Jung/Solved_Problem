package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//BAEKJOON 1158
public class Josephus_Problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> result = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int idx = 1;
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i =1;i<=n;i++) {
			q.add(i);
		}
		
		while(n > result.size()) {
			if(idx == x) {
				result.add(q.poll());
				idx = 1;
			}else {
				int temp = q.poll();
				q.add(temp);
				idx++;
			}
		}
		sb.append("<");
		int k = result.size();
		for(int i = 0; i < k; i++) {
			sb.append(result.poll());
			if(i != k-1) {
				sb.append(", ");
			}
		}
		sb.append(">");
		
		System.out.println(sb);
	}
}
