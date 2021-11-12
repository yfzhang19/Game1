package main;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas{

	/**
	 * generated serial id
	 */
	private static final long serialVersionUID = -4810618286807932601L;

	public Window(int width, int height, String title, Game game) {
		//creating JFrame
		JFrame frame = new JFrame(title);
		
		//adjusting JFrame size
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		//makes the "x" button work
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//can't resize window
		frame.setResizable(false);
		//makes the mouse start in the middle of screen
		frame.setLocationRelativeTo(null);
		//add the game into frame & makes it visibl;e
		frame.add(game);
		frame.setVisible(true);
		game.start();
	}
	
}
