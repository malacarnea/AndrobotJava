package AndrobotReseau;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AfficheImage  extends JPanel {
	
		private static final long serialVersionUID = 1L;
		Image img;
		
		public AfficheImage() {
			super();
			try {
				System.out.println("marre");
				img = ImageIO.read(new File("avion.gif"));
				
			}
			catch(IOException exc) {
				exc.printStackTrace();
			}
			setPreferredSize(new Dimension(200, 200));
			setBackground(Color.WHITE);
		}


		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
		}
}


