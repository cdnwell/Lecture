package test;

import java.util.Scanner;

public class MenuCafe {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int money=10000;
		int menu_num;
		int ic_num;
		int cancle_num;
		int money_pick=0;
		String yorn;
		String []ic= {
				"바닐라 아이스크림",
				"초코 아이스크림",
				"딸기 아이스크림",
				"쿠키 아이스크림"
				};
		String []ic_pick=new String[4];
		
		while(true) {
			System.out.println("◇◆◇◆아이스크림 가게◇◆◇◆");
			System.out.println("1.메뉴 주문");
			System.out.println("2.메뉴 취소");
			System.out.println("3.메뉴 계산");
			System.out.println("4.나가기");
			
			menu_num=sc.nextInt();
			if(menu_num==1) {
				System.out.println("◇◆◇◆아이스크림 종류◇◆◇◆");
				System.out.println("1."+ic[0]+"\t 1200원");
				System.out.println("2."+ic[1]+"\t 800원");
				System.out.println("3."+ic[2]+"\t 1000원");
				System.out.println("4."+ic[3]+"\t 1500원");
				ic_num=sc.nextInt();
				if(count>=0 && count <4) {
					if(ic_num==1) {
						ic_pick[count]=ic[0];
						money_pick += 1200;
						count++;
					}else if(ic_num==2) {
						ic_pick[count]=ic[1];
						money_pick += 800;
						count++;
					}else if(ic_num==3) {
						ic_pick[count]=ic[2];
						money_pick += 1000;
						count++;
					}else if(ic_num==4) {
						ic_pick[count]=ic[3];
						money_pick += 1500;
						count++;
					}
				}else {
					System.out.println("---더 이상 아이스크림을 고르실 수 없습니다.---");
					continue;
				}
				
			}else if(menu_num==2) {
				System.out.println("◇◆◇◆메뉴 취소◇◆◇◆");
				for(int i=0;i<count;i++) {
					System.out.println(i+1+"."+ic_pick[i]);
				}
				System.out.print("취소할 번호:");
				cancle_num=sc.nextInt();
				if(1<=cancle_num && cancle_num<=count){
					
					if(ic_pick[cancle_num-1].equals(ic[0])){
						money_pick -= 1200;
					}else if(ic_pick[cancle_num-1].equals(ic[1])){
						money_pick -= 800;
					}else if(ic_pick[cancle_num-1].equals(ic[2])){
						money_pick -= 1000;
					}else if(ic_pick[cancle_num-1].equals(ic[3])){
						money_pick -= 1500;
					}else{
						System.out.println("잘못된 번호를 입력함!");
					}
						
					for(int i=cancle_num-1;i<count-1;i++) {
						ic_pick[i]=ic_pick[i+1];
					}
					
					count--;
				}
				
			}else if(menu_num==3) {
				System.out.println("◇◆◇◆메뉴 계산◇◆◇◆");
				if(money_pick==0) {
					System.out.println("계산하실 아이스크림을 고르지 않으셨습니다!");
				}else {
					System.out.println("계산하실 금액:"+money_pick);
					System.out.println("계산하시겠습니까?(Y/N)");
					yorn=sc.next();
					if(yorn.equals("Y")) {
						if(money<money_pick) {
							System.out.println("가지고 계신 돈이 부족합니다!");
						}else {
							money=money-money_pick;
							System.out.println("총 계산 금액:"+money_pick);
							System.out.println("남은 돈:"+money);
							money_pick=0;
							count=0;
						}
						
					}else if(yorn.equals("N")) {
						System.out.println("계산을 취소 하셨습니다.");
					}else {
						System.out.println("잘못된 문자를 입력하셨습니다.");
					}
					
				}
				
			}else if(menu_num==4) {
				System.out.println("가게를 나갑니다.");
				break;
			}
			

			
		}//while문 마지막 물결 골호
		
	}

}