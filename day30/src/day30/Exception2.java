package day30;

public class Exception2 {
	public static void main(String[] args) {
		try {
			Exception e=new Exception("���� ����");
			//Exception Ŭ������ ������
			throw e;	//���������� ���ܸ� �����ڴ�.
			
		}
		catch(Exception e) {
			System.out.println("���� �߻�");
			System.out.println(e.getMessage());
		}
	}
}
