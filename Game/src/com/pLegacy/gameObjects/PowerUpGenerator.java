package com.pLegacy.gameObjects;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Timer;

import com.pLegacy.GameObjectManager;
import com.pLegacy.GamePanel;
import com.pLegacy.PanelManager;

public class PowerUpGenerator extends GameObject implements ActionListener
{
	private Random generator;
	private Timer timer;
	public int time;
	
	public PowerUpGenerator(GamePanel gp, GameObjectManager _gom)
	{
		super(gp, _gom);
		generator = new Random();
		setTimer();
		timer.setRepeats(false);
	}

	@Override
	public void Load() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update()
	{
		//no  update event
	}

	@Override
	public void draw(Graphics g) 
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		setTimer();
			int powerup = generator.nextInt(4);
			switch (powerup)
			{
			case 0: //No power up generated
				break;
			case 1:
				AutoFirePower p = new AutoFirePower(generator.nextInt(screen.getWidth()-30), screen.getHeight()-screen.getHeight()-50);
				gom.addObject(p);
				break;
			case 2:
				LaserPiercePower q = new LaserPiercePower(generator.nextInt(screen.getWidth()-30), screen.getHeight()-screen.getHeight()-50);
				gom.addObject(q);
				break;
			case 3:
				Life l = new Life(generator.nextInt(screen.getWidth()-30), screen.getHeight()-screen.getHeight()-50);
				gom.addObject(l);
				break;
			}
			
	}

	public void setTimer()
	{
		if(!PanelManager.isPaused)
		{
			time = generator.nextInt(19500)+1500;
			timer = new Timer(time, this);
			timer.setRepeats(false);
			timer.start();
		}
		else
			timer.stop();
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
}


