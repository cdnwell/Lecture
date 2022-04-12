package day15;

import java.util.Arrays;

public class Array_4 {
	public static void main(String[] args) {
			int [] a= {1,2,3,4,5,6};
			int [] b= {0,0,0,0,0,0,0};
			System.out.println(Arrays.toString(a));
			//Arrays.toString(변수명) 배열의 요소를 모두 출력한다.
			//ctrl+shift+o > import java.util.Arrays; 
			//프로젝트,패키지,클래스에 들어있는 메소드를 사용한다
			System.out.println(Arrays.toString(b));
			
			System.arraycopy(a, 2, b, 3, 4);
			System.out.println(Arrays.toString(b));
			
	}

}
