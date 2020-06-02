package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import listeners.ButtonAddListener;
import listeners.ButtonViewListener;

public class MenuSelection extends JPanel{ //JFrame 상속
	WindowFrame frame;
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;	
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		//버튼 만들기
		JButton button1 = new JButton("Add Game");
		JButton button2 = new JButton("view Game");
		JButton button3 = new JButton("Edit Game");
		JButton button4 = new JButton("Delete Game");
		JButton button5 = new JButton("Exit programe");
		//버튼에 Listener연결
		button1.addActionListener(new ButtonAddListener(frame));
		button2.addActionListener(new ButtonViewListener(frame));
		//레이블, 버튼  패널 부착
		panel1.add(label);		
		panel2.add(button1);
		panel2.add(button2);		
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		//위치선정
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);		
	}
}
