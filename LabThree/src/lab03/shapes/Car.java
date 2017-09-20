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
        DrawingTablet tablet = new DrawingTablet("Bullseye", 600, 400, objList);
        Square s1 = new Square(125,325,200,Color.RED); //Car Square
        Square s2 = new Square(125,300,50,Color.BLUE); //Window Square
        Rectangle r1 = new Rectangle(50,425,350,100,Color.RED);
        Circle c1 = new Circle(77,525,25,Color.BLACK); //Front Wheel
        Circle c2 = new Circle(362,525,25,Color.BLACK); //Rear Wheel
        
        objList.addDrawable(s1);
        objList.addDrawable(r1);
        objList.addDrawable(s2);
        objList.addDrawable(c1);
        objList.addDrawable(c2);
        
        tablet.repaint(); //final repaint
	}
}
