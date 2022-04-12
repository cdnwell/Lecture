package day36;

public class Generic2 {

	public static void main(String[] args) {
		//A a1=new A();
		//제네릭 타입 표시 안해서 경고가 나온다.
		A<Integer>a1=new A<>();
		//new A<Integer>();라고 표시하지 않아도 자동으로 기입된다.
		//a1.x='A';
		//정수형이라 오류 발생
		a1.x=10;
		a1.y=20;
		System.out.println(a1.x+a1.y);
		
		A<String>a2=new A<>();
		a2.x="hello";
		a2.y=" world!";
		System.out.println(a2.x+a2.y);
		
	}

}

class A<T>{
	T x;
	T y;
	//field x와 멤버변수인 y를 만들었다.
}