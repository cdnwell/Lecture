package day05;

public class Xor_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=15;	//1111(2)
			int b=5;	//0101(2)
			//비트 논리연산자
			System.out.println(a&b); //0101(2)=5
			System.out.println(a|b); //1111(2)=15
			System.out.println(a^b); //1010(2)=10
			
			System.out.println(~b);  //1010(2)=10 <- -6이 나온다.
			//비트 쉬프트 연산자
			System.out.println(a>>2);
			System.out.println(b<<4);
			
	}

}
