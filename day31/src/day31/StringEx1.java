package day31;

public class StringEx1 {

	public static void main(String[] args) {
		int i=3;
		
		String str="hello";
		
		System.out.println(str.concat(" world!"));
		System.out.println(str);
		//문자열 자체가 변경되는 것은 아니고 일회성으로 world!를 붙여준다.
		
		//substring(시작위치,끝위치):시작위치-끝위치 전까지 가져오는 것
		System.out.println(str.substring(2,4));
		//substring(시작위치):시작위치부터 끝까지 가져오기
		System.out.println(str.substring(3));
		System.out.println(str.length());
		//hello라는 글자열의 바이트 수는 5개
		
		//toUpperCase, toLowerCase
		System.out.println(str.toUpperCase());
		System.out.println("TesT".toLowerCase());
		
		//charAt(인덱스), indexOf(문자열), equals(문자열)
		System.out.println(str.charAt(0));
		//가장 첫문장 가져와라
		System.out.println("hello world".indexOf("world"));
		//6번째 부터 시작해 있다. 6이 반환
		System.out.println("hello world".indexOf("WORLD"));
		//-1반환 오류 시 -1을 return 값으로 반환한다.
		System.out.println(str.equals("hello"));
		
		//trim(),replace,replaceAll
		System.out.println(" test ".trim());
		//" test "앞뒤 공백이 사라진다.
		System.out.println("hello world".replace('l', 'L'));
		System.out.println("hello world".replaceAll("hello","bye"));
		
	}

}
