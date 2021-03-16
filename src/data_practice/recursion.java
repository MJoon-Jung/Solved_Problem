package data_practice;

public class recursion {

	public static void main(String[] args) {
//		System.out.println(sum(5));
//		System.out.println(factorial(4));
//		System.out.println(fibonachi(7));
//		System.out.println(power(3.0,4));
//		System.out.println(gcd(36,15));
		System.out.println(gcd2(36,15));
		
	}
	static int gcd2(int p, int q) {
		if(q == 0) {
			return p;
		}
		else {
			return gcd2(q, p%q);
		}
	}
	static int gcd(int m, int n) {
		if(m < n) {
			int temp = m; m = n; n = temp;
		}
		if(m % n == 0) {
			return n;
		}
		else {
			return gcd(n,m%n);
		}
	}
	static double power(double x, int k) {
		if(k == 0) {
			return 1;
		}
		else {
			return x * power(x,k-1);
		}
	}
	static int fibonachi(int k) {
		if(k == 0)
			return 0;
		else if(k==1) {
			return 1;
		}
		else {
			return fibonachi(k-1)+fibonachi(k-2);
		}
	}
	static int factorial(int k) {
		if(k <= 1) {
			return 1;
		}
		else {
			return k * factorial(k-1);
		}
	}
	static int sum(int k) {
		if(k == 0)
			return 0;
		else {
			return k + sum(k-1);
		}
	}

}
