package day27;

public class Interface1 {

	public static void main(String[] args) {
		//Ainter a;
		//인터페이스는 추상클래스와 마찬가지로 객체를 생성할수 없어서 new 생성자 클래스를 사용하지 않는다.
		//Ainter.x=20; 불가능하다. final 키워드가 생략되도 상수
		B b =new B();
		b.methodA();
		b.methodB();
		System.out.println(b.x);
		//b.x=30; 불가능
	}

}

interface Ainter{//interface는 interface 명+inter라는 이름으로 자주 쓰인다.
	final int x=10;
	int y=20;		//final 생략 가능 타입의 상수가 된다.
	abstract void methodA();
	void methodB();		//추상화 생략 가능 생략되어도 추상메서드로 간주된다. 변수와 마찬가지
}
class B implements Ainter{

	@Override
	public void methodA() {
		System.out.println("methodA()");
	}

	@Override
	public void methodB() {
		System.out.println("methodB()");
	}
	
}