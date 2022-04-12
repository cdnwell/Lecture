package day13;
//import java.util.Random;
//import java.util.Scanner;
//프로젝트.패키지.클래스-> 메소드
import java.util.*;//java.util패키지에 있는 모든 클래스 import하기

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int lottoAr[]=new int[6];
		int userAr[]=new int[6];
		
		int bonus;		//랜덤으로 가져올 값
		int bonusUser;	//사용자가 입력한 보너스 값
		//int bonus,bonusUser;와 위 두 문장은 같은 문장이다.
		int count=0;
		//0으로 초기화 하는 이유
		
		//로또 배열 6개에 랜덤 값을 저장한다.
		for(int i=0;i<6;i++)
		{
			lottoAr[i]=random.nextInt(45)+1;
		}
		//bonus값도 랜덤 값 저장
		bonus = random.nextInt(45)+1;
		
		System.out.println("Lotto:"+Arrays.toString(lottoAr)+", bonus:"+bonus);
		//사용자에게 6개의 값을 입력
		System.out.println("숫자 6개 입력:");
		for(int i=0;i<6;i++)
		{
			userAr[i]=sc.nextInt();
		}
		System.out.print("보너스 값 입력:");
		bonusUser=sc.nextInt();
		System.out.println("User:"+Arrays.toString(userAr)+",bonus:"+bonusUser);
		//로또 배열의 값과 사용자 배열의 값중 같은 값이 있다면 몇 개 있는지 카운팅
		
		for (int j=0;j<6;j++) {
			for(int i=0;i<6;i++)
			{
				if(lottoAr[j]==userAr[i]) {
					count++;
				}
			}
		}
		System.out.println("총 맞춘 갯수:"+count);
		//count의 갯수에 따라 등수를 정핤 ㅜ 있다.
		if(count==6) {
			System.out.println("축하드립니다! 1등입니다!");
		}
		else if(count==5)
		{
			if(bonus==bonusUser) {
				System.out.println("축하드립니다! 2등입니다!");
			}
			else {
				System.out.println("축하드립니다! 3등입니다!");
			}
			
		}
		else if(count==4) {
			System.out.println("축하드립니다! 4등입니다!");
		}
		else if(count==3) {
			System.out.println("축하드립니다! 5등입니다!");
		}
		else {
			System.out.println("꽝입니다. 다시 도전해주세요.");
		}
			
		
		

	}

}
