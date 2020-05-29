package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GameViewer extends JFrame{

	public GameViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Password"); //모델 클래스의 콜론을 만든다

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table); //표로 만들어 스크롤 형식으로 붙임

		this.add(sp);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true); //크기 설정 및 가시화
	}

}
