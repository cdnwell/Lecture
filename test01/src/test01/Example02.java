package test01;

//import java.util.Scanner;
import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,y;
		int num1,num2,num3;
		int sum;
		System.out.println("세자리 정수 두개를 입력하시오");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("   "+x);
		System.out.println("x  "+y);
		System.out.println("------");
		System.out.println("  "+(y%100%10)*x);
		System.out.println(" "+(y%100/10)*x);
		System.out.println((y/100)*x);
		System.out.println("------");
		System.out.println(y*x);
		
	}

}
