package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import manager.GameManager;

public class WindowFrame extends JFrame {
	//��ü ����
	GameManager gameManager;
	MenuSelection menuselection;
	GameViewer gameviewer;
	GameAdder gameAdder;
	
	public WindowFrame(GameManager gameManager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.gameManager = gameManager;//�����ڷ� �߰��Ѵ�
		menuselection = new MenuSelection(this);
		gameviewer = new GameViewer(this, this.gameManager);
		gameAdder = new GameAdder(this); 
				
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
