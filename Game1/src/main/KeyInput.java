/**
 * 
 */
package main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{

	private Handler handler;
	
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		System.out.println(key);
		
		for(int i = 0; i<handler.object.size(); i++) {
			GameObject temp = handler.object.get(i)
			if(temp.getID()==ID.Player) {
				//all they key events for player1
			}
		}
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
	}
	
}
