package day38;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		//queue위에 마우스를 올려놓으면 I 문자가 보이는데 이것은 interface를 의미한다.
		Queue <String> q=new LinkedList<>();
		//1. add(e):rear 위치에 e를 삽입한다. queue의 FIFO 특징
		q.add("apple");
		q.add("banana");
		q.add("cherry");
		q.add("tomato");
		
		System.out.println(q);
		
		//2.E element
		System.out.println("element:"+q.element());
		//제일 상단에 있는 apple 반환, 최상단 요소 front에 위치한 데이터 반환
		
		//3. remove : front에 위치한 데이터를 반환 후 삭제한다
		System.out.println("remove:"+q.remove());
		System.out.println(q);
		
		//4. offer(e) : rear 위치에 데이터 삽입
		q.offer("peach");
		System.out.println(q);
		
		//5. peek() : remove와 달리 삭제하지 않고 front에 위치한 데이터의 값을 반환
		System.out.println("peek:"+q.peek());
		System.out.println(q);
		
		//6. poll() : front에 위치한 데이터를 반환 후 삭제, remove와 비슷한듯
		System.out.println("poll:"+q.poll());
		System.out.println(q);
		
	}
}
