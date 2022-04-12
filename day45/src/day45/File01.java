package day45;

import java.io.*;


public class File01 {

	public static void main(String[] args) throws IOException{
			FileInputStream fis=null;		//�Է½�Ʈ��
			FileOutputStream fos=null;		//��½�Ʈ��
			fis=new FileInputStream("prac.txt");		//input stream�� �����ϴ� ���ϰ� �����ؾ��Ѵ�.
			//try-catch���̳� throws ������ ���� ó���� ������Ѵ�.
			fos=new FileOutputStream("result.txt");		//�������� ������ ���� ������ �ϰ� �����ϸ� ������ �����.
			
			BufferedInputStream bis=new BufferedInputStream(fis);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
			int data;
			while((data=fis.read())!=-1) {
				//data�� �о�� ����Ʈ�� �����ϴµ�, data�� ���� -1�� �ƴ� �� ����
				//-1�� EOF�� �ǹ��Ѵ�. End Of File
				bos.write(data);
			}
			
			bos.close();
			bis.close();
			//������ ���������� ������ ������� �Ѵ�. file���� ������ �ݴ� �۾� .close()
	
	}
}
