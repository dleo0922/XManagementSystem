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
		model.addColumn("Password"); //�� Ŭ������ �ݷ��� �����

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table); //ǥ�� ����� ��ũ�� �������� ����

		this.add(sp);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true); //ũ�� ���� �� ����ȭ
	}

}
