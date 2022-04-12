package day03;

public class DataType {

	public static void main(String[] args) {
		int a=65;
		float f=a;
		//본래 되지 않는다. 정수를 실수에 넣을 수 없다.
		System.out.println(f);
		//묵시적 형변환, 자동 형변환
		char c= (char)a;
		//char c = aㅣ 에서 형변환
		System.out.println(c);
	}

}
