package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {

	protected CalculatorImpl() throws RemoteException{
		super();
	}
	
	public int square(int number) throws RemoteException{
		return number*number;
	}

}
