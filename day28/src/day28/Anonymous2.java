package day28;

public class Anonymous2 {
	public static void main(String[] args) {
		OuterClass1 o=new OuterClass1() {
			void a() {
				System.out.println("새롭게 정의된 익명클래스 메서드입니다.");
			}
		};
		o.a();
		OuterClass1 ok=new OuterClass1();
		ok.a();
		//익명클래스는 1회성이다.
		//익명클래스를 다른 클래스에도 적용하고 싶다면 또 다시 만들어야 한다.
	}
}
class OuterClass1{
	void a() {System.out.println("method a");}
	void b() {}
}