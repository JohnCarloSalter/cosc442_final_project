package com.pLegacy;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class gamePaused extends GamePanel{

	
	private Image pause;

	public gamePaused(){
		setBackground(Color.white);
	}

	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D)g;
		int size=30;
		
		try {
			pause  = ImageIO.read(new File("Graphics/Menu/pause.gif"));
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		//sets the font
		g2.setFont(new Font("serif",Font.BOLD+Font.ITALIC,size));
		
		//renders the font so we can use the draw string method to draw cool text
		RenderingHints rh = new RenderingHints(
		RenderingHints.KEY_TEXT_ANTIALIASING,
		RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g2.setRenderingHints(rh);
		
		g2.setColor(Color.WHITE);
		
		g2.drawImage(pause, 150,0,null);
		
			//if(PanelManager.isPaused==true){
				//draws a new shappe with a border
				g2.setStroke(new BasicStroke(3f));
				
				g2.fill(new Rectangle2D.Double(260,300, 300,60));
				g2.setColor(Color.black);
				
				g2.draw(new Rectangle2D.Double(260, 300, 300, 60));
			    g2.drawString("PAUSED!",340, 325);
				
				g2.setFont(new Font("serif",Font.BOLD+Font.ITALIC,size-10));
				g2.drawString("press (r) to resume", 310,348);
				
				
		//}
				
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
