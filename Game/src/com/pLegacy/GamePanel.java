package com.pLegacy;


import java.awt.event.ActionListener;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Image;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.pLegacy.gameObjects.Ship;


/**
 * @author Kevin
 * Parent class to all panels in the game.
 */
public abstract class GamePanel extends JPanel implements ActionListener 
{
	protected Image background;
	protected Image foreground;
	public keyTracker k = new keyTracker();
	public GameObjectManager gom;
	protected Ship ship;
	JFrame ff;
		/**
		 * For panels that act as menus.
		 * @param f
		 */
		public GamePanel(){
			//empty
		}
		public GamePanel(JFrame f)
		{
			//Implement more stuff here as needed
			ff = f;
		}
		
		/**
		 * For panels that represent actual game levels.
		 * @param f
		 * @param _gom
		 */
		public GamePanel(JFrame f, GameObjectManager _gom)
		{
			setGOM(_gom);
			ff = f;
		}
		
		public GamePanel(JFrame f, GameObjectManager _gom, Ship _ship)
		{
			setGOM(_gom);
			ff = f;
			ship = _ship;
		}
		
		public void setGOM(GameObjectManager _gom)
		{
			gom = _gom;
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
		}
		
		public int getScreenHeight()
		{
			return ff.getHeight();
		}
		
		public int getScreenWidth()
		{
			return ff.getWidth();
		}
		
		public abstract void actionPerformed(ActionEvent e);

}
