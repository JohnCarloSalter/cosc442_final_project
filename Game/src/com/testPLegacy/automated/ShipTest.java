package com.testPLegacy.automated;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.swing.DebugGraphics;
import javax.swing.Timer;

import org.junit.*;

import static org.junit.Assert.*;

import com.pLegacy.GameObjectManager;
import com.pLegacy.GamePanel;
import com.pLegacy.HighScores;
import com.pLegacy.SettingsMenu;
import com.pLegacy.keyTracker;
import com.pLegacy.gameObjects.Ammo;
import com.pLegacy.gameObjects.GameObject;
import com.pLegacy.gameObjects.Ship;

/**
 * The class <code>ShipTest</code> contains tests for the class <code>{@link Ship}</code>.
 *
 * @generatedBy CodePro at 5/17/15 5:30 PM
 * @author Sean
 * @version $Revision: 1.0 $
 */
public class ShipTest {
	/**
	 * Run the Ship(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testShip_1()
		throws Exception {
		int x = 1;
		int y = 1;

		Ship result = new Ship(x, y);

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testLoad_1()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(false);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = false;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testUpdate_2()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 0;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testUpdate_3()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testUpdate_4()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(false);
		fixture.health = 0;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testUpdate_5()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(false);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testUpdate_6()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(false);
		fixture.health = 0;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testUpdate_7()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(false);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = false;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testUpdate_8()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 0;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testUpdate_9()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testUpdate_10()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(false);
		fixture.health = 0;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testUpdate_11()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(false);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testUpdate_12()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(false);
		fixture.health = 0;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testUpdate_13()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(false);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = false;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testUpdate_14()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 0;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testUpdate_15()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testActionPerformed_1()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = false;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testActionPerformed_2()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = false;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testActionPerformed_3()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testActionPerformed_4()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testActionPerformed_5()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = false;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testActionPerformed_6()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testActionPerformed_7()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testActionPerformed_8()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = false;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testActionPerformed_9()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = false;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testActionPerformed_10()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = false;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testDraw_1()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testDraw_2()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testDraw_3()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 0;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testDraw_4()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 0;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testGetArea_1()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

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
	 * Run the Timer getAutoduration() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testGetAutoduration_1()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

		Timer result = fixture.getAutoduration();

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
	 * Run the Timer getTimer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testGetTimer_1()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

		Timer result = fixture.getTimer();

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
	 * Run the void keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testKeyPressed_1()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = false;
		fixture.piercinglasers = 0;
		fixture.isHit = true;
		KeyEvent event = new KeyEvent(new SettingsMenu(), 1, 1L, 1, 1);

		fixture.keyPressed(event);

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
	 * Run the void keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testKeyPressed_2()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = false;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
		KeyEvent event = new KeyEvent(new SettingsMenu(), 1, 1L, 1, 1);

		fixture.keyPressed(event);

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
	 * Run the void keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testKeyPressed_3()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 0;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
		KeyEvent event = new KeyEvent(new SettingsMenu(), 1, 1L, 1, 1);

		fixture.keyPressed(event);

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
	 * Run the void keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testKeyPressed_4()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
		KeyEvent event = new KeyEvent(new SettingsMenu(), 1, 1L, 1, 1);

		fixture.keyPressed(event);

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
	 * Run the void keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testKeyPressed_5()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = false;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
		KeyEvent event = new KeyEvent(new SettingsMenu(), 1, 1L, 1, 1);

		fixture.keyPressed(event);

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
	 * Run the void keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testKeyPressed_6()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
		KeyEvent event = new KeyEvent(new SettingsMenu(), 1, 1L, 1, 1);

		fixture.keyPressed(event);

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
	 * Run the void keyReleased(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testKeyReleased_1()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
		KeyEvent e = new KeyEvent(new SettingsMenu(), 1, 1L, 1, 1);

		fixture.keyReleased(e);

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
	 * Run the void keyTyped(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testKeyTyped_1()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
		KeyEvent e = new KeyEvent(new SettingsMenu(), 1, 1L, 1, 1);

		fixture.keyTyped(e);

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testOnCollision_1()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = false;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testOnCollision_2()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 6;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testOnCollision_3()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 6;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testOnCollision_4()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testOnCollision_5()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = false;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testOnCollision_6()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testOnCollision_7()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testOnCollision_8()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = false;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testOnCollision_9()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
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
	 * Run the void setDmgcounter(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testSetDmgcounter_1()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
		int x = 1;

		fixture.setDmgcounter(x);

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
	 * Run the void setLaserImage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testSetLaserImage_1()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

		fixture.setLaserImage();

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
	 * Run the void setLaserImage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testSetLaserImage_2()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

		fixture.setLaserImage();

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
	 * Run the void setLaserImage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testSetLaserImage_3()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;

		fixture.setLaserImage();

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
	 * Run the void setTimestart(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	@Test
	public void testSetTimestart_1()
		throws Exception {
		Ship fixture = new Ship(1, 1);
		fixture.setTimestart(true);
		fixture.health = 1;
		fixture.k = new keyTracker();
		fixture.ammo = 1;
		fixture.laser = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		fixture.screen = new HighScores();
		fixture.isdead = true;
		fixture.pierceLaser = new BufferedImage(1, 1, 1);
		fixture.autoduration = new Timer(1, new HighScores());
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.cd = 1;
		fixture.autofireon = true;
		fixture.piercinglasers = 1;
		fixture.isHit = true;
		boolean b = true;

		fixture.setTimestart(b);

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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
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
	 * @generatedBy CodePro at 5/17/15 5:30 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ShipTest.class);
	}
}