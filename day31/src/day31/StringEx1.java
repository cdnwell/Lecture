package day31;

public class StringEx1 {

	public static void main(String[] args) {
		int i=3;
		
		String str="hello";
		
		System.out.println(str.concat(" world!"));
		System.out.println(str);
		//���ڿ� ��ü�� ����Ǵ� ���� �ƴϰ� ��ȸ������ world!�� �ٿ��ش�.
		
		//substring(������ġ,����ġ):������ġ-����ġ ������ �������� ��
		System.out.println(str.substring(2,4));
		//substring(������ġ):������ġ���� ������ ��������
		System.out.println(str.substring(3));
		System.out.println(str.length());
		//hello��� ���ڿ��� ����Ʈ ���� 5��
		
		//toUpperCase, toLowerCase
		System.out.println(str.toUpperCase());
		System.out.println("TesT".toLowerCase());
		
		//charAt(�ε���), indexOf(���ڿ�), equals(���ڿ�)
		System.out.println(str.charAt(0));
		//���� ù���� �����Ͷ�
		System.out.println("hello world".indexOf("world"));
		//6��° ���� ������ �ִ�. 6�� ��ȯ
		System.out.println("hello world".indexOf("WORLD"));
		//-1��ȯ ���� �� -1�� return ������ ��ȯ�Ѵ�.
		System.out.println(str.equals("hello"));
		
		//trim(),replace,replaceAll
		System.out.println(" test ".trim());
		//" test "�յ� ������ �������.
		System.out.println("hello world".replace('l', 'L'));
		System.out.println("hello world".replaceAll("hello","bye"));
		
	}

}
