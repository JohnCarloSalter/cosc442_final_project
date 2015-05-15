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
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class gameOver extends GamePanel{

	private Image over;
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		try {
			over=ImageIO.read(new File("Graphics/Background/owned.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Graphics2D g2=(Graphics2D)g;
		
		g2.drawImage(over, 0,0,null);
		
		int size=30;
		
		//sets the font
		g2.setFont(new Font("serif",Font.BOLD+Font.ITALIC,size));
		
		//renders the font so we can use the draw string method to draw cool text
		RenderingHints rh = new RenderingHints(
		RenderingHints.KEY_TEXT_ANTIALIASING,
		RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g2.setRenderingHints(rh);
		
		g2.setColor(Color.WHITE);
		
				
			//draws a new shappe with a border
			g2.setStroke(new BasicStroke(3f));
			
			
			g2.fill(new Rectangle2D.Double(260,200, 300, 200));
			g2.setColor(Color.black);
			
			g2.draw(new Rectangle2D.Double(260, 200, 300, 200));
		    g2.drawString("GAME OVER!",296, 300);
			
			g2.setFont(new Font("serif",Font.BOLD+Font.ITALIC,size-10));
			g2.drawString("press (r) to replay (q) to quit", 280,340);
			g2.setFont(new Font("serif",Font.BOLD+Font.ITALIC,size));
			g2.drawString("SCORE: "+Ship.score, 310, 250);		
	
				
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
