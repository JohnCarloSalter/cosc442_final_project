package com.pLegacy;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Scanner;

import javax.imageio.ImageIO;


public class HighScores extends GamePanel implements MouseListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int size=26;
	boolean increasing=true;
	
	
	public static ArrayList<Integer> SortedScores;//new ArrayList<Integer>();
	public Formatter input;
	private Rectangle2D back;

	private BufferedImage scores;
	
	public HighScores(){
		addMouseListener(this);
		setBackground(Color.black);
		writeEmptyScores();
		readScores();
		//sortScore();
		Audio.StartMusic("infoMusic.wav");
		
		try {
			scores  = ImageIO.read(new File("Graphics/Background/HighScoresBack.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
	
	
	
	public static void readScores(){
		
		try {
			SortedScores=new ArrayList<Integer>();
		    Scanner in = new Scanner(new FileInputStream(new File("Scores.txt")));
		    
		    //SortedScores.removeAll(SortedScores);
		    while(in.hasNext())
		    	SortedScores.add(Integer.parseInt(in.nextLine()));   
		    
		   
		    
		    in.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		sortScore();
	}
	
	
	//sorts in ascending order and reverses array so highest is at the top
	public static void sortScore(){
		
		Collections.sort(SortedScores);
		Collections.reverse(SortedScores);
		//reverse the array
		
		
		
		
	}
	
	//writes scores once game is over.
	public static void writeScores(){
		try {
		    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Scores.txt", true)));
		    out.println(Ship.score);
		    out.close();
		} catch (IOException e) {
		    //oh noes!
		}
	}
	
	public static void writeEmptyScores(){
		try {
		    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Scores.txt", true)));
		    out.println("0");
		    out.close();
		} catch (IOException e) {
		    //oh noes!
		}
	}
	
	//paints the highScores screen, very ugly for now
	public void paintComponent(Graphics g)
	{
		
			super.paintComponent(g);
			g.drawImage(scores,0,0,null);
			g.drawImage(background,3,0,null);
			
			Graphics2D g2d=(Graphics2D)g;
				
			g2d.setFont(new Font("serif",Font.BOLD+Font.ITALIC,size));
			
						//renders the font
						RenderingHints rh = new RenderingHints(
								RenderingHints.KEY_TEXT_ANTIALIASING,
								RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
						g2d.setRenderingHints(rh);
							
			g2d.setColor(Color.WHITE);
			
			back=new Rectangle2D.Double(310,450,140,50);
			
			g2d.fill(back);
			g2d.setColor(Color.RED);
			g2d.draw(back);
			
			g2d.drawString("BACK", 335,479);
			
			g2d.setColor(Color.yellow);
			
			//draws a new shappe with a border
			g2d.setStroke(new BasicStroke(5f));
			g2d.drawString("HIGH SCORES",300,50);
			
			for(int i=0; i<SortedScores.size(); i++)
				if(i<4)
					g2d.drawString(String.valueOf(SortedScores.get(i)), 350, 100+i*100);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(back.contains(e.getPoint()))
			PanelManager.MainMenu(this, false);
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
