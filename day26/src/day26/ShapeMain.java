package day26;

public class ShapeMain {
	public static void main(String[] args) {
		Shape shapes[]=new Shape[3];
		//부모의 객체배열 요소에 자식 값 넣기 > 업캐스팅이다.
		shapes[0]=new Rect();
		shapes[1]=new Circle();
		shapes[2]=new Line();
		
		for(int i=0;i<3;i++)
		{
			shapes[i].draw();
		}
	}
}

abstract class Shape{
	abstract void draw();
	//abstract void f1();
	//위의 추상메서드가 불가능한 이유는 자식이 구현하지 않았기 때문이다.
	//void draw() {
	//	System.out.println("도형을 그리다");
	//}
}
class Rect extends Shape{
	void draw() {
		System.out.println("사각형을 그리다");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("원을 그리다");
	}
}
class Line extends Shape{
	void draw() {
		System.out.println("선을 그리다");
	}	
}