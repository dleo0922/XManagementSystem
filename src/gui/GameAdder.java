package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class GameAdder extends JPanel {
	WindowFrame frame;
	public GameAdder(WindowFrame frame) {
		this.frame = frame;

		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout()); //SpringLayout ȣ��

		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);

		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);

		JLabel labelEmail = new JLabel("Email: ", JLabel.TRAILING);
		JTextField fieldEmail = new JTextField(10);
		labelEmail.setLabelFor(fieldEmail);
		panel.add(labelEmail);
		panel.add(fieldEmail);

		JLabel labelPassword = new JLabel("Password: ", JLabel.TRAILING);
		JTextField fieldPassword = new JTextField(10);
		labelPassword.setLabelFor(fieldPassword);
		panel.add(labelPassword);
		panel.add(fieldPassword);
		//ID, Name, Email, Password �� �׸��� label�� �Է�Field�� �����
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel")); //save, cancel�� ��ư�� �����

		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		//SpringUtilitiesŬ������ �� �޼ҵ�� ũ��� ���� �����Ѵ�
		this.add(panel);
		this.setVisible(true);//ũ�� ���� �� ����ȭ
	}
}
