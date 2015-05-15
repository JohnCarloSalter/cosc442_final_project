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
import com.pLegacy.PanelManager;
import com.pLegacy.Test;

public class MeteorGenerator extends GameObject implements ActionListener
{
	private Random generator;
	private Timer timer;
	private int time;
	public static String Meteor2="Meteor2.png";
	private int currentBaseSpeed;
	private int meteorCount;
	
	public MeteorGenerator(Test gp, GameObjectManager gom)
	{
		super(gp, gom);
		generator = new Random();
		setTimer();
		setCurrentBaseSpeed(2);
		meteorCount = 0;
		Load();
		
	}

	@Override
	public void Load() 
	{
		super.Load(Meteor2);
		
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
		if(PanelManager.isPaused == false){
			
			//Meteor m = new Meteor(generator.nextInt(screen.getWidth()-30), (screen.getHeight()-screen.getHeight())-50, image, currentBaseSpeed);
			gom.addObject(new Meteor(generator.nextInt(screen.getWidth()-30), (screen.getHeight()-screen.getHeight())-150,image,currentBaseSpeed));
		
			meteorCount++;
			
			if(meteorCount > 60)
			{
				currentBaseSpeed = currentBaseSpeed + 2;
				setCurrentBaseSpeed(currentBaseSpeed);
				meteorCount = 0;
			}
		}
		setTimer();
	}
	
	public void setTimer()
	{
		time = generator.nextInt(3000)+500;
		timer = new Timer(time, this);
		timer.setRepeats(false);
		timer.start();
	}

	@Override
	public Rectangle getArea() {
		
		return null;
	}

	@Override
	public void onCollision(GameObject obj) {
		// TODO Auto-generated method stub
		
	}
	public void setCurrentBaseSpeed(int speed)
	{
		currentBaseSpeed = speed;
	}
}


