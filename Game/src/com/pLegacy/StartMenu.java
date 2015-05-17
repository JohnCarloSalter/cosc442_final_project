package com.pLegacy;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.io.File;
import java.io.IOException;
// hiS

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/*
 * 
 */
import javax.swing.Timer;


/*
 * Author: Sheik
 * Team: Project Legacy
 * This is the start up screen. It does the following in whatever order the user chooses
 * 
 * 1)Switch to the game screen by clicked "START"
 * 2)Switch to the help screen by clicking "HELP"
 * 3)Exit the game and the game screen by clicking "QUIT"
 * 
 * This panel, when the appropriate button in clicked, calls the appropriate panel and 
 * class StartMenu is removed from the gameobjectmanager. 
 * 
 * 
 */



public class StartMenu extends GamePanel implements MouseMotionListener,MouseListener {
	
	
	
	
	//3 rectangles for the menu buttons
	private Rectangle2D startButton; 
	private Rectangle2D quit;
	private Rectangle2D setting;
	private Rectangle2D info;
	private Rectangle2D HighScore;
	public boolean musicPlaying=true;
	int numberOfFallingSquares=1; 
	Timer t=new Timer(50, this);
			
	//theFont for the text in button
	int size=20;
	boolean increasing=true;
	
	int snowX=100;
	int snowY=-10;
	//a color that changes
	Color c= new Color(0,206,209).darker();
	Color b=new Color(0,206,209).darker();
	Color d=new Color(0,206,209).darker();
	Color s=new Color(0,206,209).darker();
	Color h=new Color(0,206,209).darker();
	
	///////constructor
		public StartMenu(JFrame f, boolean fromhelp)
		{
			super(f);
				setBackground(Color.black);
				addMouseMotionListener(this);
				addMouseListener(this);
				//creates Image
					 try {
						background = ImageIO.read(new File("Graphics/Background/background1.jpg"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 HighScores.readScores();
						t.start();
			if(!fromhelp)
				Audio.StartMusic("introMusic.wav");

		}

	//drawing
	public void paintComponent(Graphics g)
	{
		
			super.paintComponent(g);
			g.drawImage(background,3,0,null);
			
			Graphics2D g2d=(Graphics2D)g;
			
						//dinamically changes the font size to create bouncy effect

				
			g2d.setFont(new Font("serif",Font.BOLD+Font.ITALIC,size));
			
						//renders the font
						RenderingHints rh = new RenderingHints(
								RenderingHints.KEY_TEXT_ANTIALIASING,
								RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
						g2d.setRenderingHints(rh);
							
			g2d.setColor(Color.WHITE);
			
			//draws a new shappe with a border
			g2d.setStroke(new BasicStroke(3f));
			
			//sets color to the field color.
			g2d.setColor(c);
			
					//makes the 3 buttons
					startButton=new Rectangle2D.Double(ff.getWidth()/2.5,100,170,50);
					info=new Rectangle2D.Double(ff.getWidth()/2.5,200,170,50);
					setting=new Rectangle2D.Double(ff.getWidth()/2.5,300,170,50);
					HighScore=new Rectangle2D.Double(ff.getWidth()/2.5,400,170,50);
					quit=new Rectangle2D.Double(ff.getWidth()/2.5,500,170,50);
					
					
						//draws a button and then draws a string to describe the button
						g2d.fill(startButton);
						g2d.setColor(Color.black);
						g2d.draw(startButton);
						
			
			
							g2d.setColor(b);//makes info button
							g2d.fill(info);
							g2d.setColor(Color.black);
							g2d.draw(info);
							
								
								g2d.setColor(h);//makes quit button
								g2d.fill(HighScore);
								g2d.setColor(Color.black);
								g2d.draw(HighScore);
								
									g2d.setColor(s);//makes quit button
									g2d.fill(setting);
									g2d.setColor(Color.black);
									g2d.draw(setting);
									
									g2d.setColor(d);//makes quit button
									g2d.fill(quit);
									g2d.setColor(Color.black);
									g2d.draw(quit);
								
			
				//the strings
				g2d.drawString("START", ff.getWidth()/2-71, 129);
				g2d.drawString("CONTROLS", ff.getWidth()/2-71, 229);
				g2d.drawString("SETTING", ff.getWidth()/2-71, 329);
				g2d.drawString("HIGHSCORES", ff.getWidth()/2-74, 429);
				g2d.drawString("QUIT", ff.getWidth()/2-60, 529);
				
			/*for(int i=0; i<enemy.length;i++)
			{	
					enemy[i]=new Rectangle2D.Double(thing[i].x,thing[i].y, 30, 30);
					g2d.fill(enemy[i]);//end i
			}
			/
			 * 
			 */
		
	}
	
	
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		//calls repaint
				repaint();
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		//change color when hovered
		if(startButton.contains(e.getPoint()))
			c=new Color(0,206,209);
		else
			c=new Color(0,206,209).darker();
		if(info.contains(e.getPoint()))
			b=new Color(0,206,209);
		else
			b=new Color(0,206,209).darker();
		if(quit.contains(e.getPoint()))
			d=new Color(0,206,209);
		else
			d=new Color(0,206,209).darker();
		if(setting.contains(e.getPoint()))
			s=new Color(0,206,209);
		else
			s=new Color(0,206,209).darker();
		if(HighScore.contains(e.getPoint()))
			h=new Color(0,206,209);
		else
			h=new Color(0,206,209).darker();
		
		
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		if(quit.contains(e.getPoint())){
			//JOptionPane.showOptionDialog(null, "Are you Sure?","Choose an option",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,null);
			System.exit(0);
		}
		
		if(startButton.contains(e.getPoint()))
		{
			t.stop();
			//PanelManager.NewGame(this);
			PanelManager.NewGame(this);
		}
		if(info.contains(e.getPoint())){
			t.stop();
			PanelManager.HelpMenu(this);
		}if(setting.contains(e.getPoint())){
			switchToSettings();
		}if(HighScore.contains(e.getPoint())){
			PanelManager.ScoresMenu(this);
		}
		
		
	}
	
	private void switchToSettings() 
	{
		SettingsMenu SettingsFrame = new SettingsMenu();
		SettingsFrame.setLocationRelativeTo(ff);
		SettingsFrame.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
		SettingsFrame.setSize( 250, 500 ); // set frame size
		SettingsFrame.setVisible( true );
		SettingsFrame.setAlwaysOnTop(true);
		SettingsFrame.setResizable(false);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
}
