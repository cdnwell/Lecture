package day35;

import java.io.FileInputStream;
import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
		try {
			FileInputStream fls=new FileInputStream("src//day35//sample.txt");
			//���ϰ�θ� ���������� �ƴ� ������ �ΰ��� ���ϰ�θ� �Է��Ѵ�.
			Scanner s =new Scanner(fls);
			while(s.hasNext()){
				System.out.println(s.nextLine());
				//���Ͽ��� �� �� �� �������ٴ�.
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
