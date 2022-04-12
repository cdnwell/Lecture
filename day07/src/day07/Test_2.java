package day07;

import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id,password;
		Scanner input=new Scanner(System.in);
		System.out.print("id를 입력해주세요:");
		id=input.nextLine();
		if(id.equals("java"))
		{
			System.out.println("id가 맞습니다.");
			System.out.print("비밀번호를 입력해주세요:");
			password=input.nextLine();
			if(password.equals("abc123"))
			{
				System.out.println("비밀번호가 맞습니다.");
				System.out.println("로그인 되었습니다.");
			}
			else
			{
				System.out.println("비밀번호가 틀립니다.");
				System.out.println("로그인에 실패하였습니다.");
			}
		}
		else
		{
			System.out.println("id가 옳바르지 않습니다.");
		}
	}
	

}
