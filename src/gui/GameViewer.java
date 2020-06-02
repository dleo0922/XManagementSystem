package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GameViewer extends JPanel{
	WindowFrame frame;
	public GameViewer(WindowFrame frame) {
		this.frame = frame;

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
