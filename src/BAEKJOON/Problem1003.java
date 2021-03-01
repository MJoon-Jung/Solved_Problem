package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Problem1003 {
	static int [] dpz;
	static int [] dpo;
	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		int t = sc.nextInt();
		int t = Integer.parseInt(br.readLine());
		dpz = new int [41];
		dpo = new int [41];
		
		dpz[0] = 1; dpo[1] = 1;
		
		while(t-- > 0) {
//			int n =sc.nextInt();
			int n = Integer.parseInt(br.readLine());
			if(dpz[n] != 0 || dpo[n] != 0) {
				sb.append(dpz[n] + " " + dpo[n] +"\n");
				continue;
			}
			for(int i = 2; i <= n; i++) {
				if(dpz[n] != 0 && dpo[n] != 0) {
					continue;
				}
				dpz[i] = dpz[i-1] + dpz[i-2];
				dpo[i] = dpo[i-1] + dpo[i-2];
			}
			sb.append(dpz[n] + " " + dpo[n] +"\n");
		}
		System.out.println(sb);
	}
}
