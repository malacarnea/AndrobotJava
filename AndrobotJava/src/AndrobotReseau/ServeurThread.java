package AndrobotReseau;

import java.io.*;
import java.net.*; 
import javax.swing.ImageIcon;

public class ServeurThread extends Thread
{
	private Socket s;
	public ServeurThread(Socket sock)
	{
		super();
		this.s = sock;
	}
	public void run()
	{
		System.out.println("Serveur start");
		OutputStream os = null;
		
		try {os = this.s.getOutputStream();}
		catch (IOException e){}
		OutputStreamWriter osw = null;
		try
		{
			osw = new OutputStreamWriter(os, "UTF-16");
			osw.write("Hello world !\n");
			osw.close(); 
			os.close();
		}catch (Exception e1){}
		try {this.s.close();}
		catch (IOException e) {}
	}


}
//ImageIcon ima=new ImageIcon("avion.bmp");
