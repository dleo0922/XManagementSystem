package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame{ //JFrame ���

	public MenuSelection() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������ ���� �� x�� �ڵ� ���� ����
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");

		JButton button1 = new JButton("Add Game");
		JButton button2 = new JButton("view Game");
		JButton button3 = new JButton("Edit Game");
		JButton button4 = new JButton("Delete Game");
		JButton button5 = new JButton("Exit programe");
		//�г�, ���̺�, ��ư ����
		panel1.add(label);		
		panel2.add(button1);
		panel2.add(button2);		
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		//�гο� ����
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		//��ġ����
		this.setVisible(true);//����ȭ
	}
}
