package main;

import java.awt.Graphics;

public abstract class GameObject {
//everything in game inherits the traits from this class
//this is a parent class for the game obj
	
	//inst var all objects will have
	protected int x, y;
	protected ID id;
	protected int velX, velY;
	
	public GameObject(int x, int y, ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	//declared method but its implemented in the child classes
	public abstract void tick();
	public abstract void render(Graphics g);
	
	//getters & setters
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY() {
		return y;
	}
	public void setID(ID id) {
		this.id = id;
	}
	public ID getID() {
		return id;
	}
	public void setVelX(int velX) {
		this.velX = velX;
	}
	public void setVelY(int velY) {
		this.velY = velY;
	}
	public int getVelX() {
		return velX;
	}
	public int getVelY() {
		return velY;
	}
}
