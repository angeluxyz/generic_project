package game;

import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import utils.Constants;

public class Game extends JPanel implements Runnable {

	private static final long serialVersionUID = 1L;
	
	public Game() {
		
	}

	@Override
	public void run() {
		while(true) {
			
		}
		
	}

	@Override
	public void paint(Graphics g) {
		// Top left
		g.drawRect(Constants.WINDOW_WIDTH / 2 - 200, Constants.WINDOW_HEIGHT / 2 - 200, 100, 200);
		g.drawRect(Constants.WINDOW_WIDTH / 2 - 200, Constants.WINDOW_HEIGHT / 2 - 200, 200, 200);
		
		// Top right
		g.drawRect(Constants.WINDOW_WIDTH / 2, Constants.WINDOW_HEIGHT / 2 - 200, 100, 200);
		g.drawRect(Constants.WINDOW_WIDTH / 2, Constants.WINDOW_HEIGHT / 2 - 200, 200, 200);

		// Bottom left
		g.drawRect(Constants.WINDOW_WIDTH / 2 - 200, Constants.WINDOW_HEIGHT / 2, 100, 200);
		g.drawRect(Constants.WINDOW_WIDTH / 2 - 200, Constants.WINDOW_HEIGHT / 2, 200, 200);

		// Bottom right
		g.drawRect(Constants.WINDOW_WIDTH / 2, Constants.WINDOW_HEIGHT / 2, 100, 200);
		g.drawRect(Constants.WINDOW_WIDTH / 2, Constants.WINDOW_HEIGHT / 2, 200, 200);

		g.drawOval(Constants.WINDOW_WIDTH / 2 - 100, Constants.WINDOW_HEIGHT / 2 - 100, 200, 200);
		g.drawRect(Constants.WINDOW_WIDTH / 2 - 100, Constants.WINDOW_HEIGHT / 2 - 100, 200, 200);
	}
	
    public void showErrorMessage(String errorMsg) {
    	JOptionPane.showMessageDialog(new Frame(), errorMsg);
    }
}
