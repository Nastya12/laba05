package laba05;

import java.net.*;

public class Main {
	public static void main(String[] args) {
		InetAddress myIP = null;
		InetAddress bsuIP = null;
		try {
			myIP = InetAddress.getLocalHost();
			System.out.println("My IP: " + myIP.getHostAddress());
			bsuIP = InetAddress.getByName("bsu.by");
			System.out.println("IP other: " + bsuIP.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		@SuppressWarnings("unused")
		byte[] ip = { (byte) 8, (byte) 8, (byte) 8, (byte) 8 };
	}
}