package Data_Structure;

import java.util.Scanner;

public class Stack {
	int [] stack = new int [10000];
	int idx = 0;
	
	void push(int data) {
		stack[idx++] = data;
	}
	int pop() {
		if(empty()) {
			return -1;
		}else {			
			int temp = stack[--idx];
			stack[idx] = 0;
			return temp;
		}
	}
	int top() {
		if(empty()) {
			return -1;
		}
		else {
			return stack[idx-1];
		}
	}
	int size() {
		return idx;
	}
	boolean empty() {
		if(idx == 0) {
			return true;
		}else {
			return false;
		}	
	}
	public static void main(String[] args) {
		Stack s = new Stack();
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		while(n > 0) {
			String mode = sc.next();
			if(mode.equals("push")) {
				s.push(sc.nextInt());
			}else if(mode.equals("pop")) {
				int result = s.empty() ? -1 : s.top();
				System.out.println(result);
				if(!s.empty())s.pop();
			}else if(mode.equals("size")) {
				System.out.println(s.size());
			}else if(mode.equals("empty")) {
				int result = s.empty() ? 1 : 0;
				System.out.println(result);
			}else if(mode.equals("top")) {
				System.out.println(s.top()); 
			}
			n--;
		}
		
	}
}
