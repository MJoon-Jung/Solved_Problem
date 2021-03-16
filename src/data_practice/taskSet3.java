package data_practice;

import java.util.Scanner;

public class taskSet3 {

	public static void main(String[] args) {
//		입력으로 정수의 개수 n과 이어서 n개의 정수들이 주어진다. 이 중 오름차순 혹은 내림차순으로 정렬되어 있는
//		가장 긴 구간을 찾아서 그 구간의 길이를 출력하는 프로그램을 작성하라. 예를 들어 n=13이고 입력 정수들이 
//		2, 3, 15, 15, 13, 12, 11, 9, 0, -1, 2, -3, 5 라면 밑줄친 구간이 가장 긴 구간이고 그 길이는 8이다.

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] ar = new int [n];
		for(int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		reco(n,ar); 
		recp(n,ar);
		if(reco(n,ar) > recp(n,ar))
			System.out.println(reco(n,ar));
		else
			System.out.println(recp(n,ar));

	}
	public static int reco(int n, int [] ar) {
		int man = 1;
		for(int i =0; i < n-1; i++) {
			int length = 1;
			while(ar[i] >= ar[i+1]) {
				i++;
				length++;
				if(man < length)
					man = length;
				if(i == n-1)
					break;
			}
		}
		return man;
		
	}
	public static int recp(int n,int [] ar) {
		int man = 1;
		for(int i =n-1; i > 0; i--) {
			int length = 1;
			while(ar[i] >=ar[i-1]) {
				i--;
				length++;
				if(man < length)
					man = length;
				if(i == 0)
					break;
			}
		}
		return man;
	}

}
