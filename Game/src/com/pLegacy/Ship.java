package com.pLegacy;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Timer;

public class Ship extends GameObject implements KeyListener, ActionListener
{
    public boolean autofireon = false;
    public int piercinglasers = -1;
    private Timer tm;
    Timer autoduration;
    private boolean timestart;
    keyTracker k=new keyTracker();
    int ammo = 10;
    int health = 10;
    static int score=0;
    public boolean isdead=false;
    boolean isHit=false;
    BufferedImage pierceLaser;
    BufferedImage laser;
    int cd=0;
    public static int Speed = 4;
    public static int shipimage = 0;
    private static int dmgcounter=0;
	
    public Ship(int x, int y)
    {
    	super(x, y);
    	tm = new Timer(100, this);
    	autoduration = new Timer(10000, this);
    	setLaserImage();
    	score=0;
    	dmgcounter = 0;
    	
    }
    
	@Override
	public void Load() 
	{
		super.Load(SettingsMenu.names[shipimage][dmgcounter]+ ".gif");
	}

	@Override
	public void Update() 
	{
		if(health == 0){
			Audio.Stop();
			autoduration.stop();
			tm.stop();
			autofireon = false;
			isdead=true;
			
		}
		
		if(timestart == true)
		{}
		else
		{
			if(autofireon)
			{
				tm.start();
				autoduration.start();
			}
		}
		if(getX()>730)
		{
			setX(730);
		}
		if(getX() <0)
		{
			setX(0);
		}
	}

	@Override
	public void draw(Graphics g) 
	{
        g.drawImage(image, getX(),getY(),  null);
        g.setColor(Color.GREEN.brighter());
       
        
        if(gom.IsDebug())
		{
			Graphics2D g2d=(Graphics2D)g;
			g2d.draw(getArea());
		}
        
        g.setColor(Color.RED);
        
        if(cd!=0){
        	g.fillRect(0, 0, 1000, 1000);
        	cd--;
        }
	}
	
	public void setLaserImage()
	{
		try {
			pierceLaser = ImageIO.read(new File("Graphics/GameObjects/burst_icon.gif"));
			laser = ImageIO.read(new File("Graphics/GameObjects/laser1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public Rectangle getArea(){
		return new Rectangle(getX()+15,getY()+35, image.getWidth()-35, image.getHeight()-50);
	}
	
	@Override
	public void keyPressed(KeyEvent event) {
		
		switch(event.getKeyCode()){
		case KeyEvent.VK_SPACE:
			if(ammo > 0 && !autofireon && !PanelManager.isPaused)
			{
				if(piercinglasers > 0)
				{
					Laser l = new Laser(getX()+image.getWidth()-15, getY()+image.getHeight()-4, this, pierceLaser);
					gom.addObject(l);
					Laser l2 = new Laser(getX()-10, getY()+image.getHeight()-4, this, pierceLaser);
					gom.addObject(l2);
					ammo --;
					piercinglasers --;
				}
				else
				{
					Laser l = new Laser(getX()+image.getWidth()-10, getY()+image.getHeight()/2+5, this, laser);
					gom.addObject(l);
					Laser l2 = new Laser(getX(), getY()+image.getHeight()/2+5, this, laser);
					gom.addObject(l2);
					ammo --;
					piercinglasers = -1;
				}
			}
			break;
		case KeyEvent.VK_K:
			health = 0;
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e){}
	
	@Override
	public void onCollision(GameObject obj){			
		
		if(obj instanceof Meteor ){
				health--;
				cd=10;
				score-=100;
				Audio.Start("hit.wav");
		}
		if(obj instanceof AutoFirePower){
			if(autofireon == true){	
				autoduration.restart();
			}
				autofireon = true;
		}
		if(obj instanceof LaserPiercePower){
			Audio.Start("PowerUP.wav");
			piercinglasers = 5;
		}
		if(obj instanceof Ammo){
			if(ammo >= 6)
				ammo = 10;
			else
				ammo+= 5;
			Audio.Start("Reload.wav");
		}
		if(obj instanceof Life && health < 10)
			health++;
		switch(health){
			case(10):
				dmgcounter = 0;
				break;
			case(7):
				dmgcounter = 1;
				break;
			case(4):
				dmgcounter = 2;
				break;
			case(1):
				dmgcounter = 3;
				break;
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		if(e.getSource().equals(autoduration) && !isdead && !PanelManager.isPaused)
		{
			tm.stop();
			autoduration.stop();
			autofireon = false;
			timestart = false;
		}
		else if(e.getSource().equals(tm) && !isdead && !PanelManager.isPaused)
		{
				// TODO Auto-generated method stub
				Laser l = new Laser(getX()+image.getWidth()/2-3, getY()+image.getHeight()/2-12, this, laser);
				gom.addObject(l);
		}
	}//end actionperformed


@Override
public void keyTyped(KeyEvent e) {	
}


}

