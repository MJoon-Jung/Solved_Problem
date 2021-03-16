package programmers_problem;
import java.util.Scanner;

public class code9 {

	public static void main(String[] args) {
//
//		첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
//
//		둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
//		이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//
//		출력
//		각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
//
//		5
//		5 50 50 70 80 100    40.000%
//		7 100 95 90 80 70 60 50    57.143%
//		3 70 90 80 33.333%
//		3 70 90 81 66.667%
//		9 100 99 98 97 96 95 94 93 91  55.556%
		
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int [] ar;
		for(int i = 0; i < c; i++) {
			int n = sc.nextInt();
			int count = 0;
			ar = new int [n];
			for(int j = 0; j < n; j++) {
				ar[j] = sc.nextInt();
			}
			for(int j =0; j < n; j++) {
				if(average(n,ar) < ar[j]) {
					count++;
				}
			}
			System.out.println(String.format("%.3f",(double)count/(double)n*100) + "%");
		}
		
	}
	static double average(int n,int [] ar) {
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum += (double)ar[i];
		}
		return sum / (double)n;
	}
}
