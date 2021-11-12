package main;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
//maintain, update, and render all objects
//loop through all objects & update/render to screen
	
	//create a list of all game objects
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	public void tick() {
		for(int i = 0; i<object.size(); i++) {
			//get the id of the object we have
			GameObject tempObject = object.get(i);
			
			tempObject.tick();
		}
	}
	
	public void render(Graphics g) {
		for(int i = 0; i<object.size(); i++) {
			//get the id of the object we have
			GameObject tempObject = object.get(i);
			
			tempObject.render(g);
		}
	}
	
	//add and remove objects from list
	/**CONFUSED HERE
	 * why are we using the .add operator after a game object
	 * the "this" keyword refers to the parameter which is a GameObject,
	 * not an arraylist so how would these methods add or remove objects
	 * from the list?
	 * 
	 * ANSWER: the "this" keyword refers to the INSTANCE VAR not the params
	 */
	public void addObject(GameObject object) {
		this.object.add(object);
	}
	
	public void removeObject(GameObject object) {
		this.object.remove(object);
	}
}
