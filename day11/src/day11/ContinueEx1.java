package day11;

import java.util.Scanner;

public class ContinueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int num;
			while(true) {
				System.out.println("숫자입력:");
				num=sc.nextInt();
				//num==0 종료
				//num<0 다시 반복 시작
				if(num==0)
				{
					break;
				}
				else if(num<0)
				{
					System.out.println("아래 명령 무시하고 다음 반복시행");
					continue;
				}
				System.out.println("num:"+num);
				
			}
	}

}
