package com.pLegacy.gameObjects;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import org.junit.*;

import static org.junit.Assert.*;

import com.pLegacy.GameObjectManager;
import com.pLegacy.GamePanel;
import com.pLegacy.HighScores;
import com.pLegacy.gameObjects.Ammo;
import com.pLegacy.gameObjects.GameObject;

/**
 * The class <code>GameObjectTest</code> contains tests for the class <code>{@link GameObject}</code>.
 *
 * @generatedBy CodePro at 5/17/15 5:27 PM
 * @author Sean
 * @version $Revision: 1.0 $
 */
public class GameObjectTest {
	/**
	 * Run the void Load(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:27 PM
	 */
	@Test
	public void testLoad_1()
		throws Exception {
		Ammo fixture = new Ammo(1, 1);
		fixture.screen = new HighScores();
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		String _img = "";

		fixture.Load(_img);

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
	 * Run the void Load(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:27 PM
	 */
	@Test
	public void testLoad_2()
		throws Exception {
		Ammo fixture = new Ammo(1, 1);
		fixture.screen = new HighScores();
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		String _img = "";

		fixture.Load(_img);

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
	 * Run the void Unload() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:27 PM
	 */
	@Test
	public void testUnload_1()
		throws Exception {
		Ammo fixture = new Ammo(1, 1);
		fixture.screen = new HighScores();
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();

		fixture.Unload();

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
	 * @generatedBy CodePro at 5/17/15 5:27 PM
	 */
	@Test
	public void testGetArea_1()
		throws Exception {
		Ammo fixture = new Ammo(1, 1);
		fixture.screen = new HighScores();
		fixture.image = new BufferedImage(1, 1, 1);
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
	 * Run the GameObjectManager getGOM() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:27 PM
	 */
	@Test
	public void testGetGOM_1()
		throws Exception {
		Ammo fixture = new Ammo(1, 1);
		fixture.screen = new HighScores();
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();

		GameObjectManager result = fixture.getGOM();

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
	 * Run the int getX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:27 PM
	 */
	@Test
	public void testGetX_1()
		throws Exception {
		Ammo fixture = new Ammo(1, 1);
		fixture.screen = new HighScores();
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();

		int result = fixture.getX();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at com.pLegacy.HighScores.writeEmptyScores(HighScores.java:112)
		//       at com.pLegacy.HighScores.<init>(HighScores.java:51)
		assertEquals(0, result);
	}

	/**
	 * Run the int getY() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:27 PM
	 */
	@Test
	public void testGetY_1()
		throws Exception {
		Ammo fixture = new Ammo(1, 1);
		fixture.screen = new HighScores();
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();

		int result = fixture.getY();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileWriter.<init>(Unknown Source)
		//       at com.pLegacy.HighScores.writeEmptyScores(HighScores.java:112)
		//       at com.pLegacy.HighScores.<init>(HighScores.java:51)
		assertEquals(0, result);
	}

	/**
	 * Run the void setGOM(GameObjectManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:27 PM
	 */
	@Test
	public void testSetGOM_1()
		throws Exception {
		Ammo fixture = new Ammo(1, 1);
		fixture.screen = new HighScores();
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		GameObjectManager _gom = new GameObjectManager();

		fixture.setGOM(_gom);

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
	 * Run the void setPanel(GamePanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:27 PM
	 */
	@Test
	public void testSetPanel_1()
		throws Exception {
		Ammo fixture = new Ammo(1, 1);
		fixture.screen = new HighScores();
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		GamePanel gp = new HighScores();

		fixture.setPanel(gp);

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
	 * Run the void setX(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:27 PM
	 */
	@Test
	public void testSetX_1()
		throws Exception {
		Ammo fixture = new Ammo(1, 1);
		fixture.screen = new HighScores();
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		int x = 1;

		fixture.setX(x);

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
	 * Run the void setY(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 5:27 PM
	 */
	@Test
	public void testSetY_1()
		throws Exception {
		Ammo fixture = new Ammo(1, 1);
		fixture.screen = new HighScores();
		fixture.image = new BufferedImage(1, 1, 1);
		fixture.gom = new GameObjectManager();
		int y = 1;

		fixture.setY(y);

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
	 * @generatedBy CodePro at 5/17/15 5:27 PM
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
	 * @generatedBy CodePro at 5/17/15 5:27 PM
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
	 * @generatedBy CodePro at 5/17/15 5:27 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GameObjectTest.class);
	}
}