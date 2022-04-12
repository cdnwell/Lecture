package day04;

public class Operator_ch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=1; 
			System.out.println(a);
			
			a++; //a값 증가, 후위형
			System.out.println(a); //a=a+1; a=2;
			System.out.println(++a); //명령이 두개다 모니터에 출력해달라, 
			//a의 값을 증가시켜달라, 전위형 a증가 연산자, 결과 3 먼저 증가 시키고 출력
			System.out.println(a++); //증가 연산자 a , 후위형, 출력값은 3, 출력 후 연산
			System.out.println(a);	//a값 증가 4가 나온다. 증감연산자에서 중요한것은
			//전위형과 후위형을 구분하는 것이다.
			
	}

}
