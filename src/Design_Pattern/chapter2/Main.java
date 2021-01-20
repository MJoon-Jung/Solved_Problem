package Design_Pattern.chapter2;

public class Main {
	public static void main(String[] args) {
		Adapter a= new AdapterImpl();
		System.out.println(a.twotime(100f));
		System.out.println(a.half(100f));
	}
}
