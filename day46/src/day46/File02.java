package day46;

import java.io.*;


public class File02 {

	public static void main(String[] args) {
		//파일복사프로그램
		//문자단위로 데이터를 전송하는 문자 기반 스트림
		FileReader fr;
		FileWriter fw;
		BufferedReader br;
		BufferedWriter bw;
		
		try {
			fr=new FileReader("prac.txt");
			fw=new FileWriter("result.txt");
			
			br=new BufferedReader(fr);
			bw=new BufferedWriter(fw);
			String line;
			while((line=br.readLine())!=null) {
				bw.write(line);
				
			}
			bw.close();
			br.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
