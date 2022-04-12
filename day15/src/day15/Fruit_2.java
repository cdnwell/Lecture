package day15;

import java.util.Scanner;

public class Fruit_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fruits[]=new String[3];
		for(int i=0;i<3;i++)
		{
			System.out.print("구입할 과일:");
			fruits[i]=sc.next();
		}
		System.out.println("--구입한 과일 목록--");
		for(String eachFruit_2:fruits) {
			System.out.print(eachFruit_2+" ");
		}
	}

}
