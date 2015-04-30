import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 
 * This class represents a game object. All objects in the game must inherit from this class.
 * The gom does NOT need to be in the constructor of the object.
 */


public abstract class GameObject 
{
	protected GameObjectManager gom; //Used to process the object through the GameObjectManager
	private int posx;
	private int posy;
	protected BufferedImage image;
	protected GamePanel screen;
	
	/**
	 * For objects that are interacted with on the main screen - player, enemies, etc.
	 * @param x
	 * @param y
	 */
	public GameObject(int x, int y)
	{
		setX(x);
		setY(y);
	}
	
	/**
	 * For objects that do not go through the gom update cycle.
	 */
	public GameObject(GamePanel gp, GameObjectManager _gom)
	{
		setX(-1);
		setY(-1);
		setPanel(gp);
		setGOM(_gom);
	}
	
	public void setX(int x)
	{
		posx = x;
	}
	
	public int getX()
	{
		return posx;
	}
	
	public void setY(int y)
	{
		posy = y;
	}
	
	public int getY()
	{
		return posy;
	}
	
	public void setPanel(GamePanel gp)
	{
		screen = gp;
	}
	/**
	 * Sets the gom reference for instance of object. 
	 */
	public void setGOM(GameObjectManager _gom)
	{
		gom = _gom;
	}
	
	public GameObjectManager getGOM()
	{
		return gom;
	}
	
	public Rectangle getArea()
	{
		return new Rectangle(getX(),getY(),image.getWidth(), image.getHeight());
	}
	
	public void Load(String _img)
	{
		try
		{
			image = ImageIO.read(new File("Graphics/GameObjects/" + _img));
		}
		catch(IOException exception)
		{
			System.err.println("No image.");
		}
		
	}
	
	public abstract void Load(); //Any content (pictures/graphics/etc.) are added here
	public abstract void Update(); //Updates the current state of the object
	
	public void Unload() //Removes any graphics/pictures/etc. when object is removed
	{
		gom.RemoveObject(this);
	}

	public abstract void draw(Graphics g); //Draws the object on the screen
	
	public abstract void onCollision(GameObject obj);
	
	
	
}
