package day28;

public class InnerClass1 {
	public static void main(String[] args) {

	}

}
class A{
	static class StaticInner{}
	class InstanceInner{}
	//인스턴스 클래스와 스태틱 클래스는 멤버변수와 동일한 위치에 선언된다.
	//두 클래스가 객체 생성이 가능한지 확인함
	StaticInner st1=new StaticInner();
	InstanceInner ii1=new InstanceInner();
	
	static void StaticMethod() {
		StaticInner st2=new StaticInner();
		//InstanceInner ii2=new InstanceInner(); > 스태틱 메서드는 인스턴스 멤버에 접근
		//불가능 하다. 스태틱이라 붙이면 메모리에 저장되는 영역이 다르기 때문이다.
	}
	void InstanceMethod() {
		StaticInner st3= new StaticInner();
		InstanceInner ii3=new InstanceInner();
		//인스턴스 메서드는 스태틱 클래스, 인스턴스 클래스 모두 접근 가능하다.
	}
}