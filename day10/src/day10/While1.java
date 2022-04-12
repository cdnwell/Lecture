package day10;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//ctrl+shift+o > import
		String answer="Y"; //우선은 while문이 실행되도록 초기 값이 조건이 참이 되도록 설정
		int count=0;
		while(answer.equals("Y"))
		{
			System.out.print("음악을 재생하시겠습니까?:");
			answer=sc.nextLine();
			
			if(answer.equals("Y"))
			{
				System.out.printf("음악을 %d번 재생했습니다.\n",++count);
			}
		}
		System.out.println("재생종료");
	}

}
