package programmers_problem;
import java.util.Scanner;

public class code8 {

	public static void main(String[] args) {
//		세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다. 
//		각 원판은 반경이 큰 순서대로 쌓여있다. 이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서 세 번째 장대로 옮기려 한다.
//
//		한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
//		쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
//		이 작업을 수행하는데 필요한 이동 순서를 출력하는 프로그램을 작성하라. 단, 이동 횟수는 최소가 되어야 한다.
//		Scanner sc =new Scanner(System.in);
//		int n = sc.nextInt();
//		int [][] top = new int [3][n];
//		
		hanoi(3,0,2,1);
		
	}
//	static void hanoi(int num, int from, int to, int other) {
//		if(num== 0)
//			return;
//		hanoi(num-1,from,other,to);
//		System.out.println((from+1)+"에서 " + (to+1)+ "로 이동");
//		hanoi(num-1, to, other,from);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static void hanoi(int n,int from,int to, int other) { //from 출발지 기둥번호 / to 목적지 기둥번호 / other 나머지 기둥번호
		if(n == 0) {
			return;
		}
		hanoi(n-1,from,other,to);
		System.out.println(from+1 +"번에서"+(to+1)+"번으로 옮긴다");
		hanoi(n-1,other,to,from);
	}

}
