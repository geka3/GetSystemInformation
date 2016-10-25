package net.ukr.geka3;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable {

	Socket soc;
	String info;
	int num;

	public ServerThread(Socket soc, String info, int num) {
		super();
		this.soc = soc;
		this.info = info;
		this.num = num;

		Thread t = new Thread(this);
		t.start();
	}

	public ServerThread() {
		super();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try (PrintWriter pw = new PrintWriter(soc.getOutputStream())) {

			pw.write("num connection is " + num + System.lineSeparator() + info);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
