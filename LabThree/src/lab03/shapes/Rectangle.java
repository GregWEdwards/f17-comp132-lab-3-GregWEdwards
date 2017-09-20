package lab03.shapes;

import java.awt.Color;
import java.awt.Graphics;

/**
 * A Rectangle is an object representing a square. A Rectangle has a top-left point
 * (x,y), a width, a height, and a color. It can be moved, translated, and drawn.
 * @author Gregory Edwards and Colin Wlodkowski
 * @version 9/20/2017
 */
public class Rectangle implements Drawable{
	private int x;
	private int y;
	private int width;
	private int height;
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
	public Rectangle(int initX, int initY, int initWidth, int initHeight, Color aColor) {
		x = initX;
		y = initY;
		width = initWidth;
		height = initHeight;
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
	 * returns the width of the Rectangle
	 * @return width
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * returns the height of the Rectangle
	 * @return height
	 */
	public int getHeight() {
		return height;
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
	public boolean isVisible() {
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
	 * Sets width to specified value. If newWidth is less than or equal to 0 the width should not change.
	 * @param newwidth new width
	 */
	public void setWidth(int newWidth) {
		if(newWidth > 0) {
			width = newWidth;
		}
	}
	
	/**
	 * Sets height to specified value. If newHeight is less than or equal to 0 the width should not change.
	 * @param newHeight new height
	 */
	public void setHeight(int newHeight) {
		if(newHeight > 0) {
			height = newHeight;
		}
	}
	
	/**
	 * Sets Color to a new Color.
	 * @param newColor the new Color
	 */
	public void setColor(Color newColor) {
		theColor = newColor;
	}
	
	/**
	 * Sets isVisible to specified boolean value.
	 * @param newVis the new boolea value
	 */
	public void setVisible(boolean newVis) {
		isVisible = newVis;
	}
	
	/**
     * Translate the Square's top-left corner's x and y co-ordinates. This is
     * moved by adding the parameters to the Square's current x and y 
     * co-ordinates.
     * 
     * @param xCo the change in the x coordinate. Positive values move the
     *            Circle to the right, negative values move it to the left.
     * @param yCo the change in the y coordinate. Positive values move the
     *            Circle down, negative values move it up.
     */
	public void translate(int xCo, int yCo) {
		x = x + xCo;
		y = y + yCo;
	}
	
	// === Implementation of the Drawable interface ===
	/**
     * Draw this DrawableSquare onto the specified Graphics object.
     * 
     * @param g the Graphics object on which to draw this DrawableSquare.
     */
    public void draw(Graphics g) {
    	g.setColor(getColor());
    	g.fillRect(getX(), getY(), getX()+getWidth(), getY()+getHeight());
    }
}
