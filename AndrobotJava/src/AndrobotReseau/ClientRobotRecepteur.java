package AndrobotReseau;

import java.net.*; import java.io.*;

public class ClientRobotRecepteur extends Thread
{
	private String adresse; 
	private String port;
	public ClientRobotRecepteur(String adrDistante, String portDistant)
	{
		super();
		this.adresse=adrDistante;
		this.port=portDistant;
	}
	
	
	@Override
	public void run()
	{
		super.run();
		InetSocketAddress sa = new InetSocketAddress(this.adresse,
				Integer.parseInt(this.port));
		try
		{
			Socket s=new Socket ();
			s.connect(sa);
			InputStream i= s.getInputStream();
			InputStreamReader ir = new InputStreamReader(i, "UTF-16");
			BufferedReader br = new BufferedReader(ir);
			System.out.println(br.readLine());
			s.close();
		}
		catch(Exception e){}
	}
}