package com.pLegacy;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;


public class HelpMenu extends GamePanel implements ActionListener, MouseMotionListener, MouseListener {

	//3 rectangles for the menu buttons
		private Rectangle2D Back;
		private  Timer t=new Timer(150,this);
				
		//theFont for the text in button
		int size=20;
		
		//a color that changes
		Color c=Color.YELLOW;
		Color b=Color.YELLOW;
		
		StartMenu cs;
		//our main Jframe
		JFrame mainFrame;
	
	public HelpMenu(JFrame f)
	{
		super(f);
		
		mainFrame=f;
			//add listeners
			addMouseMotionListener(this);
			addMouseListener(this);
		
				//creates all the images in the contructor
				
				 try {
					background =ImageIO.read(new File("Graphics/Background/texture1.jpg"));
					 
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 


				 t.start();
	}
	
	
	
	public void paintComponent(Graphics g)
	{
		
		super.paintComponent(g);
		g.drawImage(background,0,0,null);
		
			Graphics2D g2d=(Graphics2D)g;
				
			
						
			//#############################################################################
			//################### Buttons below, this way they appear on top always #######
			//#############################################################################
		
						//sets the font
						g2d.setFont(new Font("serif",Font.BOLD+Font.ITALIC,size));
						
						//renders the font so we can use the draw string method to draw cool text
							RenderingHints rh = new RenderingHints(
									RenderingHints.KEY_TEXT_ANTIALIASING,
									RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
							g2d.setRenderingHints(rh);
							
						g2d.setColor(Color.WHITE);
						
									//draws a new shappe with a border
									g2d.setStroke(new BasicStroke(3f));
									
						//sets color to the field color.
						g2d.setColor(c);
						
									//makes the 3 buttons
									Back=new Rectangle2D.Double(mainFrame.getWidth()/2.5 +350,10,140,50);

								
							//draws a button and then draws a string to describe the button
							g2d.fill(Back);
							g2d.setColor(Color.black);
							g2d.draw(Back);

							//the strings				
							g2d.drawString("BACK", mainFrame.getWidth()/2+300, 40);
	}//end paint

public void mouseMoved(MouseEvent e) {
	
	//change color when we hover over any particulr button
			if(Back.contains(e.getPoint()))
				c=Color.cyan.darker();
			else
				c=Color.yellow.brighter();	
}//end mousemoved


@Override
public void mouseClicked(MouseEvent e) 
{
	if(Back.contains(e.getPoint())){
		t.stop();
		PanelManager.MainMenu(this, true);
	}
}





//most methods not used. 
public void actionPerformed(ActionEvent e){
	repaint();
}	
	@Override
public void mouseDragged(MouseEvent e) {//no mouse dragged event
	}
	@Override
	public void mousePressed(MouseEvent e) {//no mouse pressed event
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {//no mouse released event
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		//no mouse entered event
	}



	@Override
	public void mouseExited(MouseEvent e) {
		//no mouse exited event
	}

}
