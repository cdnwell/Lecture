package day35;

import java.io.FileInputStream;
import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
		try {
			FileInputStream fls=new FileInputStream("src//day35//sample.txt");
			//파일경로를 역슬래쉬가 아닌 슬래쉬 두개로 파일경로를 입력한다.
			Scanner s =new Scanner(fls);
			while(s.hasNext()){
				System.out.println(s.nextLine());
				//파일에서 한 줄 씩 가져오겟다.
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
