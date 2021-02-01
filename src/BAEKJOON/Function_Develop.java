package BAEKJOON;

import java.util.Arrays;
import java.util.Stack;

//Programmers Problem
public class Function_Develop {
	public static void main(String[] args) {
//		progresses	speeds	return
//		[93, 30, 55]	[1, 30, 5]	[2, 1]
//		[95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]
		
		int [] test_progresses = {93,30,55};
		int [] test_progresses2 = {95,90,99,99,80,99};
		int [] test_speeds = {1,30,5};
		int [] test_speeds2 = {1,1,1,1,1,1};
		
		int [] result1 = solution(test_progresses,test_speeds);
		int [] result2 = solution(test_progresses2,test_speeds2);
		System.out.println(Arrays.toString(result1));
		System.out.println(Arrays.toString(result2));
		
	}
	 public static int[] solution(int[] progresses, int[] speeds) {
		int [] ar = new int [progresses.length];
		int ar_idx = 0;
        Stack<Integer>stack = new Stack<>();
        
        for(int i = progresses.length-1; i>= 0; i--) {
        	stack.push(100-progresses[i]);
        }
        int sp_idx = 0;
        int cnt = 0;
        
        
        while(!stack.empty()) {
        	int s = stack.peek();
        	s = s - speeds[sp_idx] * cnt;
        	if(s > 0) {
        		if(sp_idx!=0)ar_idx++;
        		while(s > 0) {
        			s -= speeds[sp_idx];
        			cnt++;
        		}
        		ar[ar_idx]++;
        	}
        	else {
        		ar[ar_idx]++;
        	}
        	stack.pop();
        	sp_idx++;
        }
        int [] answer = Arrays.copyOfRange(ar, 0, ar_idx+1);
        return answer;
    }
}
