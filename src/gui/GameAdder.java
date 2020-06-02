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
		panel.setLayout(new SpringLayout()); //SpringLayout 호출

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
		//ID, Name, Email, Password 각 항목의 label과 입력Field를 만든다
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel")); //save, cancel용 버튼을 만든다

		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		//SpringUtilities클래스에 든 메소드로 크기와 줄을 설정한다
		this.add(panel);
		this.setVisible(true);//크기 설정 후 가시화
	}
}
