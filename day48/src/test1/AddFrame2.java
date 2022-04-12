package test1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class AddFrame2 extends JFrame {

	AddFrame2() {
		setTitle("JFrame");
		setSize(400,300);
		
		
		
		
		JButton button=new JButton("button");
		JCheckBox box=new JCheckBox("check");
		JSlider slide=new JSlider();
		JTextField tf=new JTextField(null,20);
		this.setLayout(new FlowLayout());
		
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(tf);
		
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button.addActionListener(new Listener());
	}
	
	public static void main(String[] args) {
		new AddFrame2();
	}

}

class Listener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button=(JButton)e.getSource();
		button.setText("button click");
	}
	
}