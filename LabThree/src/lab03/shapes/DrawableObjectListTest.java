package lab03.shapes;


import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.*;

public class DrawableObjectListTest {

	private DrawableObjectList aList;
	private Drawable d1;
	private Drawable d2;
	private Drawable d3;
	
	@Before
	public void setUp() throws Exception {
		aList = new DrawableObjectList();
		d1 = new Circle(0,0,1,Color.RED);
		d2 = new Circle(1,1,2,Color.BLUE);
		d3 = new Circle(2,2,3,Color.YELLOW);
	}
	
	@Test
	public void constructorTest() {
		assertEquals("The ArrayList was not constructed properly", 0, aList.getSize());
	}
	
	@Test
	public void getSizeTest() {
		assertEquals("The ArrayList's size is not 0", 0, aList.getSize());
	}
	
	@Test
	public void addDrawableTest() {
		aList.addDrawable(d1);
		aList.addDrawable(d2);
		aList.addDrawable(d3);
		assertEquals("The ArrayList's size is not 3", 3, aList.getSize());
	}
	
	@Test
	public void removeDrawableTest() {
		aList.addDrawable(d1);
		aList.addDrawable(d2);
		aList.addDrawable(d3);
		assertEquals("The ArrayList's size is not 3", 3, aList.getSize());
		aList.removeDrawable(d1);
		assertEquals("The ArrayList's size is not 2", 2, aList.getSize());
		aList.removeDrawable(d1);
		assertEquals("The ArrayList's size should not change", 2, aList.getSize());
	}
	
	@Test
	public void scaleAllTest() { //come back later and add test case for a DrawableObject that does not implement Scaleable
		aList.addDrawable(d1);
		aList.addDrawable(d2);
		aList.addDrawable(d3);
		aList.scaleAll(2.0);
		Circle c1 = (Circle) d1;
		Circle c2 = (Circle) d2;
		Circle c3 = (Circle) d3;
		assertEquals("The radius of the first Drawable was not scaled correctly",2,c1.getRadius());
		assertEquals("The radius of the second Drawable was not scaled correctly",4,c2.getRadius());
		assertEquals("The radius of the third Drawable was not scaled correctly",6,c3.getRadius());
	}
}
