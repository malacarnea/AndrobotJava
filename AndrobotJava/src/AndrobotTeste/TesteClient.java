package AndrobotTeste;

import java.awt.Color;
import java.io.*;
import java.net.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.JLabel;

import AndrobotReseau.*;

public class TesteClient 

{

		/**
		 * @param args
		 */
		public static void main(String[] args)
		{
			//InetSocketAddress sa = new InetSocketAddress(args[0],
					//Integer.parseInt(args[1]));
			
//			InetSocketAddress sa = new InetSocketAddress("127.0.0.1", 1234);		
//					try
//					{
//						System.out.println("client");
//						Socket s = new Socket();
//						s.connect(sa);
//						InputStream i = s.getInputStream();
//						InputStreamReader ir = new InputStreamReader(i, "UTF-16");
//						BufferedReader br = new BufferedReader(ir);
//						System.out.println(br.readLine());
//						s.close();
//					}catch (Exception e) {}
//					try {Thread.sleep(5000);} catch (InterruptedException e) {}
			
			
		    
//		    try
//		    {
//		    	System.out.println("teste");
//		    	/** Accès au toolkit : */
//		    	java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
//		    	/** lecture de l'image : */
//		    	Image image = toolkit.getImage("avion.bmp");
//		    	
////		    	File fich=new File ("avion.bmp");
////		    	
////		    	BufferedImage img = ImageIO.read(fich);
//		    	System.out.println("teste");
		    	//création fenetre
		    	JFrame fenetre = new JFrame();
		    	fenetre.getContentPane().add(new AfficheImage());
		    	//Définit un titre pour notre fenêtre
			    fenetre.setTitle("Ma première fenêtre Java");
			    //Définit sa taille : 730 pixels de large et 348 pixels de haut
			  //  fenetre.setSize(730, 348);
			    //Nous demandons maintenant à notre objet de se positionner au centre
			    fenetre.setLocationRelativeTo(null);
			
			    
			    fenetre.pack();
			 
			    //Termine le processus lorsqu'on clique sur la croix rouge
			    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    fenetre.setVisible(true);
//		    }catch (IOException e) {
//				e.printStackTrace();		
//		    }

		}
	}
