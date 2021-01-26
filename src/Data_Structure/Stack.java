package Data_Structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack {
	public static int [] stack;
	public static int size = 0;
	
	public static void push(int item) {
		stack[size] = item;
		size++;
	}
	public static int pop() {
		if(size == 0) {
			return -1;
		}else {
			int temp = stack[size - 1];
			stack[size-1] = 0;
			size--;
			return temp;
		}
	}
	public static int size() {
		return size;
	}
	public static int empty() {
		if(size == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	public static int top() {
		if(size == 0) {
			return -1;
		}else {
			return stack[size-1];
		}
	}
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
//		int n = sc.nextInt();
		int n = Integer.parseInt(br.readLine());
		
		stack = new int [n];
		
		for(int i = 0; i < n; i++) {
//			String mode = sc.next();
//			st = new StringTokenizer(br.readLine()," ");
//			
//			if(st.nextToken().equals("push")) {
//				push(Integer.parseInt(st.nextToken()));
//			}
//			else if(st.nextToken().equals("pop")) {
//				sb.append(pop()).append('\n');		
//			}
//			else if(st.nextToken().equals("size")) {
//				sb.append(size()).append('\n');
//			}
//			else if(st.nextToken().equals("top")) {
//				sb.append(top()).append('\n');
//			}
//			else if(st.nextToken().equals("empty")) {
//				sb.append(empty()).append('\n');
//			}
//			if(mode.equals("push")) {
//				push(sc.nextInt());
//			}
//			else if(mode.equals("pop")) {
//				sb.append(pop()).append('\n');		
//			}
//			else if(mode.equals("size")) {
//				sb.append(size()).append('\n');
//			}
//			else if(mode.equals("top")) {
//				sb.append(top()).append('\n');
//			}
//			else if(mode.equals("empty")) {
//				sb.append(empty()).append('\n');
//			}
		}
		System.out.println(sb);
	}
}
