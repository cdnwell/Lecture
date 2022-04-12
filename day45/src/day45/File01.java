package day45;

import java.io.*;


public class File01 {

	public static void main(String[] args) throws IOException{
			FileInputStream fis=null;		//입력스트림
			FileOutputStream fos=null;		//출력스트림
			fis=new FileInputStream("prac.txt");		//input stream은 존재하는 파일과 연결해야한다.
			//try-catch문이나 throws 문으로 오류 처리를 해줘야한다.
			fos=new FileOutputStream("result.txt");		//존재하지 않으면 파일 생성을 하고 존재하면 파일을 덮어쓴다.
			
			BufferedInputStream bis=new BufferedInputStream(fis);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
			int data;
			while((data=fis.read())!=-1) {
				//data에 읽어온 바이트를 저장하는데, data의 값이 -1이 아닐 때 까지
				//-1은 EOF를 의미한다. End Of File
				bos.write(data);
			}
			
			bos.close();
			bis.close();
			//파일을 연결했으면 연결을 끊어줘야 한다. file과의 연결을 닫는 작업 .close()
	
	}
}
