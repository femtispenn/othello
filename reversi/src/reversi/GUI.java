package reversi;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI {
	
	private JFrame frame;
	private JButton [][] buttons;
	private ActionListener btnListener;

	public GUI () {
		frame = new JFrame();
		frame.setLayout(new GridLayout(8,8));
		frame.setSize(600, 600);
		createActionListener();
		createButtons();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	void run () {
		
	}
	
	void createActionListener (){
		 btnListener = new ActionListener (){
			 public void actionPerformed (ActionEvent e) {
				 if (e.getSource() instanceof JButton) {
					 System.out.println("Du tröck på: "+((JButton) e.getSource()).getText());
				 }
			 }
		 };
	}
	
	void createButtons (){
		buttons = new JButton [9][9];
		for (int x=1;x<9;x++) {
			for (int y=1;y<9;y++) {
				buttons [x][y] = new JButton(""+x+y);
				frame.add(buttons[x][y]);
				buttons[x][y].addActionListener(btnListener);
				
			}
		}
	}
	
}
