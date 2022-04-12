package day25;

public class Polymorphism4 {
	public static void main(String[] args) {
		Animal lion1=new Lion();
		Animal rabbit1=new Rabbit();
		Animal monkey1=new Monkey();
		Lion l=new Lion();
		//Lion 클래스에 속하는 매개변수(참조변수) l 이 경우에도 아래의 메서드가 실행 가능하다.
		//int i=2; i값을 feed의 매개변수로 주면 실행불가
		ZooKeeper james=new ZooKeeper();
		james.feed(lion1);
		james.feed(rabbit1);
		james.feed(monkey1);
		//lion이 들어갈수 있는 이유는 animal 타입이기 때문에 들어갈 수 있다.
	}

}
class Animal{
	void breath() {System.out.println("숨쉬기");}
}
class Lion extends Animal{
	public String toString(){
		//object클래스 toString()메서드 오버라이딩
		return "사자";
	}
}
class Rabbit extends Animal{
	public String toString(){
		//object클래스 toString()메서드 오버라이딩
		return "토끼";
	}
}
class Monkey extends Animal{
	public String toString(){
		//object클래스 toString()메서드 오버라이딩
		return "원숭이";
	}
}
class ZooKeeper{
	void feed(Animal animal) {
		System.out.println(animal+"에게 먹이주기");
	}
}