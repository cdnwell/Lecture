package test02;

import java.util.Scanner;

public class Packaging2 {

	public static void main(String[] args) {
		int n;		//n은 입력 받은 한라봉 무게입니다.
		int box;	//box는 필요한 최소 상자 갯수입니다.
		int total,tmp1,tmp2,tmp3,tmp4;	//tmp는 임시 값 입니다. total은 상자의 총 갯수 입니다.
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("포장할 한라봉 총 kg :");
		n=sc.nextInt();
		if(n>=1 && n<=1000000) {

			tmp1=n/10;			//10kg 상자 갯수 tmp1
			tmp2=n%10;
			tmp2=tmp2/5;		//5kg 상자 갯수 tmp2
			tmp3=n%5;
			tmp3=tmp3/3;		//3kg 상자 갯수 tmp3
			tmp4=(n%5)%3;		//1kg 상자 갯수 tmp4
			
			total=tmp1+tmp2+tmp3+tmp4;
			
			System.out.println("최소 상자 갯수는 "+total+"개 입니다.");
			System.out.println("10kg 상자 갯수:"+tmp1);
			System.out.println("5kg 상자 갯수:"+tmp2);
			System.out.println("3kg 상자 갯수:"+tmp3);
			System.out.println("1kg 상자 갯수:"+tmp4);	
		}
		else {
			System.out.println("n값의 범위는 1이상 1000000이하 입니다.");
		}
	}

}
