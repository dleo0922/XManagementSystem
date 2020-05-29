package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame{ //JFrame 상속

	public MenuSelection() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//사이즈 설정 뒤 x로 코드 실행 종료
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");

		JButton button1 = new JButton("Add Game");
		JButton button2 = new JButton("view Game");
		JButton button3 = new JButton("Edit Game");
		JButton button4 = new JButton("Delete Game");
		JButton button5 = new JButton("Exit programe");
		//패널, 레이블, 버튼 생성
		panel1.add(label);		
		panel2.add(button1);
		panel2.add(button2);		
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		//패널에 부착
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		//위치선정
		this.setVisible(true);//가시화
	}
}
