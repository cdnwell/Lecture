package day08;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//일 년 동안 읽은 책 수에 따라 멘트를 출력
		//ctrl+d 해당 줄을 지운다.
		int book=2;
		//book=book/10;
		//switch 문의 조건문에는 변수대신 식이 들어갈 수도 있다.
		switch(book/10){
		case 0:	//10권 미만이다.
			System.out.println("조금 더 노력하세요.");
		case 1: //10<=book<20
			System.out.println("책 읽는 것을 즐기시는 분이시네요!");
		case 2:	//20<=book<30
			System.out.println("책을 사랑하는 분이시네요!");
		default:	//30<=book
			System.out.println("당신은 다독왕입니다.");
							
		}
	}

}
