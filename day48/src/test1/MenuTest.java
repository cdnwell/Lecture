package test1;

import java.awt.event.*;

import javax.swing.*;

public class MenuTest extends JFrame {

	MenuTest(){
		setTitle("Menu maker");
		createMenu();
		setSize(250,200);
		
		ImageIcon cherryIcon=new ImageIcon("cherry.png");
		JCheckBox cb=new JCheckBox(cherryIcon);
		
		this.add(cb);
		
		setVisible(true);
	}
	public void createMenu() {
		JMenuBar mb=new JMenuBar();
		JMenu screenMenu=new JMenu("MenuBar1");
		
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("Reshow"));
		JMenuItem item=new JMenuItem("Pop UP");
		screenMenu.add(item);
		screenMenu.add(new JMenuItem("Exit"));
		
		item.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,"Hello World");
				
			}
		});
		
		mb.add(screenMenu);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Start"));
		mb.add(new JMenu("Help"));
		
		setJMenuBar(mb);
		
	}
	public static void main(String[] args) {
		new MenuTest();
	}

}

//class MenuActionListener implements ActionListener{

//	public void actionPerformed(ActionEvent e) {
//		JOptionPane.showMessageDialog(null,"Pop UP");
//	}
//}