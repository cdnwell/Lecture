package day28;

public class Anonymous3 {

	public static void main(String[] args) {
		Inter1 it=new Inter1() {

			@Override
			public void f1() {
				System.out.println("inter1 imple f1()");
			}};
			it.f1();
		//불가능 인터페이스는 객체를 생성할 수 없다.
		//클래스를 1회성으로 사용한다면 클래스를 굳이 사용하지 않고
		//익명클래스를 통해 인터페이스의 객체를 생성
	}

}
interface Inter1 {
	void f1();
}
//아래는 일반클래스이고 인터페이스를 객체로 만들기 위해 만듦
class Inter1Impl implements Inter1{
	public void f1() {
		System.out.println("인터페이스의 객체를 위한 클래스");
	}
}