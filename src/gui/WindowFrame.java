package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {
	//��ü ����
	MenuSelection menuselection;
	GameViewer gameviewer;
	GameAdder gameAdder;

	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.gameviewer = new GameViewer(this);
		this.gameAdder = new GameAdder(this); //�����ڷ� �߰��Ѵ�
			
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setupPanel(menuselection);
		this.setVisible(true);//����ȭ
	}
	//menuselection�� �����ϴ� �޼ҵ�
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	//getter�� setter�� �����Ѵ�
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public GameViewer getGameviewer() {
		return gameviewer;
	}

	public void setGameviewer(GameViewer gameviewer) {
		this.gameviewer = gameviewer;
	}

	public GameAdder getGameAdder() {
		return gameAdder;
	}

	public void setGameAdder(GameAdder gameAdder) {
		this.gameAdder = gameAdder;
	}
}
