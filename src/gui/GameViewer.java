package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import game.GameInput;
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

		for (int i=0; i < gameManager.size(); i++) {
			Vector row = new Vector();
			GameInput gi = gameManager.get(i);
			row.add(gi.getId());
			row.add(gi.getName());
			row.add(gi.getEmail());
			row.add(gi.getPassword());
			model.addRow(row);

		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table); //ǥ�� ����� ��ũ�� �������� ����

		this.add(sp);

	}
}
