package laba05;

import java.net.*;
import java.io.*;
import java.util.*;

public class Server {
	public static void main(String[] args) throws IOException {
		Socket socket = null;
		Scanner scan = new Scanner(System.in);
		try {
			@SuppressWarnings("resource")
			ServerSocket server = new ServerSocket(8030);
			System.out.println("My IP: " + InetAddress.getLocalHost());
			socket = server.accept();
			PrintStream ps = new PrintStream(socket.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			String msg = "";
			while (!msg.equals("exit")) {
				System.out.print("< ");
				msg = scan.nextLine();
				ps.println(msg);
				ps.flush();
				msg = br.readLine();
				System.out.println("> " + msg);
			}
			ps.close();
		} catch (IOException e) {
			System.out.println("Error: " + e);
		} 
	}
}