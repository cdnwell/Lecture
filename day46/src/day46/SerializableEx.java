package day46;

import java.io.*;

public class SerializableEx {

	public static void main(String[] args) {
		marshalling();
		unmarshalling();
	}

	
	public static void marshalling() {

		try {
		FileOutputStream fos =new FileOutputStream("user.ser");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		ObjectOutputStream out=new ObjectOutputStream(bos);
		
		User user1=new User("test","1234","���浿");
		out.writeObject(user1);
		out.close();
		//close�� ���ϸ� ���� �о�� �����Ͱ� �ִ��� �𸣱� ������ ���Ͽ� ������ ���� �о�� �� ����.
		System.out.println("��ü ����ȭ �Ϸ�!");
				
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void unmarshalling() {
		
		try {
		FileInputStream fis=new FileInputStream("user.ser");
		
		BufferedInputStream bis= new BufferedInputStream(fis);
		ObjectInputStream in=new ObjectInputStream(bis);
		
		User user2= (User)in.readObject();
		System.out.println(user2.toString());
		in.close();
		System.out.println("��ü ���� �Ϸ�!");
		}catch(Exception e) {}
		
	}
}

class User implements Serializable{
	private String id;
	private String password;
	private String name;
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + "]";
	}
	
	
}