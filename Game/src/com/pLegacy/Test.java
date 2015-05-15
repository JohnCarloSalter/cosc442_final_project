package com.pLegacy;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.Timer;

import javax.swing.JFrame;



public class Test extends GamePanel implements KeyListener
{
	
	static Timer tm;
	Random generator = new Random();
	int y=-300;
	int y3=-300;
	int y2=-300;
	int time=0;
	int coolDown=800;
	int coolDown2=500;
	static int milisecondtime = 5;
	HUD hud;
	public boolean isAlive=true;

	boolean levelChange=false;
	

	float alpha = 0f;
	float alpha2 = 0f;
	float bgalpha1 = 1f;
	float bgalpha2 = 0f;
	private Image foreground;
	int rifty = 0;
	int lvl2y = 0;
	ImageIcon c;
	ImageIcon b;
	BufferedImage level2;
	
	private ArrayList<GameObject> MG;
	private BufferedImage rift;
	private BufferedImage verge;
	
	
	
	public Test(JFrame f, GameObjectManager _gom, Ship _ship)
	{
		super(f, _gom, _ship);
		//creates a HUD display
		isAlive=true;
		hud = new HUD(f, _gom, _ship);
		
		//adds it to the frame
		hud.setVisible(true);
		try {
			 b= new ImageIcon(ImageIO.read(new File("Graphics/Background/spaceBackground.jpg")));
				background = b.getImage();
			c = new ImageIcon( ImageIO.read(new File("Graphics/Background/Space2.png")));
			foreground = c.getImage();
			level2=ImageIO.read(new File("Graphics/Background/art.jpg"));
			rift=ImageIO.read(new File("Graphics/Background/rift.png"));
			verge=ImageIO.read(new File("Graphics/Background/verge.gif"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tm = new Timer(milisecondtime,this);
		 
		init();
		 Audio.StartMusic("music.wav");
		 tm.start();
	}
	
	
	public void init()
	{
		MG=new ArrayList<GameObject>();
		//Each generator will randomly generate a meteor at a random interval.
		
		//PLEASE USE A FOR LOOP, think this was causing the slow down
		for(int i=0; i<=6; i++)
		{
			MG.add(new MeteorGenerator(this, gom));
		}
		PowerUpGenerator powerups = new PowerUpGenerator(this, gom);
		AmmoGenerator ammo = new AmmoGenerator(this, gom);
		MG.add(powerups);
		MG.add(ammo);
		
		
		
		
			
	}
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;

		
		
		if(levelChange){
			
			//Draws the image two times to give the illusion of movement.
			//this puts the first image on top of the second image by getting it's height
			g2d.drawImage(level2, -200, y3-level2.getHeight(null), null);
			g2d.drawImage(level2, -200, y3, null);
			//Drawing foreground
			g2d.drawImage(foreground, -10, y2-foreground.getHeight(null), null);
			g2d.drawImage(foreground, -10, y2, null);
			
			if(bgalpha2 < 1)
			{
				g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, bgalpha2));
				bgalpha2 += 0.01f;
			}
			
		}
		
		if(levelChange==false || bgalpha1 > 0)
		{
			if(levelChange)
			{
				bgalpha1 -= 0.01f;
				if(bgalpha1 < 0)
					bgalpha1 = 0;
				g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, bgalpha1));
			}
				//Draws the image two times to give the illusion of movement.
				//this puts the first image on top of the second image by getting it's height
				g2d.drawImage(background, -80, y-background.getHeight(null), null);
				g2d.drawImage(background, -80, y, null);
				//Drawing foreground
				g2d.drawImage(foreground, -10, y2-foreground.getHeight(null), null);
				g2d.drawImage(foreground, -10, y2, null);
				
						
		}
		
		g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
		gom.draw(g2d);
		hud.paintComponent(g2d);
		
		
		
		if(coolDown>=0 || alpha > 0)
		{
			g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
			g2d.drawImage(rift, 260, rifty, null);
			coolDown--;
			if(coolDown <= 0)
			{
				alpha -= 0.01f;
				rifty++;
				if(alpha < 0)
					alpha = 0f;
			}
			else
			{
				coolDown--;
				rifty++;
				alpha += 0.01f;
			if(alpha > 1)
				alpha = 1f;
			if(rifty > 200)
				rifty = 200;
			}
		}
		
		if((coolDown2>=0 || alpha2 > 0)&&levelChange)
		{
			g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha2));
			g2d.drawImage(verge, 240, lvl2y, null);
			if(coolDown2 <= 0)
			{
				alpha2 -= 0.01f;
				lvl2y++;
				if(alpha2 < 0)
					alpha2 = 0f;
			}
			else
			{
				coolDown2--;
				lvl2y++;
				alpha2 += 0.01f;
			if(alpha2 > 1)
				alpha2 = 1f;
			if(lvl2y > 200)
				lvl2y = 200;
			}
		
			}//end if 
		
		
	} 
	
		

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		time++;
		
		if(Ship.score>=1600)
			levelChange=true;
		
		if(time%12==0){
			if(Ship.score>=0)
				Ship.score++;
			else
				Ship.score=0;
		}
		
		if(time%8==0){
			if(y3==ff.getHeight())
				y3=-(level2.getHeight(null)-ff.getHeight());
			else
				y3++;
		}
		
		//Scrolling Stuff
		if(time%10 == 0){
				if(y==ff.getHeight())
					y=-(background.getHeight(null)-ff.getHeight());
				else
					y++;
			
		}
		
					
		
		if(y2>=ff.getHeight())
			y2=-(ff.getHeight());
		else
			y2+=8;
		
		
			
					if(k.keyIsDown(KeyEvent.VK_P)){
						
						this.addKeyListener(this);
						PanelManager.isPaused=true;
						PanelManager.Pause();
						repaint();
						tm.stop();
						
					}//end if
		
		//####################DEAD SHIP######################################
					//if the you die, stops this panels music as well.
					if(ship.isdead==true){
						MG.clear();
						isAlive=false;
						HighScores.writeScores();
						this.addKeyListener(this);
						Audio.Stop();
						PanelManager.gameOver();
						tm.stop();
					}
		//####################DEAD SHIP#######################################
		
		//MOVES SHIP
		if(super.k.keyIsDown(KeyEvent.VK_RIGHT)){
			ship.setX(ship.getX()+Ship.Speed);
		}
		if(super.k.keyIsDown(KeyEvent.VK_LEFT)){
			ship.setX(ship.getX()-Ship.Speed);
		}
		
		
				
		hud.actionPerformed(e);
		if(isAlive == true)
		{
			gom.Update();
			gom.Load();
		}
		//gom.Collision();
		//System.out.println("Total of "+gom.AmountOfCurrentObjects()+" Game Objects");
		repaint();
		
		
			
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(PanelManager.isPaused==true)
		{
			if(e.getKeyCode()==KeyEvent.VK_R)
			{	
				PanelManager.Resume();
				tm.start();
			}
		}
			
		//CODE FOR GAME OVER SCREEN
		if(ship.isdead==true)
		{	
			if(e.getKeyCode()==KeyEvent.VK_R)
			{
				
				//PanelManager.MainMenu(this, false);
				PanelManager.reset();
				ship.isdead=false;
									
			}//end Restart
								
			if(e.getKeyCode()==KeyEvent.VK_Q)
			{
				System.exit(0);
			}//end Quit
		}//end big if
							
			
			
	//Toggles Debug Mode
	if(e.getKeyCode()==(KeyEvent.VK_F1))
		gom.Debug();
	}

}
