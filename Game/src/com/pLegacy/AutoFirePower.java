package com.pLegacy;
import java.awt.Graphics;
import java.awt.Rectangle;


public class AutoFirePower extends GameObject 
{
	public AutoFirePower(int x, int y)
	{
		super(x, y);
	}
	@Override
	public void Load() 
	{
		super.Load("power_up.png");
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
