package day25;
//글꼴 크기 조정 ctrl+shift+(+ (or) -)
public class Upcasting1 {

	public static void main(String[] args) {
		Student st1=new Student("가길동",20,"게임하기",3);
		st1.info();
		st1.study();
		//가능
		System.out.println(st1.grade);
		//가능
		
		//업캐스팅
		Human h1=new Student("나길동",30,"롤하기",3);
		h1.info();
		//h1.study();
		//study() 메서드를 사용할 수 없다.
		//System.out.println(h1.grade);
		//불가능 부모클래스에 자리가 없기 때문이다.
	}

}

class Human{
	String name;
	int age;
	String hobby;
	
	public Human(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	void info() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("hobby:"+hobby);
	}
}
class Student extends Human{
	//그냥 student extends Human을 하면 디폴트 생성자가 없으면 오류가난다.
	int grade;
	public Student(String name, int age, String hobby,int grade) {
		super(name,age,hobby);
		//부모 클래스의 매개변수 생성자를 호출하겠다. super(매개변수..);
		//생성자를 생성해 놓으면
		//디폴트 생성자를 자동으로 생성하지 않는다.
		this.grade=grade;		
	}
	void info() {//오버라이딩
		super.info();
		//부모클래스 영역의 info이다. super class = 부모 클래스
		//sub class = 자식 클래스
		System.out.println("grade:"+grade);
		
	}
	void study() {
		System.out.println("공부하기");
	}
}
