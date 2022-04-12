package day31;

import java.util.StringTokenizer;

public class StringTokenizersEx {
//클래스 명을 StringToken으로 쓰면 이곳에서 StringToken 메서드를 가져오기 때문에 Ex를 
	//반드시 붙여야한다.
	public static void main(String[] args) {
		String str="kim:010-1234-1234";
		String delim=":";
		StringTokenizer st=new StringTokenizer(str,delim);
		System.out.println(st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.hasMoreTokens());
		
		System.out.println(st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.countTokens());
		System.out.println(st.hasMoreTokens());

		
	}

}
