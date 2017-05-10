package rmi.server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class RmiServer extends UnicastRemoteObject implements ICommands, Hello{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RmiServer() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String [] argv) throws RemoteException, AlreadyBoundException {
		
		LocateRegistry.createRegistry(1099);

		RmiServer obj = new RmiServer();
		
	    try {
			Naming.rebind("//localhost/RmiServer", obj);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    System.out.println( "Adder angemeldet" );

	}

	@Override
	public int add(int a, int b) throws RemoteException {
		
		return a + b;
	}

	@Override
	public String sayHello() throws RemoteException {
		
		return "Hello";
	}

	@Override
	public String Weiter() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
