package programmers_problem;
import java.util.ArrayList;
import java.util.Arrays;

public class code3 {

	public static void main(String[] args) {
//		정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
//		배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
		int [] ar = {5,0,2,7};
		int [] br = plus(ar);
		int [] cr = sort(br);
		
		for(int i = 0; i < cr.length; i++) {
			System.out.println(cr[i]);
		}
	}
	public static int [] plus(int [] ar) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < ar.length-1; i++) {
			for(int j = i+1; j < ar.length; j++){
				if(!list.contains(ar[i] + ar[j]))
					list.add(ar[i] + ar[j]);
			}
		}
		Integer [] brr = list.toArray(new Integer[list.size()]);
		int[] arr = Arrays.stream(brr).mapToInt(Integer::intValue).toArray();
		return arr;
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
