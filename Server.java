package net.ukr.geka3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	int numConnect = 0;
	ServerSocket ss;
	Socket soc;
	int n = 0;
	String info = Info.getSysInfo(); 

	public void start() {
		try {
			ss = new ServerSocket(12346);
			
			for (;;) {
				soc = ss.accept();
				n++;
				new ServerThread(soc,info,n);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		

	}

}
