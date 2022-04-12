package day48;

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

class Listener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		//어떤 컴포넌트가 눌려졌을 때 액션이 가해졌을 때 실행되는 메서드
		JButton button=(JButton)e.getSource();//이벤트발생한 컴포넌트 getSource
		button.setText("버튼 클릭"); //버튼 문자열 재지정
	}
	
}
public class AddFrame2 extends JFrame{

	AddFrame2(){
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
		
		//버튼 컴포넌트에 액셔이벤트 리스너 달기
		button.addActionListener(new Listener());
	}
	public static void main(String[] args) {
		new AddFrame2();
	}

}
