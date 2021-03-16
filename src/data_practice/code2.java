package data_practice;

public class code2 {

	public static void main(String[] args) {
		for(int n = 2; n < 100000; n++) {
			if(isprime(n)) System.out.println(n);
		}

	}
	static boolean isprime(int k) {
		boolean prime = true;
		for(int i = 2; i*i <=k;i++) {
			if(k%i==0) return false;
		}
		return true;
	}
}
