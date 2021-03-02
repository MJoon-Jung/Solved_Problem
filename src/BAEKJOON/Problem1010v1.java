package BAEKJOON;

import java.util.HashMap;
import java.util.Scanner;

public class Problem1010v1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt();
		HashMap<Integer, Long> map = new HashMap<>();
		  
		for(int i = 0; i < t; i++) {
			long answer = 0;
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			long temp = 0;
			long c = 0;
			if(m-n >= n) {
				temp = factorialCut(m,m-n);
				c = factorialMemoization(n,map);
			}
			else if(n > m-n) {
				temp = factorialCut(m,n);
				c = factorialMemoization(m-n,map);
			}
			
			answer = temp / c;
			sb.append(answer + "\n");
		}
		System.out.println(sb);
	}
	static long factorialCut(int a,int b) {
		
		long answer = 1;
		for(int i = b+1; i <= a; i++) {
			answer *= i;
		}
		return answer;
	}
	static long factorial(int number){
		if(number>0){
			return number*factorial(number-1);
		}else{
			return 1;
		}
	}
	static long factorialMemoization(int number, HashMap map){

		if(map.containsKey(number)){
			return (long) map.get(number);
		}else{

			if(number>0){
				long temp = number*factorial(number-1);
				map.put(number, temp);
				return temp;
			}else{
				return 1;
			}
		}
	}
}
