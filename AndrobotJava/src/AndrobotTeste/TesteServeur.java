package AndrobotTeste;

import java.io.*;

import java.net.*;
import AndrobotReseau.ServeurThread;
public class TesteServeur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// args 0 : l'adresse locale en notation pointée
		// args 1 : le port local
		//InetSocketAddress sa = new InetSocketAddress(args[0],
		//Integer.parseInt(args[1]));
		
		InetSocketAddress sa = new InetSocketAddress("127.0.0.1", 1234);
		
		ServerSocket ss = null;
		try
		{
			
			ss = new ServerSocket();
			ss.bind(sa);
		} catch (IOException e) {}
		while (true)
		{

			try
			{
			Socket sock = ss.accept();
			ServeurThread serv = new ServeurThread(sock);
			System.out.println("vc");
			serv.start();
			} catch (IOException e) {}
		}

	}

}


