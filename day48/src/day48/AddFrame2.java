package day48;

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

class Listener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		//� ������Ʈ�� �������� �� �׼��� �������� �� ����Ǵ� �޼���
		JButton button=(JButton)e.getSource();//�̺�Ʈ�߻��� ������Ʈ getSource
		button.setText("��ư Ŭ��"); //��ư ���ڿ� ������
	}
	
}
public class AddFrame2 extends JFrame{

	AddFrame2(){
		setTitle("JFrame");
		setSize(300,300);
		
		//������Ʈ �����
		JButton button=new JButton("button");
		JCheckBox box=new JCheckBox("checkbox");
		JSlider slide=new JSlider();
		//���� �˻� �����̵� ����� ���
		JTextField tf=new JTextField("text �Է�",20);
		this.setLayout(new FlowLayout());
		//FlowLayout ��� ��
		
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(tf);
		
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//��ư ������Ʈ�� �׼��̺�Ʈ ������ �ޱ�
		button.addActionListener(new Listener());
	}
	public static void main(String[] args) {
		new AddFrame2();
	}

}
