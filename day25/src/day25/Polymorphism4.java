package day25;

public class Polymorphism4 {
	public static void main(String[] args) {
		Animal lion1=new Lion();
		Animal rabbit1=new Rabbit();
		Animal monkey1=new Monkey();
		Lion l=new Lion();
		//Lion Ŭ������ ���ϴ� �Ű�����(��������) l �� ��쿡�� �Ʒ��� �޼��尡 ���� �����ϴ�.
		//int i=2; i���� feed�� �Ű������� �ָ� ����Ұ�
		ZooKeeper james=new ZooKeeper();
		james.feed(lion1);
		james.feed(rabbit1);
		james.feed(monkey1);
		//lion�� ���� �ִ� ������ animal Ÿ���̱� ������ �� �� �ִ�.
	}

}
class Animal{
	void breath() {System.out.println("������");}
}
class Lion extends Animal{
	public String toString(){
		//objectŬ���� toString()�޼��� �������̵�
		return "����";
	}
}
class Rabbit extends Animal{
	public String toString(){
		//objectŬ���� toString()�޼��� �������̵�
		return "�䳢";
	}
}
class Monkey extends Animal{
	public String toString(){
		//objectŬ���� toString()�޼��� �������̵�
		return "������";
	}
}
class ZooKeeper{
	void feed(Animal animal) {
		System.out.println(animal+"���� �����ֱ�");
	}
}