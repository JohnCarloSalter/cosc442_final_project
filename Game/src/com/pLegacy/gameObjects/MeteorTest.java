package com.pLegacy.gameObjects;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.DebugGraphics;

import org.junit.*;

import static org.junit.Assert.*;

import com.pLegacy.GameObjectManager;
import com.pLegacy.GamePanel;
import com.pLegacy.HighScores;
import com.pLegacy.gameObjects.Ammo;
import com.pLegacy.gameObjects.GameObject;
import com.pLegacy.gameObjects.Meteor;

/**
 * The class <code>MeteorTest</code> contains tests for the class <code>{@link Meteor}</code>.
 *
 * @generatedBy CodePro at 5/17/15 5:29 PM
 * @author Sean
 * @version $Revision: 1.0 $
 */
public class MeteorTest {
	/**
	 * Run the Meteor(int,int,BufferedImage,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testMeteor_1()
		throws Exception {
		int x = 1;
		int y = 1;
		BufferedImage img = new BufferedImage(1, 1, 1);
		int _baseSpeed = 1;

		Meteor result = new Meteor(x, y, img, _baseSpeed);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getX());
		assertEquals(1, result.getY());
		assertEquals(null, result.getGOM());
	}

	/**
	 * Run the Meteor(int,int,BufferedImage,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testMeteor_2()
		throws Exception {
		int x = 1;
		int y = 1;
		BufferedImage img = new BufferedImage(1, 1, 1);
		int _baseSpeed = 1;

		Meteor result = new Meteor(x, y, img, _baseSpeed);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getX());
		assertEquals(1, result.getY());
		assertEquals(null, result.getGOM());
	}

	/**
	

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MeteorTest.class);
	}
}