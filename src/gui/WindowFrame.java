package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {
	//객체 생성
	MenuSelection menuselection;
	GameViewer gameviewer;
	GameAdder gameAdder;

	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.gameviewer = new GameViewer(this);
		this.gameAdder = new GameAdder(this); //생성자로 추가한다
			
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setupPanel(menuselection);
		this.setVisible(true);//가시화
	}
	//menuselection을 구성하는 메소드
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	//getter과 setter로 접근한다
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
