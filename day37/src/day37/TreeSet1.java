package day37;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
			HashSet hs=new HashSet();
			hs.add("demon");
			hs.add("banana");
			hs.add("tomato");
			hs.add("apple");
			hs.add("cargo");
			
			TreeSet ts=new TreeSet();
			ts.add("demon");
			ts.add("banana");
			ts.add("tomato");
			ts.add("apple");
			ts.add("cargo");
			
			//Iterator �ٱ��Ͼ��� ������ �ϳ��� �����Ѵ�.
			Iterator it=hs.iterator();
			//it Ŭ������ü�� hs�� ��� ��ҿ� ������ �� �ֵ�.
			System.out.println("<Hash Set ���>");
			while(it.hasNext()) {
				//while�� hash set���� �� �̻� ������ ���� ���� �� ���� �ݺ��ȴ�.
				System.out.print(it.next()+" ");
			}
			System.out.println();
			Iterator it2=ts.iterator();
			System.out.println("<Tree Set ���>");
			while(it2.hasNext()) {
				System.out.print(it2.next()+" ");
			}
			
			System.out.println();
			System.out.println("���� TreeSet�� ũ��:"+ts.size());
			
	}

}
