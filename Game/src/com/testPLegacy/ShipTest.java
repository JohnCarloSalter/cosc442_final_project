package com.testPLegacy;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ConcurrentModificationException;

import javax.imageio.ImageIO;
import javax.swing.Timer;

import com.pLegacy.GameObjectManager;
import com.pLegacy.gameObjects.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShipTest {

	private static Ship fixture;
	private static BufferedImage testImage;
	
	
	@Before
	public void setUp() throws Exception {
		Ship fixture = new Ship(0, 0);
		fixture.Load();
		testImage = ImageIO.read(new File("..\\Game\\Graphics\\GameObjects\\Blue.png"));
		
	}

	@After
	public void tearDown() throws Exception {
		fixture = null;
		//System.gc();
	}

	@Test
	public void testGetArea1() {
		Rectangle testRect = new Rectangle(0, 0, testImage.getHeight() - 35, testImage.getWidth() - 50);
		assertTrue(fixture.getArea().equals(testRect));
	}
	
	@Test
	public void testGetArea2() {
		Rectangle testRect = new Rectangle(9999, 9999, testImage.getHeight() - 35, testImage.getWidth() - 50);
		assertFalse(fixture.getArea().equals(testRect));
	}
	
	@Test
	public void testGetArea3() {
		Rectangle testRect = new Rectangle(0, 0, 9999, 9999);
		assertFalse(fixture.getArea().equals(testRect));
	}

	//Update tests to create (minimum):
	//Health == 0
	//Time start is true
	//Time start is false
	//Autofire is on.
	//X > 730
	//X < 0	
	//When health is zero, make sure the ship is "dead".
	
	@Test
	//Make sure ship is marked dead when HP = 0.
	public void testUpdate1() {
		fixture.health = 0;
		fixture.Update();
		assertTrue(fixture.isdead);
	}
	
	//Make sure that ship is not marked dead when HP > 0,
	//and make sure that timers don't run when autofire is off.
	@Test
	public void testUpdate2() {
		fixture.health = 1;
		fixture.setTimestart(true);
		fixture.autofireon = true;
		fixture.Update();
		assertFalse(fixture.getTimer().isRunning());
		assertFalse(fixture.getAutoduration().isRunning());
		assertFalse(fixture.isdead);
	}
	
	//Make sure ship is not marked dead when HP>0. Also make sure that timers run
	//when autofire is on.
	@Test
	public void testUpdate3() {
		fixture.health = 1;
		fixture.setTimestart(false);
		fixture.autofireon = false;
		fixture.Update();
		assertTrue(fixture.getTimer().isRunning());
		assertTrue(fixture.getAutoduration().isRunning());	
		assertFalse(fixture.isdead);
	}
	
	//Test the upper x boundary.
	@Test
	public void testUpdate4() {
		fixture.health = 1;
		fixture.setTimestart(false);
		fixture.autofireon = false;
		fixture.setX(9999);		
		fixture.Update();	
		assertTrue(fixture.getX() == 730);		
	}
	
	//Test the lower x boundary.
	@Test
	public void testUpdate5() {
		fixture.health = 1;
		fixture.setTimestart(false);
		fixture.autofireon = false;
		fixture.setX(-9999);
		fixture.Update();
		assertTrue(fixture.getX() == 0);
	}

	@Test
	public void testOnCollision() {
		fail("Not yet implemented");
	}

	@Test
	public void testShip() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetLaserImage() {
		fail("Not yet implemented");
	}

	@Test
	public void testKeyPressed() {
		fail("Not yet implemented");
	}

	@Test
	public void testKeyReleased() {
		fail("Not yet implemented");
	}

	@Test
	public void testActionPerformed() {
		fail("Not yet implemented");
	}

	@Test
	public void testKeyTyped() {
		fail("Not yet implemented");
	}

}
