package day20;

public class FirstClass {
	public static void main(String[] args) {
		//자료형 변수=객체값;
		//자료형의 의미는 내가 저장할 값이 어떤 값인지 알기 위해
		//클래스명 참조변수=new 클래스명();
		ClassA ca=new ClassA();
		System.out.println(ca.x);
		ca.f1();
	
		ca.x=30;
		System.out.println(ca.x);
	}

}
//main이 있는 클래스만 public이 붙고 나머지 클래스에는 public이 붙지 않는다.
class ClassA{
	int x=10;
	void f1() {
		System.out.println("f1()");
	}
	
}