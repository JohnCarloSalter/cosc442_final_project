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
	 * Run the void Load() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testLoad_1()
		throws Exception {
		Meteor fixture = new Meteor(1, 1, new BufferedImage(1, 1, 1), 1);
		fixture.setBaseSpeed(1);
		fixture.gom = new GameObjectManager();
		fixture.speed = 1;
		fixture.generator = new Random();
		fixture.cd = 1;
		fixture.screen = new HighScores();

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
		Meteor fixture = new Meteor(1, 1, new BufferedImage(1, 1, 1), 1);
		fixture.setBaseSpeed(1);
		fixture.gom = new GameObjectManager();
		fixture.speed = 1;
		fixture.generator = new Random();
		fixture.cd = 1;
		fixture.screen = new HighScores();

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
		Meteor fixture = new Meteor(1, 1, new BufferedImage(1, 1, 1), 1);
		fixture.setBaseSpeed(1);
		fixture.gom = new GameObjectManager();
		fixture.speed = 1;
		fixture.generator = new Random();
		fixture.cd = 1;
		fixture.screen = new HighScores();

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
		Meteor fixture = new Meteor(1, 1, new BufferedImage(1, 1, 1), 1);
		fixture.setBaseSpeed(1);
		fixture.gom = new GameObjectManager();
		fixture.speed = 1;
		fixture.generator = new Random();
		fixture.cd = 1;
		fixture.screen = new HighScores();
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
	 * Run the void draw(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testDraw_2()
		throws Exception {
		Meteor fixture = new Meteor(1, 1, new BufferedImage(1, 1, 1), 1);
		fixture.setBaseSpeed(1);
		fixture.gom = new GameObjectManager();
		fixture.speed = 1;
		fixture.generator = new Random();
		fixture.cd = 1;
		fixture.screen = new HighScores();
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
	 * Run the void draw(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testDraw_3()
		throws Exception {
		Meteor fixture = new Meteor(1, 1, new BufferedImage(1, 1, 1), 1);
		fixture.setBaseSpeed(1);
		fixture.gom = new GameObjectManager();
		fixture.speed = 1;
		fixture.generator = new Random();
		fixture.cd = 0;
		fixture.screen = new HighScores();
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
	 * Run the void draw(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testDraw_4()
		throws Exception {
		Meteor fixture = new Meteor(1, 1, new BufferedImage(1, 1, 1), 1);
		fixture.setBaseSpeed(1);
		fixture.gom = new GameObjectManager();
		fixture.speed = 1;
		fixture.generator = new Random();
		fixture.cd = 1;
		fixture.screen = new HighScores();
		Graphics g = new DebugGraphics();

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
	 * Run the void draw(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testDraw_5()
		throws Exception {
		Meteor fixture = new Meteor(1, 1, new BufferedImage(1, 1, 1), 1);
		fixture.setBaseSpeed(1);
		fixture.gom = new GameObjectManager();
		fixture.speed = 1;
		fixture.generator = new Random();
		fixture.cd = 1;
		fixture.screen = new HighScores();
		Graphics g = new DebugGraphics();

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
	 * Run the void draw(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testDraw_6()
		throws Exception {
		Meteor fixture = new Meteor(1, 1, new BufferedImage(1, 1, 1), 1);
		fixture.setBaseSpeed(1);
		fixture.gom = new GameObjectManager();
		fixture.speed = 1;
		fixture.generator = new Random();
		fixture.cd = 0;
		fixture.screen = new HighScores();
		Graphics g = new DebugGraphics();

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
		Meteor fixture = new Meteor(1, 1, new BufferedImage(1, 1, 1), 1);
		fixture.setBaseSpeed(1);
		fixture.gom = new GameObjectManager();
		fixture.speed = 1;
		fixture.generator = new Random();
		fixture.cd = 1;
		fixture.screen = new HighScores();

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
		Meteor fixture = new Meteor(1, 1, new BufferedImage(1, 1, 1), 1);
		fixture.setBaseSpeed(1);
		fixture.gom = new GameObjectManager();
		fixture.speed = 1;
		fixture.generator = new Random();
		fixture.cd = 1;
		fixture.screen = new HighScores();
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
		Meteor fixture = new Meteor(1, 1, new BufferedImage(1, 1, 1), 1);
		fixture.setBaseSpeed(1);
		fixture.gom = new GameObjectManager();
		fixture.speed = 1;
		fixture.generator = new Random();
		fixture.cd = 1;
		fixture.screen = new HighScores();
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
		Meteor fixture = new Meteor(1, 1, new BufferedImage(1, 1, 1), 1);
		fixture.setBaseSpeed(1);
		fixture.gom = new GameObjectManager();
		fixture.speed = 1;
		fixture.generator = new Random();
		fixture.cd = 1;
		fixture.screen = new HighScores();
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
		Meteor fixture = new Meteor(1, 1, new BufferedImage(1, 1, 1), 1);
		fixture.setBaseSpeed(1);
		fixture.gom = new GameObjectManager();
		fixture.speed = 1;
		fixture.generator = new Random();
		fixture.cd = 1;
		fixture.screen = new HighScores();
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
	public void testOnCollision_5()
		throws Exception {
		Meteor fixture = new Meteor(1, 1, new BufferedImage(1, 1, 1), 1);
		fixture.setBaseSpeed(1);
		fixture.gom = new GameObjectManager();
		fixture.speed = 1;
		fixture.generator = new Random();
		fixture.cd = 1;
		fixture.screen = new HighScores();
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
	public void testOnCollision_6()
		throws Exception {
		Meteor fixture = new Meteor(1, 1, new BufferedImage(1, 1, 1), 1);
		fixture.setBaseSpeed(1);
		fixture.gom = new GameObjectManager();
		fixture.speed = 1;
		fixture.generator = new Random();
		fixture.cd = 1;
		fixture.screen = new HighScores();
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
	 * Run the void setBaseSpeed(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:29 PM
	 */
	@Test
	public void testSetBaseSpeed_1()
		throws Exception {
		Meteor fixture = new Meteor(1, 1, new BufferedImage(1, 1, 1), 1);
		fixture.setBaseSpeed(1);
		fixture.gom = new GameObjectManager();
		fixture.speed = 1;
		fixture.generator = new Random();
		fixture.cd = 1;
		fixture.screen = new HighScores();
		int speed = 1;

		fixture.setBaseSpeed(speed);

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
		new org.junit.runner.JUnitCore().run(MeteorTest.class);
	}
}