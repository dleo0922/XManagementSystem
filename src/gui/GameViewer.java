package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.GameManager;

public class GameViewer extends JPanel{
	WindowFrame frame;
	GameManager gameManager;
	
	public GameViewer(WindowFrame frame, GameManager gameManager) {
		this.frame = frame;
		this.gameManager = gameManager;
		
		System.out.println("***" + gameManager.size() + "***");

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Password"); //모델 클래스의 콜론을 만든다

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table); //표로 만들어 스크롤 형식으로 붙임

		this.add(sp);

	}
}
