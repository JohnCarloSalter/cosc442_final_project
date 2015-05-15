package com.pLegacy.gameObjects;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.Timer;

import com.pLegacy.GameObjectManager;
import com.pLegacy.GamePanel;
import com.pLegacy.PanelManager;

public class AmmoGenerator extends GameObject implements ActionListener
{
	private Random generator;
	private Timer timer;
	private int time;
	
	public AmmoGenerator(GamePanel gp, GameObjectManager gom)
	{
		super(gp, gom);
		generator = new Random();
		setTimer();
	}

	@Override
	public void Update()
	{
		
	}

	@Override
	public void draw(Graphics g) 
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		if(PanelManager.isPaused==false)
		{
			Ammo a = new Ammo(generator.nextInt(screen.getWidth()-30), (screen.getHeight()-screen.getHeight())-50);
			gom.addObject(a);
		}
		setTimer();
	}
	
	public void setTimer()
	{
		time = generator.nextInt(19500)+1500;
		timer = new Timer(time, this);
		timer.setRepeats(false);
		timer.start();
	}

	@Override
	public Rectangle getArea() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onCollision(GameObject obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Load() {
		// TODO Auto-generated method stub
		
	}

}


