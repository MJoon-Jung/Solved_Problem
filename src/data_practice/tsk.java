package data_practice;


public class tsk {

	public static void main(String[] args) {
//		서로 다른 수들로 구성된 수열 a1, a2,…, an이 있다. 
//		어떤 수가 자신과 인접한 두 수 (즉, 바로 전의 수와 바로 다음의 수)보다 작을 때
//		그 수를 local mimimum이라고 부른다. 단 a1의 경우에는 a2보다 작으면, an의 경우에는 an-1
//		보다 작으면 local mimimum이다. 어떤 수열에서 local minimum이 최대 1개일 때 그 수열은 “오목하다”라고
//		부르기로 하자. 입력으로 하나의 수열이 주어질 때 가장 길이가 긴 오목한 부분 수열을 찾아서 출력하는 프로그램
//		을 작성하라. 예를 들어 입력 수열이 1, 3, 7, 6, 12, 11, 9, 0, -1, 2, -3, 5 라면 가장 긴 오목한 부분 수열
//		은 12, 11, 9, 0, -1, 2이다. 입력 형식은 먼저 n의 값이 주어지고 이어서 n개의 정수가 주어진다.

		int [] ar = {1,3,7,6,12,11,9,0,-1,2,-3,5};
		int len = 0;
		int localMin = 0;
		int lenElement = 0;
		int start =0;
		int end = 0;
		for(int i = 0; i < ar.length-1; i++) {
			int j = i+1;
			for(; j < ar.length; j++) {
				localMin = getLocalmin(i,j,ar);
				if(localMin==1) {
					if(lenElement < j-i+1) {
						start = i;
						end = j;
						lenElement = j-i+1;
					}
				}
			}
			
		}
		for(int i = start; i <= end; i++) {
			System.out.println(ar[i]);
		}
		
		
	}
	public static int getLocalmin(int start,int end, int [] ar) {
		int cmt = 0;
		if(ar[start] < ar[start+1])
			cmt++;
		for(int i = start+1; i < end; i++) {
			if(ar[i] < ar[i-1] && ar[i] < ar[i+1])
				cmt++;
		}
		if(ar[end] < ar[end-1])
			cmt++;
		return cmt;
	}
}
