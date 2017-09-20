package lab03.shapes;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.*;
import org.junit.Test;

public class SquareTest {

	private Square theSquare;
	
	@Before
	public void setUp() throws Exception {
		theSquare = new Square(0,1,2,Color.GREEN);
	}
	
	@Test
	public void constructorTest() {
		assertEquals("The x-co-ordinate was not initialized as 0", 0, theSquare.getX());
		assertEquals("The y-co-ordinate was not initialized as 1", 1, theSquare.getY());
		assertEquals("The sideLength was not initialized as 2", 2, theSquare.getSideLength());
		assertEquals("The Color was not initialized as green", Color.GREEN, theSquare.getColor());
		assertTrue("isVisible was not initialized as true", theSquare.isVisible());
	}

	@Test
    public void moveTest() {
        theSquare.move(2, 3);
        assertEquals("The x co-ordinate should now be 2", 2, theSquare.getX());
        assertEquals("The x co-ordinate should now be 3", 3, theSquare.getY());
    }
	
	@Test 
    public void setSideLengthTest() {
        theSquare.setSideLength(5);
        assertEquals("The Square's sideLength should be 5", 5, theSquare.getSideLength());
        theSquare.setSideLength(-3);
        assertEquals("The Square's sideLength should stay 5", 5, theSquare.getSideLength());
    }
	
	@Test
    public void setColorTest() {
        theSquare.setColor(Color.RED);
        assertEquals("The square's Color should be red", Color.RED, theSquare.getColor());     
    }
    
    @Test
    public void setVisibleTest() {
        theSquare.setVisible(false);
        assertFalse("The Square should not be visible", theSquare.isVisible());
        theSquare.setVisible(true);
        assertTrue("The Square should be visible", theSquare.isVisible());
    }
    
    @Test
    public void translateTest() {
    	theSquare.translate(2, 2);
    	assertEquals("The Square's x co-ordinate should be 2", 2, theSquare.getX());
    	assertEquals("The Square's y co-ordinate should be 3", 3, theSquare.getY());
    }
    
    @Test
    public void scaleTest() {
    	theSquare.scale(-2.0);
    	assertEquals("The Square's sideLength should not change", 2, theSquare.getSideLength());
    	theSquare.scale(2.0);
    	assertEquals("The Square's sideLength should be 4", 4, theSquare.getSideLength());
    }
}
