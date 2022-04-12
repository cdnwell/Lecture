package test01;

//Scanner 클래스의 객체를 담는 정수형 변수 y는 앞에 프린트문이 없으면 실행되지 않는다.
//앞에 하나라도 있으면 실행되는 듯 하다.

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int y;
		int num;
		//System.out.println("불기연도 입력!");
		while(true) {
			//System.out.println("☆★☆★불기연도를 서기연도로 바꿉니다☆★☆★");
			//System.out.print("불기연도를 입력해주세요:");
			y=sc.nextInt();
			if(y>=1000 && y<=3000) {
				num=y-543;
				System.out.println("입력하신 불기연도:"+y);
				System.out.println("바뀐 서기연도:"+num);
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(y==0) {
				System.out.println("루프를 중단합니다!");
				break;
			}else
			{
				System.out.println("숫자는 1000이상 3000이하로 적어주세요.");
			}
		}
	}
}