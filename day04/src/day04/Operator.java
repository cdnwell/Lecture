package day04;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=10; //a 변수에 10 저장
			int b=3; //b 변수에 3 저장
			double doubleB=3; //자동형변환, 묵시적 형변환
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			//정수 나누기 정수는 정수가 된다.
			System.out.println(a%b);
			
			System.out.println(a/doubleB);
			System.out.println(a%doubleB);
			System.out.println(doubleB%b);
			//정수 나누기 실수는 실수가 나온다. 나머지 계산에서도 마찬가지
	}

}
