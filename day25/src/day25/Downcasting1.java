package day25;

public class Downcasting1 {

	public static void main(String[] args) {
		//업캐스팅
		Human h1=new Student("가길동",20,"게임하기",3);
		//Human h1=(Human)new Student("가길동",20,"게임하기",3);
		//h1.study();
		//오류
		//다운캐스팅
		Student s1=(Student)h1;
		s1.study();
		//다운캐스팅은 명시적 형변환이 필수적이다.
	}

}
