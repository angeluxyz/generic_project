package forms;

import javax.swing.JFrame;

import game.Game;
import utils.Constants;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	Game game;
	
    public MainWindow(){
    	game = new Game();
        game.setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        
        this.pack();
        this.setLocation(Constants.WINDOW_X, Constants.WINDOW_Y);
        this.setSize(Constants.WINDOW_WIDTH + this.getInsets().right, Constants.WINDOW_HEIGHT + this.getInsets().top);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(game);
        
        this.setResizable(false);
        this.setVisible(true);
        
        // this.addKeyListener(this);
    }
}
