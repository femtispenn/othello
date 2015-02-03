package reversi;

import java.awt.GridLayout;
import javax.swing.*;

public class GUI {
	
	private JFrame frame;
	private JButton [][] buttons;

	public GUI () {
		frame = new JFrame();
		frame.setLayout(new GridLayout(8,8));
		frame.setSize(600, 600);
		buttons = new JButton [8][8];
		for (int x=0;x<8;x++) {
			for (int y=0;y<8;y++) {
				buttons [x][y] = new JButton(x+", "+y);
				frame.add(buttons[x][y]);
			}
		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	void run () {
		
	}
	
}
