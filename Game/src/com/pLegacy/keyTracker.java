package com.pLegacy;


//PLEASE READ:

	/*  Using this class will allow you to interact with keys without using keyListeners
	 *  
	 * This class is mainly used for games that uses keys
	 * Feel free to use it
	 * It is created by KLD and I got the idea from Slick 
	 * ###############################################################
	 * Three main methods were created : 
	 * keyIsDown(int keyCode), keyIsClicked(int keyCode), keyIsUp(int keyCode) : boolean
	 * #########################3#####################################
	 * One additional function is also provided which is : setListener(Component c): void
	 * 
	 */
	


import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class keyTracker implements KeyListener {

	
	private static boolean[] thePressedKey;
	
	
	
	public keyTracker(Component j) {
		this();
		j.addKeyListener(this);
		
	}
	public keyTracker() {
		//400 is just a random number. You could replace it with any other big number.  
		thePressedKey = new boolean[400];
		
		
		//Initializing 
		for (int i = 0; i < 400; i++) {
			thePressedKey[i] = false;
			
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (!thePressedKey[e.getKeyCode()])
			

		thePressedKey[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		thePressedKey[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//do nothing
	}

	
	
	//Returns true with is key is down and false with the key is up. 
	//This method is usable for motion in games
	public boolean keyIsDown(int keyCode) {
		return thePressedKey[keyCode];
	}
	//Returns true with is key is up and false with the key is down. 
	public boolean keyIsUp(int keyCode) {
		return !thePressedKey[keyCode];
	}

	
	//This method returns true only the first time the key is hit.
	//It's useful when you what to play a sound with a key
	
	//You can use this method to add Listener
	 public void addKeyListenerTo(Component j){
		 j.addKeyListener(this);
	 }
	
}
