package com.pLegacy.gameObjects;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.DebugGraphics;

import org.junit.*;

import static org.junit.Assert.*;

import com.pLegacy.GameObjectManager;
import com.pLegacy.GamePanel;
import com.pLegacy.HighScores;
import com.pLegacy.gameObjects.Ammo;
import com.pLegacy.gameObjects.GameObject;
import com.pLegacy.gameObjects.Life;

/**
 * The class <code>LifeTest</code> contains tests for the class <code>{@link Life}</code>.
 *
 * @generatedBy CodePro at 5/17/15 5:27 PM
 * @author Sean
 * @version $Revision: 1.0 $
 */
public class LifeTest {
	/**
	 * Run the Life(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:27 PM
	 */
	@Test
	public void testLife_1()
		throws Exception {
		int x = 1;
		int y = 1;

		Life result = new Life(x, y);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getX());
		assertEquals(1, result.getY());
		assertEquals(null, result.getGOM());
	}

	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LifeTest.class);
	}
}