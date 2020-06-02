package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import gui.GameViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {	
	WindowFrame frame;
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		GameViewer viewer = frame.getGameviewer();
		frame.setupPanel(viewer);
	}
}
