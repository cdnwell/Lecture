package day24;

public class SuperConstructor {

	public static void main(String[] args) {
		SportsCar mycar=new SportsCar("red",300);
		System.out.println(mycar.color);
		System.out.println(mycar.speedLimit);
	}

}
class Car{
	int wheel;
	int speed;
	String color;
	//Car(){}
	//�θ�Ŭ������ ����Ʈ �����ڰ� �ִٸ� �Ʒ� �ڵ尡 ���� �����ϴ�.
	Car(String color){
		this.color=color;
		//�Ű����� ������
	}
}
class SportsCar extends Car{
	int speedLimit;
	SportsCar(String color,int speedLimit){
		super(color);
		//�θ� Ŭ����(super class)�� ����Ʈ �����ڸ� �����ϰų� �ڽ�Ŭ����(sub class)��
		//super(color);�� �����صθ� �ڵ尡 ���డ���� ����.
		this.color=color;
		this.speedLimit=speedLimit;
	}
}