package day05;

public class Logic_operator {

	public static void main(String[] args) {
		boolean a=true;
		boolean b=false; //논리형 b변수에 false 값 저장
		boolean c=true; //논리형 c변수에 true 값 저장
		
		System.out.println(a&&b); //a값과 b값이 모두 참일 때만 결과가 참 : AND
		System.out.println(a&&c); //a값c값비교 모두 참일경우 참
		System.out.println((2<4)&&(4<5));//true&&true = true
		
		System.out.println(a||b); //a혹은 b가 true라면 결과가 true : OR
		System.out.println(a||c); //a혹은 c가 true라면 결과가 true : OR
		System.out.println(b||b); //false || false == false ,false가 나오는 경우 수 한가지
		
		System.out.println(!a); //a가 true이면 false false이면 true

	}

}
