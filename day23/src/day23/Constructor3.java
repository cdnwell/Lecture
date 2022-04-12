package day23;

public class Constructor3 {

	public static void main(String[] args) {
		Bclass b1=new Bclass("가길동");
		//b2=new Bclass(); 오류, 디폴트 생성자가 자동적으로 생성되지 않는다.
		System.out.println(b1.name);
		Bclass b=new Bclass();
		System.out.println(b);
	}

}
class Bclass{
	String name;
	Bclass(){}
	Bclass(String name){ //매개변수 생성자
		System.out.println("Bclass의 매개변수 생성자( )");
		this.name=name;
		//name=name2와 같다
	}
}