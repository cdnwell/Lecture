package test01;

import java.util.Scanner;

public class Break_even_point {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a,b,c;
		long point;
		System.out.println("총 비용, 노트북 한 대 생산비용, 노트북 가격");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		point=a/(c-b)+1;
		if(point<=0) {
			System.out.println("-1");
		}else {
			System.out.println(point);
		}
		
		
	}

}
