package day21;

public class Class_practice_3 {

	public static void main(String[] args) {
			System.out.println(Car.wheel);
			//System.out.println(Car.speed); 오류, 인스턴스 변수는 인스턴스를 생성해야만 접근
			//가능하다. wheel은 클래스 변수라 접근 가능
			
			Car myCar1=new Car();
			System.out.println(myCar1.speed);
			
			Car myCar2=new Car();
			
			System.out.println("<변경 전>");
			System.out.println("myCar1.speed:"+myCar1.speed);
			System.out.println("myCar2.speed:"+myCar2.speed);
			System.out.println("myCar1.wheel:"+myCar1.wheel);
			System.out.println("myCar2.wheel:"+myCar2.wheel);
	
			myCar2.speed=100;
			myCar2.wheel=5;
			
			System.out.println("<변경 후>");
			System.out.println("myCar1.speed:"+myCar1.speed);
			System.out.println("myCar2.speed:"+myCar2.speed);
			System.out.println("myCar1.wheel:"+myCar1.wheel);
			System.out.println("myCar2.wheel:"+myCar2.wheel);
	
			
	}
	

}

class Car{
		static int wheel=4;	//클래스변수, 메인함수에서 볼드체가 된다.
		int speed;	//인스턴스변수
}