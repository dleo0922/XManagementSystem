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
		model.addColumn("Password"); //�� Ŭ������ �ݷ��� �����

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table); //ǥ�� ����� ��ũ�� �������� ����

		this.add(sp);

	}
}
