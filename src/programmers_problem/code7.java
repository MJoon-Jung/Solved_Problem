package programmers_problem;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class code7 {

	public static void main(String[] args) {
//		수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자
//		산술평균 : N개의 수들의 합을 N으로 나눈 값
//		중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
//		최빈값 : N개의 수들 중 가장 많이 나타나는 값
//		범위 : N개의 수들 중 최댓값과 최솟값의 차이
//		N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.
//		입력
//		첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 그 다음 N개의 줄에는 정수들이 주어진다. 입력되는 정수의 절댓값은 4,000을 넘지 않는다.
//		출력
//		첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
//		둘째 줄에는 중앙값을 출력한다.
//		셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
//		넷째 줄에는 범위를 출력한다
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int n = sc.nextInt();
		int [] ar = {3,51,7,12,29,64,91};
		System.out.println(median(n,ar));
		

	}
	public static double Arithmetic_mean(int n, int [] ar) {
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum += ar[i];
		}
		double r =  Math.round((sum/n * 1000.0)/1000.0);
		return r;
	}
	public static int median(int n, int [] ar) {
		ar = bubblesort(ar);
		int middle = ar[n/2];
		return middle;
	}
	public static int [] bubblesort(int [] ar) {
		for(int i = 0; i < ar.length-1; i++) {
			int temp;
			for(int j = ar.length-1; j > 0; j--) {
				if(ar[j-1] > ar[j]) {
					temp = ar[j];
					ar[j] = ar[j-1];
					ar[j-1] = temp;
				}
			}
		}
		return ar;
	}
	public static void more(int [] ar) {
		ar = bubblesort(ar);
		int [] arr = new int [ar.length];
		for(int i = 0; i < ar.length; i++) {
			int idx = i+1;
			while(true) {
				if(ar[i] == ar[idx]) {
					arr[i]++;
					idx++;
				}
				else {
					break;
				}
			}
		}
}
	public static void maxArray(int [] ar) {
		int max = -99999999;
		int max2 = 0;
		for(int i = 0; i < ar.length; i++) {
			if(max < ar[i]) {
				max = ar[i];
			}
			
		}
	}
	public static int range(int [] ar) {
		ar = bubblesort(ar);
		return ar[ar.length-1]-ar[0];
	}
}
