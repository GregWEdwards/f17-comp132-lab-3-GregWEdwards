package lab03.shapes;

import java.awt.*;

/**
 * Program that draws a Car.
 *
 * @author Gregory Edwards and Colin Wlodkowski
 * @version 9/20/2017
 */
public class Car {

	/**
	 * Draws 1 Square, 2 Rectangles, and 2 Circles to make a Car.
	 * @param args none
	 */
	public static void main(String[] args) {
		DrawableObjectList objList = new DrawableObjectList();
        DrawingTablet tablet = new DrawingTablet("Bullseye",800, 600, objList);
        Square s1 = new Square(300, 200, 200, Color.RED); //Car Square
        Square s2 = new Square(312, 212, 60, Color.WHITE); //Window Square
        Rectangle r1 = new Rectangle(200, 275, 400, 125, Color.RED);
        Circle c1 = new Circle(275, 400, 40, Color.BLACK); //Front Wheel
        Circle c2 = new Circle(525, 400, 40, Color.BLACK); //Rear Wheel
        
        objList.addDrawable(s1);
        objList.addDrawable(r1);
        objList.addDrawable(s2);
        objList.addDrawable(c1);
        objList.addDrawable(c2);
        
        tablet.repaint(); //final repaint
	}
}
