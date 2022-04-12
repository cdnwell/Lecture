package day24;
//부모에게서 메서드 상속 받기
//class 자식클래스명 extends 부모클래스명 {}
public class Inheritance1 {
	public static void main(String[] args) {
		Student st = new Student();
		st.breath();
		st.learn();
		
		Teacher t= new Teacher();
		t.eat();
		t.teach();
	}

}

class Person{
	void breath() {
		System.out.println("숨쉬기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("말하기");
	}
}

class Student extends Person{
	void learn() {
		System.out.println("배우기");
	}
}

class Teacher extends Person{
	void teach() {
		System.out.println("가르치기");
	}
}