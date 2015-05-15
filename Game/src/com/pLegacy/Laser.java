package com.pLegacy;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Laser extends GameObject
{
	private Ship ship;
	private boolean loaded = false;
	  public Laser(int x, int y, Ship _ship, BufferedImage shot)
	    {
	    	super(x, y);
	    	image = shot;
	    	ship = _ship;
	    	if(PanelManager.isPaused == false)
	    		startSound();
	    	
	    }
	  
	  public void startSound()
	    {
	    	
	    	Audio.Start("laser shot.wav");

	    }
	  
	  
	@Override
	public void Load() 
	{
		
	}

	@Override
	public void Update() 
	{
		// TODO Auto-generated method stub
		if(getY() <= -10)
		{
			Unload();
			
		}
		this.setY(getY()-10);
	}

	@Override
	public void draw(Graphics g) 
	{
		// TODO Auto-generated method stub
		  g.drawImage(image, getX(),getY(),  null);
		  if(gom.IsDebug())
			{
				Graphics2D g2d=(Graphics2D)g;
				g2d.draw(getArea());
			}
	}
	
	@Override
	public Rectangle getArea()
	{
		return new Rectangle(getX(),getY(),image.getWidth(), image.getHeight());

	}

	public void onCollision(GameObject obj) 
	{
		
		if(obj instanceof Meteor)
		{
			if(ship.piercinglasers < 0 || ship.autofireon == true)
				Unload();
		}
		
			
	}
}
