package util.server;

public abstract class Server extends Thread {
	
	public abstract boolean startServer();
	public abstract boolean stopServer();
}
