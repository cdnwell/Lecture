package day10;

//import java.util.Random;
//import java.util.Scanner;
import java.util.*;
//*의 의미는 util 패키지에 있는 모든 클래스를 가져오라는 정의

public class UpdownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random random =new Random();
		
		int num=random.nextInt(100)+1;
		int user=-1;
		while(user!=num) {
			System.out.print("숫자 입력:");
			user=sc.nextInt();
			//user==num 반복 끝
			if(user==num)
			{
				System.out.println("정답입니다.");
			}
			else if(user>num)
			{
				System.out.println("Down");
			}
			else
			{
				System.out.println("Up");
			}
		}
			
	}

}
