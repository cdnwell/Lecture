package day03;

public class Prca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=3;
			a=4;
			
			final double PI=3.14;
			//PI=3.15; 오류
			//final이란 로컬(지역) 변수는 바꿀 수 없다.
			System.out.println(PI);
			
			System.out.println(PI-1);
			
			//PI=PI-1;
			
			//final 변수 아래 값은 처리가 안된다. 런타임 실행 시 오류가 나지는 않으나 버그가 발생하는 듯
			//System.out.println(PI);
			//System.out.println("확인");
	}

}
