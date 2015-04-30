import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class PLegacy 
{
	public static Image icon;
	
	public static void main(String[] args) {
		
		//calls the makeIcon method to set the frame icon
		PLegacy p=new PLegacy();
		p.makeIcon();
		
		//Normal code as follows
		JFrame frame = new JFrame("Project Legacy");
		frame.setLocation(260, 59);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(icon);//sets the icon
		GameObjectManager gom = new GameObjectManager();
		PanelManager.SetGOM(gom);
		keyTracker k = new keyTracker();
		k.addKeyListenerTo(frame);
		//testing startmenu
		PanelManager.SetFrame(frame);
		PanelManager.MainMenu();
		frame.setSize(800,600);
		frame.setResizable(false);
		frame.setVisible(true);

		
		
		
	}
	//makes an image
	public void makeIcon(){
		 ImageIcon co = new ImageIcon("Graphics/GameObjects/Meteor.gif");
		 icon = co.getImage();
	}
}
