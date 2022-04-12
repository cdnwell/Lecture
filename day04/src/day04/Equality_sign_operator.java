package day04;

import java.util.Scanner;

public class Equality_sign_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double a =3.14; //실수형 변수 a에 3.14저장
			double b =5.14; //실수형 변수 b에 5.14저장
			System.out.println(a==b); //a와 b가 같은가
			System.out.println(a!=b); //a와 b가 다른가
			
			String c1="Hello JAVA!"; //c1문자열 변수에 "Hello JAVA!" 값에 저장
			System.out.println(c1=="Hello JAVA!");
			System.out.println(c1.equals("Hello JAVA!"));
			System.out.println(c1.equals("hello java!")); 
			//문자열은 대문자 소문자 비교도한다.
			int num[]=new int[3];
			
			Scanner sc=new Scanner(System.in);
			
			int split;
			split=10;
			System.out.println(split);
	}

}
