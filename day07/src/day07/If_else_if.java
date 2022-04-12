package day07;

import java.util.Scanner;

public class If_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ctrl+shift+o scanner 사용시 필요한 것 import
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("나이:");
		age=sc.nextInt();
		
		if(age>19)
		{
			System.out.println("성인입니다.");
			System.out.println("성인 요금이 적용됩니다.");
		}
		else if(age>13) // 13<age<=19 
		{
			System.out.println("청소년입니다.");
			System.out.println("청소년 요금이 적용됩니다.");
		}
		else if(age>8) // 8<age<=13 //else 는 바로 위의 조건문만을 부정한다.
		{
			System.out.println("어린이입니다.");
			System.out.println("어린이 요금이 적용됩니다.");
		}
		else
		{
			System.out.println("유아입니다.");
			System.out.println("유아 요금이 적용됩니다.");
		}
		System.out.println("결제를 진행해 주세요.");
		
	}

}
