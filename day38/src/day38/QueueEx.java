package day38;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		//queue���� ���콺�� �÷������� I ���ڰ� ���̴µ� �̰��� interface�� �ǹ��Ѵ�.
		Queue <String> q=new LinkedList<>();
		//1. add(e):rear ��ġ�� e�� �����Ѵ�. queue�� FIFO Ư¡
		q.add("apple");
		q.add("banana");
		q.add("cherry");
		q.add("tomato");
		
		System.out.println(q);
		
		//2.E element
		System.out.println("element:"+q.element());
		//���� ��ܿ� �ִ� apple ��ȯ, �ֻ�� ��� front�� ��ġ�� ������ ��ȯ
		
		//3. remove : front�� ��ġ�� �����͸� ��ȯ �� �����Ѵ�
		System.out.println("remove:"+q.remove());
		System.out.println(q);
		
		//4. offer(e) : rear ��ġ�� ������ ����
		q.offer("peach");
		System.out.println(q);
		
		//5. peek() : remove�� �޸� �������� �ʰ� front�� ��ġ�� �������� ���� ��ȯ
		System.out.println("peek:"+q.peek());
		System.out.println(q);
		
		//6. poll() : front�� ��ġ�� �����͸� ��ȯ �� ����, remove�� ����ѵ�
		System.out.println("poll:"+q.poll());
		System.out.println(q);
		
	}
}
