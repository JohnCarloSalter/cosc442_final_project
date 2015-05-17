package com.testPLegacy.automated;

import java.awt.Graphics;
import com.pLegacy.gameObjects.*;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

import javax.swing.DebugGraphics;

import org.junit.*;

import static org.junit.Assert.*;

import com.pLegacy.GameObjectManager;
import com.pLegacy.GamePanel;
import com.pLegacy.HighScores;
import com.pLegacy.gameObjects.Ammo;
import com.pLegacy.gameObjects.AmmoGenerator;
import com.pLegacy.gameObjects.GameObject;

/**
 * The class <code>AmmoGeneratorTest</code> contains tests for the class <code>{@link AmmoGenerator}</code>.
 *
 * @generatedBy CodePro at 5/17/15 5:31 PM
 * @author Sean
 * @version $Revision: 1.0 $
 */
public class AmmoGeneratorTest {
	/**
	 * Run the AmmoGenerator(GamePanel,GameObjectManager) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:31 PM
	 */
	@Test
	public void testAmmoGenerator_1()
		throws Exception {
		GamePanel gp = new HighScores();
		GameObjectManager gom = new GameObjectManager();

		AmmoGenerator result = new AmmoGenerator(gp, gom);

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
	 * Run the void Load() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:31 PM
	 */
	@Test
	public void testLoad_1()
		throws Exception {
		AmmoGenerator fixture = new AmmoGenerator(new HighScores(), new GameObjectManager());
		fixture.image = new BufferedImage(1, 1, 1);
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
	 * @generatedBy CodePro at 5/17/15 5:31 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		AmmoGenerator fixture = new AmmoGenerator(new HighScores(), new GameObjectManager());
		fixture.image = new BufferedImage(1, 1, 1);
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
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:31 PM
	 */
	@Test
	public void testActionPerformed_1()
		throws Exception {
		AmmoGenerator fixture = new AmmoGenerator(new HighScores(), new GameObjectManager());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.screen = new HighScores();
		fixture.gom = new GameObjectManager();
		ActionEvent arg0 = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(arg0);

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
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:31 PM
	 */
	@Test
	public void testActionPerformed_2()
		throws Exception {
		AmmoGenerator fixture = new AmmoGenerator(new HighScores(), new GameObjectManager());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.screen = new HighScores();
		fixture.gom = new GameObjectManager();
		ActionEvent arg0 = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(arg0);

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
	 * @generatedBy CodePro at 5/17/15 5:31 PM
	 */
	@Test
	public void testDraw_1()
		throws Exception {
		AmmoGenerator fixture = new AmmoGenerator(new HighScores(), new GameObjectManager());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.screen = new HighScores();
		fixture.gom = new GameObjectManager();
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
	 * @generatedBy CodePro at 5/17/15 5:31 PM
	 */
	@Test
	public void testGetArea_1()
		throws Exception {
		AmmoGenerator fixture = new AmmoGenerator(new HighScores(), new GameObjectManager());
		fixture.image = new BufferedImage(1, 1, 1);
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
	 * @generatedBy CodePro at 5/17/15 5:31 PM
	 */
	@Test
	public void testOnCollision_1()
		throws Exception {
		AmmoGenerator fixture = new AmmoGenerator(new HighScores(), new GameObjectManager());
		fixture.image = new BufferedImage(1, 1, 1);
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
	 * Run the void setTimer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:31 PM
	 */
	@Test
	public void testSetTimer_1()
		throws Exception {
		AmmoGenerator fixture = new AmmoGenerator(new HighScores(), new GameObjectManager());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.screen = new HighScores();
		fixture.gom = new GameObjectManager();

		fixture.setTimer();

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
	 * @generatedBy CodePro at 5/17/15 5:31 PM
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
	 * @generatedBy CodePro at 5/17/15 5:31 PM
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
	 * @generatedBy CodePro at 5/17/15 5:31 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AmmoGeneratorTest.class);
	}
}