package lab03.shapes;

import java.awt.Color;

/**
 * A Square is an object representing a square. A Square has a top-left point
 * (x,y), a side length and a color. It can be moved, translated, scaled and drawn.
 * @author Gregory Edwards and Ming-Hua Chang
 * @version 8/30/2017
 */

public class Square implements Drawable, Scaleable{
	private int x;
	private int y;
	private int sideLength;
	private Color theColor;
	private boolean isVisible;
	
	/**
	 * Constructs a Square with top-left co-ordinates X and Y, side length of initSideLength, and color of aColor. A constructed Square is visible 
	 * by default.
	 * @param initX initial X co-ordinate of Square
	 * @param initY initial Y co-ordinate of Square
	 * @param initSideLength initial side length of Square
	 * @param aColor initial color of Square
	 */
	public Square(int initX, int initY, int initSideLength, Color aColor) {
		x = initX;
		y = initY;
		sideLength = initSideLength;
		theColor = aColor;
		isVisible = true;
	}
	
	/**
	 * returns x co-ordinate of top-left corner of Square.
	 * @return  the x co-ordinate
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * returns y co-ordinate of top-left corner of Square.
	 * @return the y co-ordinate
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * returns the length of each side of the Square.
	 * @return the sideLength
	 */
	public int getSideLength() {
		return sideLength;
	}
	
	/**
	 * returns the Color of the Square.
	 * @return the Color
	 */
	public Color getColor() {
		return theColor;
	}
	
	/**
	 * returns true is the Square is visible, and false if it is not.
	 * @return boolean visibility
	 */
	public boolean getIsVisible() {
		return isVisible;
	}
	
	/**
	 * Changes the x and y co-ordinates of the top-left corner of the Square to the specified values.
	 * @param newX the new x co-ordinate
	 * @param newY the new y co-ordinate
	 */
	public void move(int newX, int newY) {
        x = newX;
        y = newY;
    }
	
	/**
	 * Sets sideLength to specified value.
	 * @param newSideLength new sideLength
	 */
	public void setSideLength(int newSideLength) {
		sideLength = newSideLength;
	}
	
	/**
	 * Sets Color to a new Color.
	 * @param newColor the new Color
	 */
	public void setColor(Color newColor) {
		theColor = newColor;
	}
	
	/**
	 * Switches isVisible from true to false if true, or false to true if false.
	 */
	public void changeVisible() {
		if (this.getIsVisible()) {
			isVisible = false;
		} else {
			isVisible = true;
		}
	}
	
	public void translate(int xCo, int yCo) {
		x = x + xCo;
		y = y + yCo;
	}
	
	// === Implementation of the Scaleable interface ===
	
	
	// === Implementation of the Drawable interface ===
	
}
