package com.pLegacy;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.pLegacy.gameObjects.Meteor;
import com.pLegacy.gameObjects.Ship;


public class SettingsMenu extends JFrame {
	private JLabel Label1;
	private JLabel Label2;
	private JLabel Label3;
	private JLabel Label4;
	private JComboBox ShipSelect;
	private JLabel label;
	private JPanel Panel1;
	private JPanel Main;
	private JButton Done;
	public static final String[] namelist = {"Blue","Pink","Green"};
	public static final String[][] names =
			{	{"Blue","Blue2","Blue3","Blue4"},
				{"Pink","Pink2","Pink3","Pink4"},
				{"Green","Green2","Green3","Green4"} };

	
	public SettingsMenu(){
		super( "Settings");
		setLayout( new BorderLayout());
		Main = new JPanel();
		Main.setBackground(new Color(119,136,153));
		Main.setLayout( new GridLayout(8, 1)  );
	
		Done = new JButton("Done");
		Done.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                dispose();

            }
		});
		
		Font title = new Font("Lucida Fox", Font.BOLD, 18);
		Label1 = new JLabel("Settings", JLabel.CENTER);
		Label1.setFont(title);
		Label1.setForeground(Color.WHITE);
		
		Label2 = new JLabel("Ship Speed", JLabel.CENTER );
		Label3 = new JLabel("Asteroid Speed", JLabel.CENTER);
		Label2.setForeground(Color.WHITE);
		Label3.setForeground(Color.WHITE);	
		
		Label4 = new JLabel("Game Update Time", JLabel.CENTER);
		Label4.setForeground(Color.WHITE);
		
		ShipSelect = new JComboBox( namelist ); // set up JComboBox
		ShipSelect.setMaximumRowCount( namelist.length ); // display three rows
		ShipSelect.setSelectedItem(Ship.shipimage);

		
		ShipSelect.addItemListener(new ItemListener() // anonymous inner class
		{
			public void itemStateChanged( ItemEvent event )
			{
				// determine whether item selected
				if ( event.getStateChange() == ItemEvent.SELECTED ){
					label.setIcon(  new ImageIcon( "Graphics/GameObjects/" + names[ShipSelect.getSelectedIndex() ][0] + ".gif" ) ); 
					Ship.shipimage = ShipSelect.getSelectedIndex();
				}
			} // end method itemStateChanged
		});
		
		JSlider ShipSpeed = new JSlider(JSlider.HORIZONTAL, 1, 8, Ship.Speed);
		ShipSpeed.addChangeListener(new ChangeListener() {
		    public void stateChanged(ChangeEvent e) {
		        JSlider slider= (JSlider)e.getSource();
		        Ship.Speed = (int)slider.getValue();
		    }
		});
		
		JSlider AsteroidSpeed = new JSlider(JSlider.HORIZONTAL, 0, 5, Meteor.SpeedModifier);
		AsteroidSpeed.addChangeListener(new ChangeListener() {
		    public void stateChanged(ChangeEvent e) {
		        JSlider slider= (JSlider)e.getSource();
		        Meteor.SpeedModifier = (int)slider.getValue();
		    }
		});
		
		JSlider FPS = new JSlider(JSlider.HORIZONTAL, 1, 10, Test.milisecondtime);
		FPS.addChangeListener(new ChangeListener() {
		    public void stateChanged(ChangeEvent e) {
		        JSlider slider= (JSlider)e.getSource();
		        Test.milisecondtime = (int)slider.getValue();
		    }
		});
		
		//Turn on labels at major tick marks.
		ShipSpeed.setMajorTickSpacing(1);
		ShipSpeed.setPaintTicks(true);
		ShipSpeed.setPaintLabels(true);
		ShipSpeed.setOpaque(false);
		AsteroidSpeed.setMajorTickSpacing(1);
		AsteroidSpeed.setPaintTicks(true);
		AsteroidSpeed.setPaintLabels(true);
		AsteroidSpeed.setOpaque(false);
		FPS.setMajorTickSpacing(1);
		FPS.setPaintTicks(true);
		FPS.setPaintLabels(true);
		FPS.setOpaque(false);


		Main.add(Label1);
		Panel1 = new JPanel();	
		Panel1.add( ShipSelect ); // add combobox to JFrame	
		label = new JLabel( new ImageIcon( "Graphics/GameObjects/" + names[Ship.shipimage][0] + ".gif" ) ); // display first icon
		Panel1.add( label ); // add label to JFrame
		Panel1.setBackground(new Color(119,136,153));
		Main.add(Panel1);
		Main.add(Label2);
		Main.add(ShipSpeed);
		Main.add(Label3);
		Main.add(AsteroidSpeed);
		Main.add(Label4);
		Main.add(FPS);
		add(Main, BorderLayout.CENTER);
		add(Done, BorderLayout.SOUTH);
		
		//getContentPane().setBackground(new Color(119,136,153));  //Whatever color
	}

}
