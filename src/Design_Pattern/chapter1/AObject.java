package Design_Pattern.chapter1;

public class AObject {
	
	Ainterface ainterface;
	
	public AObject() {
		ainterface = new AinterfaceImpl();
	}
	
	public void funcAA() {
//		System.out.println("AAA");
//		System.out.println("AAA");
		ainterface.funcA();
		ainterface.funcA();
		
		
		// ~기능이 필요합니다. 개발해주세요 라고 위임
	}
}
