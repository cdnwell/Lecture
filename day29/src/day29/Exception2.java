package day29;

public class Exception2 {

	public static void main(String[] args) {
		try {
			int []a= {2,0,0};
			int b=4;
			int c=b/a[2];	//배열의 index가 [0]과[1]빢에 없는데 [2]번에 접속해 오류
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("산술 오류 발생");
		}
		//}catch(ArithmeticException e) {
		//하나의 예외는 하나만 처리가능하다. 불가능한 문장
		//}
		//try문은 항상 catch문과 함께 쓰여야 한다.
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이 오류 발생");
		}
		System.out.println("예외 처리 공부 중");
	}

}
