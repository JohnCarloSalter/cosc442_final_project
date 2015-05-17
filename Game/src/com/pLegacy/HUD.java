package com.pLegacy;

import com.pLegacy.gameObjects.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Timer;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.pLegacy.gameObjects.Ship;



public class HUD extends GamePanel
{
	Image health;
	Image powerup;
	Image pierce;
	Image ammo;
	Timer tm;
	int time = 0;
	final SimpleDateFormat TIME; 
	
	
	public HUD(JFrame f, GameObjectManager _gom, Ship ship)
	{
		super(f, _gom, ship);
		tm = new Timer(1000, this);
		TIME = new SimpleDateFormat("mm:ss");
		tm.start();
		try 
		{
			pierce = ImageIO.read(new File("Graphics/HUD/burst_icon.gif"));
			health = ImageIO.read(new File("Graphics/HUD/heart_icon.gif"));
			powerup = ImageIO.read(new File("Graphics/HUD/power_up_icon.gif"));
			ammo = ImageIO.read(new File("Graphics/HUD/ammo_icon.gif"));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(!PanelManager.isPaused)
			time++;

	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		//Draws ammo
		for(int x = 0; x < ship.ammo; x++)
		{
			g.drawImage(ammo, getScreenWidth()-25 - 20*x, getScreenHeight()-50, null);
		}
		
		//Draws health
		for(int x = 0; x < ship.health; x++)
		{
			g.drawImage(health, getScreenWidth()/80 + 20*x, getScreenHeight()-50 , null);
		}
		
		//Draws power up combos
		if(ship.autofireon)
		{
			g.drawImage(powerup, getScreenWidth()/4+30, getScreenHeight()-50, null);
		}
		for(int x = 0; x < ship.piercinglasers; x++)
		{
			g.drawImage(pierce, getScreenWidth()/4 + 180 - 28*x, getScreenHeight()-50, null);
		}
		
		//Draw Game Time
		g.setColor(Color.WHITE);
		g.setFont(new Font("serif",Font.BOLD+Font.ITALIC,20));
		//g.drawString(TIME.format(time * 10), getScreenWidth()/2, getScreenHeight()-30);
		g.drawString(String.valueOf(Ship.score), getScreenWidth()/2, getScreenHeight()-30);
	}

}
