package com.testPLegacy;
import com.pLegacy.*;

import javax.swing.JFrame;

import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;
//Checking if adding comments does anything good
/**
 * The class <code>PanelManagerTest</code> contains tests for the class <code>{@link PanelManager}</code>.
 *
 * @generatedBy CodePro at 5/17/15 1:42 PM
 * @author Sean
 * @version $Revision: 1.0 $
 */
public class PanelManagerTest {
	/**
	 * Run the PanelManager() constructor test.
	 *
	 * @generatedBy CodePro at 5/17/15 1:42 PM
	 */
	@Test
	public void testPanelManager_1()
		throws Exception {
		PanelManager result = new PanelManager();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void HelpMenu(GamePanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 1:42 PM
	 */
	@Test
	public void testHelpMenu_1()
		throws Exception {
		GamePanel old = new HighScores();

		PanelManager.HelpMenu(old);

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
	 * Run the void MainMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 1:42 PM
	 */
	@Test
	public void testMainMenu_1()
		throws Exception {

		PanelManager.MainMenu();

		// add additional test code here
	}

	/**
	 * Run the void MainMenu(GamePanel,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 1:42 PM
	 */
	@Test
	public void testMainMenu_2()
		throws Exception {
		GamePanel old = new HighScores();
		boolean fromhelp = false;

		PanelManager.MainMenu(old, fromhelp);

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
	 * Run the void MainMenu(GamePanel,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 1:42 PM
	 */
	@Test
	public void testMainMenu_3()
		throws Exception {
		GamePanel old = new HighScores();
		boolean fromhelp = false;

		PanelManager.MainMenu(old, fromhelp);

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
	 * Run the void MainMenu(GamePanel,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 1:42 PM
	 */
	@Test
	public void testMainMenu_4()
		throws Exception {
		GamePanel old = new HighScores();
		boolean fromhelp = true;

		PanelManager.MainMenu(old, fromhelp);

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
	 * Run the void MainMenu(GamePanel,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 1:42 PM
	 */
	@Test
	public void testMainMenu_5()
		throws Exception {
		GamePanel old = new HighScores();
		boolean fromhelp = true;

		PanelManager.MainMenu(old, fromhelp);

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
	 * Run the void NewGame(GamePanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 1:42 PM
	 */
	@Test
	public void testNewGame_1()
		throws Exception {
		GamePanel old = new HighScores();

		PanelManager.NewGame(old);

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
	 * Run the void ScoresMenu(GamePanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 1:42 PM
	 */
	@Test
	public void testScoresMenu_1()
		throws Exception {
		GamePanel old = new HighScores();

		PanelManager.ScoresMenu(old);

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
	 * Run the void SetFrame(JFrame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 1:42 PM
	 */
	@Test
	public void testSetFrame_1()
		throws Exception {
		JFrame f = new JFrame();

		PanelManager.SetFrame(f);

		// add additional test code here
	}

	/**
	 * Run the void SetGOM(GameObjectManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 1:42 PM
	 */
	@Test
	public void testSetGOM_1()
		throws Exception {
		GameObjectManager _gom = new GameObjectManager();

		PanelManager.SetGOM(_gom);

		// add additional test code here
	}

	/**
	 * Run the void gameOver() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 1:42 PM
	 */
	@Test
	public void testGameOver_1()
		throws Exception {

		PanelManager.gameOver();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/15 1:42 PM
	 */
	@Test
	public void testReset_1()
		throws Exception {

		PanelManager.reset();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/15 1:42 PM
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
	 * @generatedBy CodePro at 5/17/15 1:42 PM
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
	 * @generatedBy CodePro at 5/17/15 1:42 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PanelManagerTest.class);
	}
}