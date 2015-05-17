package com.testPLegacy;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ConcurrentModificationException;

import javax.imageio.ImageIO;
import javax.swing.Timer;

import com.pLegacy.Audio;
import com.pLegacy.GameObjectManager;
import com.pLegacy.gameObjects.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShipTest {

	private static Ship fixture;
	private static BufferedImage testImage;
	private static BufferedImage testObjectImage;
	private static int errorCounter = 0;
	
	
	@Before
	public void setUp() throws IOException {
		Audio.StartMusic("hit.wav"); //Needed to null pointer errors.
		fixture = new Ship(0, 0);
		fixture.Load();
		try {
			testImage = ImageIO.read(new File("..\\Game\\Graphics\\GameObjects\\Blue.gif"));
		} catch (IOException ioeRef) {
			System.err.println("Can't read input file! " + errorCounter );
			errorCounter++;
		}
		
		try {
			testObjectImage = ImageIO.read(new File("..\\Game\\Graphics\\GameObjects\\Meteor2.png"));
		} catch (IOException ioeRef) {
			System.err.println("Can't read input file! " + errorCounter );
			errorCounter++;
		}
		
		/*
		try {
			testObjectImage = ImageIO.read(new File("..\\Game\\Graphics\\GameObjects\\testImage.png"));
		} catch (IOException ioeRef) {
			System.err.println("Can't read Object input file! ");
		}*/
	}

	@After
	public void tearDown() throws Exception {
		fixture = null;
		//System.gc();
	}

	@Test
	public void testGetArea1() {
		Rectangle testRect = new Rectangle(15, 35, testImage.getHeight() - 35, testImage.getWidth() - 50);
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
		fixture.setAutoduration(new Timer(0, fixture)); //Can't be null for test to run.
		try {
			fixture.Update();
		} catch(Exception eRef) {
			System.err.println(eRef.getMessage());
			fail();
		}
		assertTrue(fixture.isdead);
	}
	
	//Make sure that ship is not marked dead when HP > 0,
	//and make sure that timers don't run when autofire is off.
	@Test
	public void testUpdate2() {
		fixture.health = 1;
		fixture.setTimestart(true);
		fixture.autofireon = false;
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
		fixture.autofireon = true;
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
	public void testOnCollision1() {
		GameObject testObject = new Meteor(0, 0, testObjectImage, 1);
		fixture.health = 5;
		fixture.setCD(5);
		fixture.score = 0;
		fixture.onCollision(testObject);
		assertTrue(fixture.health == 4);
		assertTrue(fixture.getCD() == 10);
		assertTrue(fixture.score == -100);
	}
	
	@Test
	public void testOnCollision2() {
		GameObject testObject = new AutoFirePower(0, 0);
		fixture.onCollision(testObject);
		fixture.getAutoduration().stop();
		fixture.autofireon = true;
		fixture.onCollision(testObject);
		assertTrue(fixture.getAutoduration().isRunning());
		assertTrue(fixture.autofireon);		
	}
	
	@Test
	public void testOnCollision3() {
		GameObject testObject = new AutoFirePower(0, 0);
		fixture.onCollision(testObject);
		fixture.getAutoduration().stop();
		fixture.autofireon = false;
		fixture.onCollision(testObject);
		assertFalse(fixture.getAutoduration().isRunning());
		assertTrue(fixture.autofireon);		
	}
	
	@Test
	public void testOnCollision4() {
		fixture = new Ship(0,0);
		fixture.Load();
		GameObject testObject = new LaserPiercePower(0, 0);
		fixture.piercinglasers = 0;
		fixture.onCollision(testObject);
		assertTrue(fixture.piercinglasers == 5);
	}
	
	@Test
	public void testOnCollision5() {
		GameObject testObject = new Ammo(0, 0);
		fixture.ammo = 6;
		fixture.onCollision(testObject);
		assertTrue(fixture.ammo == 10);
	}
	
	@Test
	public void testOnCollision6() {
		GameObject testObject = new Ammo(0, 0);
		fixture.ammo = 4;
		fixture.onCollision(testObject);
		assertTrue(fixture.ammo == 9);
	}
	
	@Test
	//This test will be large but will test all switch cases of Life.
	public void testOnCollision7() {
		GameObject testObj = new Life(0,0);
		fixture.health = 1;
		fixture.setDmgcounter(-1);
		fixture.onCollision(testObj);
		assertTrue(fixture.health == 2);
		assertTrue(fixture.getDMGCounter() == 3);
		
		fixture.onCollision(testObj);
		assertTrue(fixture.health == 3);
		assertTrue(fixture.getDMGCounter() == 3);
		
		fixture.onCollision(testObj);
		assertTrue(fixture.health == 4);
		assertTrue(fixture.getDMGCounter() == 2);
		
		fixture.onCollision(testObj);
		assertTrue(fixture.health == 5);
		assertTrue(fixture.getDMGCounter() == 2);
		
		fixture.onCollision(testObj);
		assertTrue(fixture.health == 6);
		assertTrue(fixture.getDMGCounter() == 2);
		
		fixture.onCollision(testObj);
		assertTrue(fixture.health == 7);
		assertTrue(fixture.getDMGCounter() == 1);
		
		fixture.onCollision(testObj);
		assertTrue(fixture.health == 8);
		assertTrue(fixture.getDMGCounter() == 1);
		
		fixture.onCollision(testObj);
		assertTrue(fixture.health == 9);
		assertTrue(fixture.getDMGCounter() == 1);
		
		fixture.onCollision(testObj);
		assertTrue(fixture.health == 10);
		assertTrue(fixture.getDMGCounter() == 0);
	}
	
	@Test
	//This test will be large but will test all switch cases of Life.
	public void testOnCollision8() {
		GameObject testObj = new Life(0,0);
		fixture.health = 10;
		fixture.onCollision(testObj);
		assertTrue(fixture.health == 10);
		assertTrue(fixture.getDMGCounter() == 0);
	}

	@Test
	public void testSetLaserImage() {
		try {
			fixture.setLaserImage();
		} catch(Exception eRef) {
			fail("Exception was thrown after .setLaserImage() call.");
		}
	}
}
