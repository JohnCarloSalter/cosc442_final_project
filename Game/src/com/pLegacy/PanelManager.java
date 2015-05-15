package com.pLegacy;
import javax.swing.JFrame;





public class PanelManager 
{
	private static GameObjectManager gom;
	private static JFrame frame;
	public static boolean isPaused=false;
	static gamePaused gp;
	static gameOver go;
	static Test game;
	public static void SetFrame(JFrame f)
	{
		frame = f;
	}
	
	public static void SetGOM(GameObjectManager _gom)
	{
		gom = _gom;
	}
	
	public static void NewGame(GamePanel old)
	{
		try
		{
			Audio.Stop();
			Ship ship = new Ship(350, 495);
			gom.addObject(ship);
			game = new Test(frame, gom, ship);
			PanelManager.isPaused=false;
			game.addKeyListener(game);
			frame.addKeyListener(game);
			game.setVisible(true);
			old.setVisible(false);
			frame.addKeyListener(ship);
			frame.remove(old);
			old = null;
			frame.add(game);
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	public static void HelpMenu(GamePanel old)
	{
		try{	
			HelpMenu help = new HelpMenu(frame);
			frame.add(help);
			help.setVisible(true);
			old.setVisible(false);
			frame.remove(old);
		}
		catch(Exception e){}
	}
	
	public static void ScoresMenu(GamePanel old){
		try
		{
			Audio.Stop();
			HighScores h=new HighScores();
			frame.add(h);
			h.setVisible(true);
			old.setVisible(false);
			frame.remove(old);
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	public static void MainMenu(GamePanel old, boolean fromhelp)
	{
		
			isPaused = false;
			if (game != null)
				game = null;
			
			if(fromhelp == false)
			{
				try
				{
					Audio.Stop();
				}
				catch(Exception e)
				{
					
				}
			}
		
		try{
			StartMenu startMenu = new StartMenu(frame, fromhelp);
			frame.add(startMenu);
			startMenu.setVisible(true);
			old.setVisible(false);
			frame.remove(old);
		}catch(Exception e){}
	}
	
	//just an extention of the paused method, nothing special, switches between the 2 panels
	public static void gameOver()
	{	
		try{
			go=new gameOver();
			frame.add(go);
			go.setVisible(true);
			game.setVisible(false);
			frame.remove(game);
		}
		catch(Exception e){}
	}
	
	//passes gameover panel to MainMenu. 
	public static void reset()
	{
		try{
			GameObjectManager _gom = new GameObjectManager();
			SetGOM(_gom);
			MainMenu(go, false);
		}catch(Exception e){}
	}
	
	//PAUSES THE GAME
	public static void Pause()
	{
		gp=new gamePaused();
		isPaused=true;
		frame.add(gp);
		gp.setVisible(true);
		game.setVisible(false);
	}
	
	public static void Resume()
	{
		
		isPaused=false;
		gp.setVisible(false);
		frame.remove(gp);
		gp = null;
		game.setVisible(true);
	}
	
	public static void MainMenu() //First time game is started
	{
		try{
			StartMenu startMenu = new StartMenu(frame, false);
			frame.add(startMenu);
		}catch(Exception e){}
	}
	
	
}
