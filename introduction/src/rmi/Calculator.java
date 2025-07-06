package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote{
	int square(int number) throws RemoteException;
}