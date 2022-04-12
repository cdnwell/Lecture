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
		System.out.println("ü���� �ܷ��մϴ�.");
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
		System.out.println("���� �۽��ϴ�.");
		
	}

	@Override
	void prepareArmor() {
		// TODO Auto-generated method stub
		System.out.println("������ �Խ��ϴ�.");
	}

	}

	 class Archer extends Person{

	@Override
	void prepareWeapon() {
		// TODO Auto-generated method stub
		System.out.println("Ȱ�� �����մϴ�.");
	}

	@Override
	void prepareArmor() {
		// TODO Auto-generated method stub
		
	}

	boolean isUsingPrepareOther() {
		return true;
	}

	void prepareOther() {
		System.out.println("ȭ���� �غ��մϴ�.");
	}
	}

	 class Wizard extends Person{

	@Override
	void prepareWeapon() {
		// TODO Auto-generated method stub
		System.out.println("�����̸� �غ��մϴ�.");
	}

	@Override
	void prepareArmor() {
		// TODO Auto-generated method stub
		System.out.println("�κ긦 �Խ��ϴ�.");
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

