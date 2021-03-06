package com.pLegacy.gameObjects;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import javax.swing.DebugGraphics;

import org.junit.*;

import static org.junit.Assert.*;

import com.pLegacy.GameObjectManager;
import com.pLegacy.GamePanel;
import com.pLegacy.HighScores;
import com.pLegacy.gameObjects.Ammo;
import com.pLegacy.gameObjects.GameObject;
import com.pLegacy.gameObjects.Laser;
import com.pLegacy.gameObjects.Ship;

/**
 * The class <code>LaserTest</code> contains tests for the class <code>{@link Laser}</code>.
 *
 * @generatedBy CodePro at 5/17/15 5:29 PM
 * @author Sean
 * @version $Revision: 1.0 $
 */
public class LaserTest {
	/**
	 * Run the Laser(int,int,Ship,BufferedImage) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testLaser_1()
		throws Exception {
		int x = 1;
		int y = 1;
		Ship _ship = new Ship(1, 1);
		BufferedImage shot = new BufferedImage(1, 1, 1);

		Laser result = new Laser(x, y, _ship, shot);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getX());
		assertEquals(1, result.getY());
		assertEquals(null, result.getGOM());
	}

	/**
	 * Run the Laser(int,int,Ship,BufferedImage) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testLaser_2()
		throws Exception {
		int x = 1;
		int y = 1;
		Ship _ship = new Ship(1, 1);
		BufferedImage shot = new BufferedImage(1, 1, 1);

		Laser result = new Laser(x, y, _ship, shot);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getX());
		assertEquals(1, result.getY());
		assertEquals(null, result.getGOM());
	}

	/**
	 * Run the void Load() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testLoad_1()
		throws Exception {
		Laser fixture = new Laser(1, 1, new Ship(1, 1), new BufferedImage(1, 1, 1));
		fixture.screen = new HighScores();
		fixture.gom = new GameObjectManager();

		fixture.Load();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at com.pLegacy.HighScores.writeEmptyScores(HighScores.java:112)
		//       at com.pLegacy.HighScores.<init>(HighScores.java:51)
	}

	/**
	 * Run the void Update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		Laser fixture = new Laser(1, 1, new Ship(1, 1), new BufferedImage(1, 1, 1));
		fixture.screen = new HighScores();
		fixture.gom = new GameObjectManager();

		fixture.Update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at com.pLegacy.HighScores.writeEmptyScores(HighScores.java:112)
		//       at com.pLegacy.HighScores.<init>(HighScores.java:51)
	}

	/**
	 * Run the void Update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testUpdate_2()
		throws Exception {
		Laser fixture = new Laser(1, 1, new Ship(1, 1), new BufferedImage(1, 1, 1));
		fixture.screen = new HighScores();
		fixture.gom = new GameObjectManager();

		fixture.Update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at com.pLegacy.HighScores.writeEmptyScores(HighScores.java:112)
		//       at com.pLegacy.HighScores.<init>(HighScores.java:51)
	}

	/**
	 * Run the void draw(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testDraw_1()
		throws Exception {
		Laser fixture = new Laser(1, 1, new Ship(1, 1), new BufferedImage(1, 1, 1));
		fixture.screen = new HighScores();
		fixture.gom = new GameObjectManager();
		BufferedImage image = new BufferedImage(8, 8, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.createGraphics();

		fixture.draw(g);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at com.pLegacy.HighScores.writeEmptyScores(HighScores.java:112)
		//       at com.pLegacy.HighScores.<init>(HighScores.java:51)
	}



	/**
	 * Run the Rectangle getArea() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testGetArea_1()
		throws Exception {
		Laser fixture = new Laser(1, 1, new Ship(1, 1), new BufferedImage(1, 1, 1));
		fixture.screen = new HighScores();
		fixture.gom = new GameObjectManager();

		Rectangle result = fixture.getArea();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at com.pLegacy.HighScores.writeEmptyScores(HighScores.java:112)
		//       at com.pLegacy.HighScores.<init>(HighScores.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the void onCollision(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testOnCollision_1()
		throws Exception {
		Laser fixture = new Laser(1, 1, new Ship(1, 1), new BufferedImage(1, 1, 1));
		fixture.screen = new HighScores();
		fixture.gom = new GameObjectManager();
		GameObject obj = new Ammo(1, 1);

		fixture.onCollision(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at com.pLegacy.HighScores.writeEmptyScores(HighScores.java:112)
		//       at com.pLegacy.HighScores.<init>(HighScores.java:51)
	}

	/**
	 * Run the void onCollision(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testOnCollision_2()
		throws Exception {
		Laser fixture = new Laser(1, 1, new Ship(1, 1), new BufferedImage(1, 1, 1));
		fixture.screen = new HighScores();
		fixture.gom = new GameObjectManager();
		GameObject obj = new Ammo(1, 1);

		fixture.onCollision(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at com.pLegacy.HighScores.writeEmptyScores(HighScores.java:112)
		//       at com.pLegacy.HighScores.<init>(HighScores.java:51)
	}

	/**
	 * Run the void onCollision(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testOnCollision_3()
		throws Exception {
		Laser fixture = new Laser(1, 1, new Ship(1, 1), new BufferedImage(1, 1, 1));
		fixture.screen = new HighScores();
		fixture.gom = new GameObjectManager();
		GameObject obj = new Ammo(1, 1);

		fixture.onCollision(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at com.pLegacy.HighScores.writeEmptyScores(HighScores.java:112)
		//       at com.pLegacy.HighScores.<init>(HighScores.java:51)
	}

	/**
	 * Run the void onCollision(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testOnCollision_4()
		throws Exception {
		Laser fixture = new Laser(1, 1, new Ship(1, 1), new BufferedImage(1, 1, 1));
		fixture.screen = new HighScores();
		fixture.gom = new GameObjectManager();
		GameObject obj = new Ammo(1, 1);

		fixture.onCollision(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at com.pLegacy.HighScores.writeEmptyScores(HighScores.java:112)
		//       at com.pLegacy.HighScores.<init>(HighScores.java:51)
	}

	/**
	 * Run the void startSound() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testStartSound_1()
		throws Exception {
		Laser fixture = new Laser(1, 1, new Ship(1, 1), new BufferedImage(1, 1, 1));
		fixture.screen = new HighScores();
		fixture.gom = new GameObjectManager();

		fixture.startSound();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at com.pLegacy.HighScores.writeEmptyScores(HighScores.java:112)
		//       at com.pLegacy.HighScores.<init>(HighScores.java:51)
	}

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
		new org.junit.runner.JUnitCore().run(LaserTest.class);
	}
}