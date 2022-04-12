package bootcamp01;

abstract class Person {
	
	void readyToBattle() {
		startBodyTraining();
		prepareWeapon();
		prepareArmor();
		if( isUsingPrepareOther()) {
			prepareOther();
		}
	}

	final void startBodyTraining() {
		System.out.println("체력을 단련합니다.");
	}
	
	abstract void prepareWeapon();
	
	abstract void prepareArmor();
	
	boolean isUsingPrepareOther() {
		return false;
	}
	
	void prepareOther() {};
	
	
	
}


 class Warrior extends Person{

	@Override
	void prepareWeapon() {
		// TODO Auto-generated method stub
		System.out.println("검을 닦습니다.");
		
	}

	@Override
	void prepareArmor() {
		// TODO Auto-generated method stub
		System.out.println("갑옷을 입습니다.");
	}

	}

	 class Archer extends Person{

	@Override
	void prepareWeapon() {
		// TODO Auto-generated method stub
		System.out.println("활을 손질합니다.");
	}

	@Override
	void prepareArmor() {
		// TODO Auto-generated method stub
		
	}

	boolean isUsingPrepareOther() {
		return true;
	}

	void prepareOther() {
		System.out.println("화살을 준비합니다.");
	}
	}

	 class Wizard extends Person{

	@Override
	void prepareWeapon() {
		// TODO Auto-generated method stub
		System.out.println("지팡이를 준비합니다.");
	}

	@Override
	void prepareArmor() {
		// TODO Auto-generated method stub
		System.out.println("로브를 입습니다.");
	}

	}

public class PatternTemplate {

	



	
	public static void main(String[] args) {
		
		
		Warrior warrior =new Warrior();
		warrior.readyToBattle();
		System.out.println();
		Archer archer = new Archer();
		archer.readyToBattle();
		System.out.println();
		Wizard wizard = new Wizard();
		wizard.readyToBattle();
		
		
	}

	
	
}

