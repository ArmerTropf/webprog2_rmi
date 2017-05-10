package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculate extends Remote{

	int add(int a, int b) throws RemoteException;
}
