package Design_Pattern.chapter1;

public class Main {

	public static void main(String[] args) {
//		Ainterface ainterface = new AinterfaceImpl();
//		
//		ainterface.funcA();
		
//		AObject aobj = new AObject();
//		aobj.funcAA();
		
		GameCharacter character = new GameCharacter();
		
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();
		
		character.setWeapon(new Ax());
		character.attack();
	}

}
   