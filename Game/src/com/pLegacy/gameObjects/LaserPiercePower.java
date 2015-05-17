package com.pLegacy.gameObjects;
import java.awt.Graphics;
import java.awt.Rectangle;


public class LaserPiercePower extends GameObject 
{
	public LaserPiercePower(int x, int y)
	{
		super(x, y);
	}
	@Override
	public void Load() 
	{
		super.Load("burst.gif");
	}

	@Override
	public void Update() 
	{
		if(getY() >= 600)
		{
			Unload();
		}
		setY(getY()+3);
	}

	@Override
	public void draw(Graphics g) 
	{
        g.drawImage(image, getX(),getY(),  null); 
	}
	
	@Override
	public void onCollision(GameObject obj) 
	{
		if(obj instanceof Ship)
			Unload();
	}

}
