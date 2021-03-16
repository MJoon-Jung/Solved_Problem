package data_practice;

import java.util.Scanner;

public class recursion3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
//		int [] data = {124213,2,4,-4124,9999};
		String [] items = {"aaa","bbb","ccc","ddd","eee"};
//		System.out.println("찾고 싶은 값의 인덱스");
//		int target = sc.nextInt();
		System.out.println(binarySearch(items,"ddd",0,items.length-1));
//		System.out.println(search2(data,0,n-1,target));
//		System.out.println(findmax(data,0,n-1));
	}
//	static int binarySearch(String [] items, String target, int begin, int end) {
//		if(begin > end) 
//			return -1;
//		else {
//			int middle = (begin+end)/2;
//			int result = target.compareTo(items[middle]);
//			if(result > 0) {
//				return binarySearch(items, target, middle+1, end);
//			}
//			else if(result == 0) {
//				return middle;
//			}
//			else {
//				return binarySearch(items,target,begin,middle);
//			}
//		}
//	}
	static int binarySearch(String [] items, String target, int begin, int end) {
		if(begin > end)
			return -1;
		else {
			int middle = (begin + end) / 2;
			int result = target.compareTo(items[middle]);
			if(result == 0)
				return middle;
			else if(result > 0) {
				return binarySearch(items,target,middle+1,end);
			}
			else {
				return binarySearch(items,target,begin,middle);
			}
		}
	}
	static int findmax(int [] data, int begin, int end) {
		if(begin == end)
			return data[begin];
		else {
			int middle = (begin+end) / 2;
			int a = findmax(data,begin, middle);
			int b = findmax(data,middle+1,end);
			return Math.max(a, b);
		}
		
	}
	static int search2(int [] data,int begin,int end, int target) {
		if(begin > end) {
			return -1;
		}
		else {
			int middle = (begin+end)/2;
			if(data[middle] == target) {
				return middle;
			}
			int index = search2(data,begin,middle-1,target);
			if(index != -1) {
				return index;
			}
			else {
				return search2(data,middle+1,end,target);
			}
		}
	}
	
	
	static int search(int [] data, int begin, int end, int target) {
		if(begin > end) {
			return -1;
		}
		if(data[begin] == target) {
			return begin;
		}
		else {
			return search(data,begin+1,end,target);
		}
	}

}
