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
				"�ٴҶ� ���̽�ũ��",
				"���� ���̽�ũ��",
				"���� ���̽�ũ��",
				"��Ű ���̽�ũ��"
				};
		String []ic_pick=new String[4];
		
		while(true) {
			System.out.println("�ޡߡޡ߾��̽�ũ�� ���ԡޡߡޡ�");
			System.out.println("1.�޴� �ֹ�");
			System.out.println("2.�޴� ���");
			System.out.println("3.�޴� ���");
			System.out.println("4.������");
			
			menu_num=sc.nextInt();
			if(menu_num==1) {
				System.out.println("�ޡߡޡ߾��̽�ũ�� �����ޡߡޡ�");
				System.out.println("1."+ic[0]+"\t 1200��");
				System.out.println("2."+ic[1]+"\t 800��");
				System.out.println("3."+ic[2]+"\t 1000��");
				System.out.println("4."+ic[3]+"\t 1500��");
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
					System.out.println("---�� �̻� ���̽�ũ���� ���� �� �����ϴ�.---");
					continue;
				}
				
			}else if(menu_num==2) {
				System.out.println("�ޡߡޡ߸޴� ��ҡޡߡޡ�");
				for(int i=0;i<count;i++) {
					System.out.println(i+1+"."+ic_pick[i]);
				}
				System.out.print("����� ��ȣ:");
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
						System.out.println("�߸��� ��ȣ�� �Է���!");
					}
						
					for(int i=cancle_num-1;i<count-1;i++) {
						ic_pick[i]=ic_pick[i+1];
					}
					
					count--;
				}
				
			}else if(menu_num==3) {
				System.out.println("�ޡߡޡ߸޴� ���ޡߡޡ�");
				if(money_pick==0) {
					System.out.println("����Ͻ� ���̽�ũ���� ���� �����̽��ϴ�!");
				}else {
					System.out.println("����Ͻ� �ݾ�:"+money_pick);
					System.out.println("����Ͻðڽ��ϱ�?(Y/N)");
					yorn=sc.next();
					if(yorn.equals("Y")) {
						if(money<money_pick) {
							System.out.println("������ ��� ���� �����մϴ�!");
						}else {
							money=money-money_pick;
							System.out.println("�� ��� �ݾ�:"+money_pick);
							System.out.println("���� ��:"+money);
							money_pick=0;
							count=0;
						}
						
					}else if(yorn.equals("N")) {
						System.out.println("����� ��� �ϼ̽��ϴ�.");
					}else {
						System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");
					}
					
				}
				
			}else if(menu_num==4) {
				System.out.println("���Ը� �����ϴ�.");
				break;
			}
			

			
		}//while�� ������ ���� ��ȣ
		
	}

}