package day37;

import java.util.*;

public class TimeCheck {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		LinkedList ll=new LinkedList();
		long start=System.currentTimeMillis();
		
		for(int i=0;i<100000;i++)
		{
			al.add(0,String.valueOf(i));
		}
		long end=System.currentTimeMillis();
		System.out.println("ArrayList �۾��ð�:"+(end-start));
		
		start=System.currentTimeMillis();
		for(int i=0;i<00000;i++) {
			ll.add(0,String.valueOf(i));
		}
		end=System.currentTimeMillis();
		System.out.println("LinkedList �۾��ð�:"+(end-start));
				
		//LinkedList�� �۾��� �ξ� ������
		
	}

}