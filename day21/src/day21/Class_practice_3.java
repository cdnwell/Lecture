package day21;

public class Class_practice_3 {

	public static void main(String[] args) {
			System.out.println(Car.wheel);
			//System.out.println(Car.speed); ����, �ν��Ͻ� ������ �ν��Ͻ��� �����ؾ߸� ����
			//�����ϴ�. wheel�� Ŭ���� ������ ���� ����
			
			Car myCar1=new Car();
			System.out.println(myCar1.speed);
			
			Car myCar2=new Car();
			
			System.out.println("<���� ��>");
			System.out.println("myCar1.speed:"+myCar1.speed);
			System.out.println("myCar2.speed:"+myCar2.speed);
			System.out.println("myCar1.wheel:"+myCar1.wheel);
			System.out.println("myCar2.wheel:"+myCar2.wheel);
	
			myCar2.speed=100;
			myCar2.wheel=5;
			
			System.out.println("<���� ��>");
			System.out.println("myCar1.speed:"+myCar1.speed);
			System.out.println("myCar2.speed:"+myCar2.speed);
			System.out.println("myCar1.wheel:"+myCar1.wheel);
			System.out.println("myCar2.wheel:"+myCar2.wheel);
	
			
	}
	

}

class Car{
		static int wheel=4;	//Ŭ��������, �����Լ����� ����ü�� �ȴ�.
		int speed;	//�ν��Ͻ�����
}