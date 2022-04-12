package day28;

public class Anonymous4 {

	public static void main(String[] args) {
		//Abstract ab = new Abstract(); 불가능 
		//추상클래스도 인터페이스와 같이 객체 생성 불가능
		Abstract ab=new Abstract() {

			@Override
			void f2() {
				System.out.println("Abstract extends f2()");
			}
		};
		ab.f2();
	}
}
abstract class Abstract{
	abstract void f2();
}

//익명클래스는 추상 클래스나 인터페이스 객체 생성을 위해 만든다.