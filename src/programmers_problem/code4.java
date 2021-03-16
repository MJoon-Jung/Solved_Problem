package programmers_problem;

public class code4 {

	public static void main(String[] args) {
//		두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
//		수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
//		첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다
//		0 0 1 1 1 2 3 4
		int ar [] = {39,40,41,42,43,44,82,83,84,85};
		int arr [] = new int [ar.length];
		for(int i = 0; i < ar.length; i++) {
			arr[i] = ar[i] % 42;
		}
		int br [] = sort(arr);
		int count = 0;
		for(int i = 0; i < br.length-1; i++) {
			if(br[i] == br[i+1])
				count++;
		}
		System.out.println(br.length - count);
	}
	public static int [] sort(int [] ar) {
		for(int i = 0; i < ar.length; i++) {
			int min = ar[i];
			int tmp = i;
			for(int j = i+1; j < ar.length; j++) {
				if(min > ar[j]) {
					min = ar[j];
					tmp = j;
				}
			}
			if(!(min == ar[i])) {
				int temp = ar[i];
				ar[i] = ar[tmp];
				ar[tmp] = temp;
			}
		}
		return ar;
	}

}
