import java.awt.Graphics;


public class Life extends GameObject
{
	public Life(int x, int y)
	{
		super(x, y);
	}
	@Override
	public void Load() {
		// TODO Auto-generated method stub
		super.Load("heart.gif");
	}
	
	 public void startSound()
	    {
	    	
	    	Audio.Start("Pop.wav");

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
	}

	@Override
	public void onCollision(GameObject obj) 
	{
		// TODO Auto-generated method stub
		if(obj instanceof Ship)
		{
			startSound();
			Unload();
		}
		
	}

}
