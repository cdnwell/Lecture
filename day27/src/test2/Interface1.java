package test2;

public class Interface1 {
	public static void main(String[] args) {
		B b=new B();
		b.method1();
		b.method2();
		System.out.println(Ainter.x);
		System.out.println(Ainter.y);
	}
}
interface Ainter{
	final int x=10;
	final int y=20;
	abstract void method1();
	abstract void method2();
}
class B implements Ainter{
	public void method1() {
		System.out.println("method1()");
	}
	public void method2() {
		System.out.println("method2()");
	}
}