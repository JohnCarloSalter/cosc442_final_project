package com.pLegacy.gameObjects;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Ammo extends GameObject
{

	public Ammo(int x, int y)
	{
		super(x, y);
	}
	
	@Override
	public void Load()
	{
		super.Load("ammo.gif");
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		if(getY() >= 600)
		{
			Unload();
		}
		setY(getY()+3);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(image, getX(), getY(), null);
		 if(gom.IsDebug())
			{
				Graphics2D g2d=(Graphics2D)g;
				g2d.draw(getArea());
			}
	}

	@Override
	public void onCollision(GameObject obj) 
	{
		// TODO Auto-generated method stub
		if(obj instanceof Ship)
		{
			Unload();
			
		}
	}

}
