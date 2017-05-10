package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Hello, ICalculate  {
	public Server() {
	}

	public String sayHello() {
		return "Hello, world!";
	}
	
	@Override
	public String Weiter() throws RemoteException {
		// TODO Auto-generated method stub
		return "nichts";
	}
	
	@Override
	public int add(int a, int b) {
		
		return a + b;
	}

	public static void main(String args[]) {
		//System.setProperty("java.rmi.server.hostname","192.168.56.1");
		try {
			Server obj = new Server();
			Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);
			ICalculate cal = (ICalculate) UnicastRemoteObject.exportObject(obj, 1);

			
			// Bind the remote object's stub in the registry
			//Registry registry = LocateRegistry.getRegistry();
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.bind("Hello", stub);
			registry.rebind("Cal", cal);

			System.err.println("Server ready");
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}

	

	

}