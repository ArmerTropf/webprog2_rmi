package rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICommands  extends Remote{

	int add (int a, int b)  throws RemoteException;
}
