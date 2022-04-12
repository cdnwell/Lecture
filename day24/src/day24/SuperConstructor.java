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
	//부모클래스에 디폴트 생성자가 있다면 아래 코드가 실행 가능하다.
	Car(String color){
		this.color=color;
		//매개변수 생성자
	}
}
class SportsCar extends Car{
	int speedLimit;
	SportsCar(String color,int speedLimit){
		super(color);
		//부모 클래스(super class)에 디폴트 생성자를 생성하거나 자식클래스(sub class)에
		//super(color);를 설정해두면 코드가 실행가능해 진다.
		this.color=color;
		this.speedLimit=speedLimit;
	}
}