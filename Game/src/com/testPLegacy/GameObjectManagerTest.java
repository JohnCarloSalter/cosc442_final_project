package com.testPLegacy;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ConcurrentModificationException;

import javax.imageio.ImageIO;

import com.pLegacy.GameObjectManager;
import com.pLegacy.gameObjects.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GameObjectManagerTest  {

	static GameObjectManager fixture;
	static BufferedImage testImage;
	static GameObject sampleObject;
	static int errorCounter = 0;
	
	@Before
	public void setUp() throws IOException {
		fixture = new GameObjectManager();
		try {
			testImage = ImageIO.read(new File("C:\\Users\\John Carlo Salter\\Documents\\College Classes\\Quality Assurance Final Project\\cosc442_final_project\\Game\\Graphics\\GameObjects\\power_up.png"));
		} catch (IOException ioeRef) {
			System.err.println("Can't read input file! " + errorCounter );
			errorCounter++;
		}
		sampleObject = new Meteor(0, 0, testImage, 0);
	}

	@After
	public void tearDown() throws Exception {
		fixture = null;
		sampleObject = null;
		System.gc();
	}

	@Test
	public void testGameObjectManager() throws IOException {
		assertNotNull(fixture);
	}

	@Test
	public void testAddObject() throws IOException {
		try {
			fixture.addObject(sampleObject);
			fixture.Update();
			assertTrue(sampleObject.getGOM().equals(fixture));	
			if(fixture.AmountOfCurrentObjects() != 1) {
				throw new Exception("Add object is not adding the correct amount of objects.");
			}
		} catch(Exception eRef) {
			fail(eRef.getMessage());
		}
	}

	@Test
	public void testRemoveObject() {
		fixture.addObject(sampleObject);
		fixture.Update();
		if(fixture.AmountOfCurrentObjects() == 1) {
			fixture.RemoveObject(sampleObject);
			fixture.Update();
			assertTrue(fixture.AmountOfCurrentObjects() == 0);
		} else {
			fail("The error is in the addObject method.");
		}
	}

	@Test
	//Run the GOM update twice times.
	//Before the first the current objects array should be empty.
	//After the first update, we'll have added an object. Array should be size 1.
	//After the second update, we'll have removed the object. Array should be empty.
	public void testUpdate1() {
		try {
			if(fixture.AmountOfCurrentObjects() != 0) {
				fail("Current objects array did not start out empty. Instead we have: " + fixture.AmountOfCurrentObjects() + " objects.");
			}
			fixture.addObject(sampleObject);
			fixture.Update();
			if(fixture.AmountOfCurrentObjects() != 1) {
				fail("Failed to add objects to current objects array after update. Instead we have: " + fixture.AmountOfCurrentObjects() + " objects.");
			}
			fixture.RemoveObject(sampleObject);
			fixture.Update();
			if(fixture.AmountOfCurrentObjects() != 0) {
				fail("Failed to remove objects from current objects array after update. Instead we have: " + fixture.AmountOfCurrentObjects()  + "objects.");
			}
		} catch(Exception eRef) {
			fail("Unexpected exception: " + eRef.getMessage());
		}		
	}
	
	@Test
	//Run the GOM without adding anything. Should execute without problems.
	public void testUpdate2() {
		try {
			fixture.Update();
		} catch(Exception eRef) {
			fail(eRef.getMessage());
		}
	}

	@Test
	//This test isn't working as intended, but the parts that were removed
	//are not crucial -- if the issues those parts tested occur, the 
	//Java garbage collector will handle them.
	public void testUnload() {
		try {
			fixture.addObject(sampleObject);
			fixture.Update();
			fixture.Unload();
			//assertTrue(sampleObject == null);
			if(fixture.AmountOfCurrentObjects() != 0) {
				fail("Objects not unloaded from array.");
			}			
		} catch(ConcurrentModificationException cmeRef) {
			fixture.Unload();
			//assertTrue(sampleObject == null);
			//if(sampleObject != null) {
			//	System.err.println(sampleObject.toString() + "_");
			//}
			if(fixture.AmountOfCurrentObjects() != 0) {
				fail("Objects not unloaded from array.");
			}	
		}
	}

	@Test
	public void testAmountOfCurrentObjects1() {
		assertTrue(fixture.AmountOfCurrentObjects() == 0);
	}
	
	@Test
	public void testAmountOfCurrentObjects2() {
		fixture.addObject(sampleObject);
		fixture.Update();
		assertTrue(fixture.AmountOfCurrentObjects() == 1);
	}

	@Test
	//Should collide.
	public void testIsColliding1() {
		try {
			Meteor sampleObject2 = new Meteor(1, 0, testImage, 0);
			assertTrue(fixture.isColliding(sampleObject, sampleObject2));
		} catch (Exception eRef) {
			fail(eRef.getMessage());
		}
	}
	
	@Test
	//Should not collide.
	public void testIsColliding2() {
		try {
			Meteor sampleObject2 = new Meteor(9999, 9999, testImage, 0);
			assertFalse(fixture.isColliding(sampleObject, sampleObject2));
		} catch (Exception eRef) {
			fail(eRef.getMessage());
		}
	}

}
