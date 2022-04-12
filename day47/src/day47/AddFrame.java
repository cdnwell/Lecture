package day47;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class AddFrame extends JFrame{
	
	AddFrame(){
		setTitle("JFrame");
		setSize(300,300);
		
		//컴포넌트 만들기
		JButton button=new JButton("button");
		JCheckBox box=new JCheckBox("checkbox");
		JSlider slide=new JSlider();
		//음악 검색 슬라이드 비슷한 기능
		JTextField tf=new JTextField("text 입력",20);
		this.setLayout(new FlowLayout());
		//FlowLayout 고용 함
		
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(tf);
		
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//기본 닫힘 기능을 위로 설정한다. JFrame이 갖는 닫는 프로그램
		//내 프로그램 닫는 기능을 닫기버튼으로 설정
	}
	
	public static void main(String[] args){
		//AddFrame();
		//객체를 생성해라 라는 말이므로 불가능한 코드다
		new AddFrame();
	}

}
