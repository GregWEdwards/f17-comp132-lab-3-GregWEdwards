package lab03.shapes;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.*;
import org.junit.Test;

public class RectangleTest {

	private Rectangle theRectangle;
	
	@Before
	public void setUp() throws Exception {
		theRectangle = new Rectangle(0,1,2,3,Color.GREEN);
	}
	
	@Test
	public void constructorTest() {
		assertEquals("The x-co-ordinate was not initialized as 0", 0, theRectangle.getX());
		assertEquals("The y-co-ordinate was not initialized as 1", 1, theRectangle.getY());
		assertEquals("The width was not initialized as 2", 2, theRectangle.getWidth());
		assertEquals("The height was not initialized as 3", 3, theRectangle.getHeight());
		assertEquals("The Color was not initialized as green", Color.GREEN, theRectangle.getColor());
		assertTrue("isVisible was not initialized as true", theRectangle.isVisible());
	}

	@Test
    public void moveTest() {
        theRectangle.move(2, 3);
        assertEquals("The x co-ordinate should now be 2", 2, theRectangle.getX());
        assertEquals("The x co-ordinate should now be 3", 3, theRectangle.getY());
    }
	
	@Test
	public void setWidth() {
		theRectangle.setWidth(4);
		assertEquals("The Rectangle's width should be 4", 4, theRectangle.getWidth());
		theRectangle.setWidth(-1);
		assertEquals("The Rectangle's width should stay 4", 4, theRectangle.getWidth());
	}
	
	@Test
	public void setHeight() {
		theRectangle.setHeight(5);
		assertEquals("The Rectangle's height should be 5", 5, theRectangle.getHeight());
		theRectangle.setHeight(0);
		assertEquals("The Rectangle's height should stay 5", 5, theRectangle.getHeight());
	}
	
	@Test
    public void setColorTest() {
        theRectangle.setColor(Color.RED);
        assertEquals("The Rectangle's Color should be red", Color.RED, theRectangle.getColor());     
    }
    
    @Test
    public void setVisibleTest() {
        theRectangle.setVisible(false);
        assertFalse("The Rectangle should not be visible", theRectangle.isVisible());
        theRectangle.setVisible(true);
        assertTrue("The Rectangle should be visible", theRectangle.isVisible());
    }
    
    @Test
    public void translateTest() {
    	theRectangle.translate(2, 2);
    	assertEquals("The Rectangle's x co-ordinate should be 2", 2, theRectangle.getX());
    	assertEquals("The Rectangle's y co-ordinate should be 3", 3, theRectangle.getY());
    }
}
