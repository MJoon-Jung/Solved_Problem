package programmers_problem;

public class fibonachi {

	public static void main(String[] args) {
		int answer = 0;
		int n = 50;
        int [] ar = new int [n+1];
		ar[0] = 0;
		ar[1] = 1;
		for(int i = 2; i <= n; i++) {
			ar[i] = ar[i-1] + ar[i-2];
            if(ar[i] >= 1234567){
                ar[i] = ar[i] - 1234567;
            }
		}
        answer = ar[n] % 1234567;
	}
}
