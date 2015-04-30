import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;



public class Meteor extends GameObject
{
	public static int SpeedModifier = 0;
	Random generator = new Random();
	int speed;
	private int baseSpeed;
	private boolean isHit;
	private BufferedImage explode;
	int cd=0;
	
	
	public Meteor(int x, int y, BufferedImage img, int _baseSpeed)
	{
		super(x, y);
		isHit = false;
		setBaseSpeed(_baseSpeed);
		speed = generator.nextInt(4) + _baseSpeed;
		image=img;
		
		try {
			explode  = ImageIO.read(new File("Graphics/GameObjects/Explosion.png"));
		} catch (IOException e) {
			e.printStackTrace();
			
		}

		
	}

	@Override
	public void Load() 
	{
		//super.Load(Meteor2.gif);
	}

	@Override
	public void Update() 
	{
		if(getY() >= 600)
		{
			Unload();
		}
		
		setY(getY()+ speed + SpeedModifier*2);
	}

	@Override
	public void draw(Graphics g) 
	{
		g.drawImage(image, getX(), getY(), null);
		
		if(cd!=0){
			g.drawImage(explode,getX()+0,getY()+30,null);
			cd--;
			if(cd<=20)
				Unload();
		}
		
		if(gom.IsDebug())
		{
			Graphics2D g2d=(Graphics2D)g;
			g2d.draw(getArea());
		}
		//isHit=false;
	}

	@Override
	public Rectangle getArea()
	{
		//makes the contact area smaller. This way, you can move around more realistically and don't die
		//as soon as you hit a meter on your left and right!
			return new Rectangle(getX()+5,getY()+30, (int) (image.getWidth()-(image.getWidth()*.1)), (int) (image.getHeight()-(image.getHeight() * .5)));
	}
	
	@Override
	public void onCollision(GameObject obj) 
	{
		if(obj instanceof Ship)
			Unload();
		if(obj instanceof Laser && isHit == false)
		{
			isHit = true;
			Ship.score+=10;
			cd=30;
			Audio.Start("explode.wav");
		}
		
	}
	public void setBaseSpeed(int speed)
	{
		baseSpeed = speed;
	}
}
