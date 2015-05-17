package com.pLegacy;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

import com.pLegacy.gameObjects.GameObject;
import com.pLegacy.gameObjects.Laser;

/**
 * This class processes all of the game objects that will be added/removed/updated in the game.
 * Every game object must be instantiated with the GameObjectManager and be added to the current list.
 * There must only be 1 GOM object instantiated in the project.
 * @author Copyright JK Productions 2012
 */

public class GameObjectManager 
{
	private boolean DebugMode = false;
	//All objects currently on the game screen
	private ArrayList<GameObject> currentobjectlist = new ArrayList<GameObject>();
	//Objects to be added to the game screen. TEMPORARY object list - must be cleared after update
	private ArrayList<GameObject> objectstoadd = new ArrayList<GameObject>();
	
	//Objects to remove from the game screen TEMPORARY object list - must be cleared after update
	private ArrayList<GameObject> objectstoremove = new ArrayList<GameObject>();
	
	public GameObjectManager()
	{
		//transfer any other managers here
	}
	
	/**
	 * Adding an object to the GOM will automatically pass the gom reference to the object.
	 * @throws NullPointerException If attempting to add null object to GOM. Object must exist to be added to GOM.
	 */
	public void addObject(GameObject obj)
	{
		obj.setGOM(this); //Transfers gom reference to the object, in case the object needs to access other objects
		objectstoadd.add(obj); //Set object up to be added to current list. Won't be added until gom updates.
	}
	
	public void RemoveObject(GameObject obj)
	{
		objectstoremove.add(obj); //Set object up to be removed from current list. Won't be removed until gom updates.
	}
	
	public void Load()
	{
		for(GameObject _obj : currentobjectlist)
			_obj.Load();
	}
	
	/**
	 * The GOM must always be updating in order for objects to be processed.
	 */
	public void Update()
	{
		//Run through objects and update each one
		for(GameObject _obj : currentobjectlist)
		{
			try
			{
				for(GameObject _obj1 : currentobjectlist)
				{
					if(isColliding(_obj, _obj1))
					{

						_obj.onCollision(_obj1);
						
						if(_obj instanceof Laser)
							_obj1.onCollision(_obj);
					}
				}
			}
			catch(NullPointerException e)
			{
				e.printStackTrace();
			}
			_obj.Update();
		}
		
		//Run through objects to be removed and remove them from the current list
		for(GameObject _obj : objectstoremove)
		{
			currentobjectlist.remove(_obj);
			_obj = null;
		}
				
		//Run through objects to be added and add them to the current list
		for(GameObject _obj : objectstoadd)
		{
			currentobjectlist.add(_obj);
		}
				
		
		//Clear temporary object lists
		objectstoremove.clear();// Need this here. Cannot clear or remove a list in a For method
		objectstoadd.clear(); // Need this here. Cannot clear or remove a list in a For method
	}
	
	public void Unload()
	{
		for(GameObject _obj : currentobjectlist)
		{
			currentobjectlist.remove(_obj);
			_obj = null;
		} 
	}
	
	public void draw(Graphics g)
	{
		for(GameObject _obj : currentobjectlist)
			_obj.draw(g);
	}
	
	public int AmountOfCurrentObjects()
	{
		return currentobjectlist.size();
	}
	/**
	 * Checks if two objects are colliding with each other. Both references must not point to the same object
	 * in order to return true.
	 * @param a
	 * @param b
	 * @return
	 */
	public boolean isColliding(GameObject a, GameObject b)
	{
		return a.getArea().intersects(b.getArea()) && !(a.equals(b));
	}
	/*
	 * Allows debugging features to be toggled on and off for testing purposes.
	 */
	public void Debug()
	{
		if(DebugMode)
			DebugMode = false;
		else
			DebugMode = true;
	}
	
	public Boolean IsDebug()
	{
		return DebugMode;
	}
}
